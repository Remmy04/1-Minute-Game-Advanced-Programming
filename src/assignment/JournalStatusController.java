package AP.assignment;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import java.util.HashMap;
import java.util.Map;

public class JournalStatusController {

    private DayCounterApp app;
    private Stage primaryStage;
    private Map<String, FamilyMemberStatus> familyMemberMap = new HashMap<>();

    @FXML
    private ImageView susanHealthBar;
    @FXML
    private ImageView susanHungerBar;
    @FXML
    private ImageView susanThirstBar;
    @FXML
    private ImageView susanMoraleBar;

    @FXML
    private ImageView robertHealthBar;
    @FXML
    private ImageView robertHungerBar;
    @FXML
    private ImageView robertThirstBar;
    @FXML
    private ImageView robertMoraleBar;

    @FXML
    private ImageView gwenHealthBar;
    @FXML
    private ImageView gwenHungerBar;
    @FXML
    private ImageView gwenThirstBar;
    @FXML
    private ImageView gwenMoraleBar;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
        System.out.println("PrimaryStage in JournalStatusController: " + primaryStage); // Debug statement
    }

    public void setApp(DayCounterApp app) {
        this.app = app;
        for (FamilyMemberStatus member : app.getFamilyMembers()) {
            familyMemberMap.put(member.getName(), member);
        }
        updateStatusBars();
    }

    @FXML
    private void handleCloseJournalStatusButton(ActionEvent event) {
        try {
            if (app != null) {
                app.showHomeViewScene();
            } else {
                System.out.println("App instance is null!"); // Debug statement
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleJournalStoryButton(ActionEvent event) {
        try {
            if (app != null) {
                app.showJournalStoryScene();
            } else {
                System.out.println("App instance is null!"); // Debug statement
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void updateStatusBars() {
        updateStatusBar(susanHealthBar, familyMemberMap.get("Susan").getHealth());
        updateStatusBar(susanHungerBar, familyMemberMap.get("Susan").getHunger());
        updateStatusBar(susanThirstBar, familyMemberMap.get("Susan").getThirst());
        updateStatusBar(susanMoraleBar, familyMemberMap.get("Susan").getMorale());

        updateStatusBar(robertHealthBar, familyMemberMap.get("Robert").getHealth());
        updateStatusBar(robertHungerBar, familyMemberMap.get("Robert").getHunger());
        updateStatusBar(robertThirstBar, familyMemberMap.get("Robert").getThirst());
        updateStatusBar(robertMoraleBar, familyMemberMap.get("Robert").getMorale());

        updateStatusBar(gwenHealthBar, familyMemberMap.get("Gwen").getHealth());
        updateStatusBar(gwenHungerBar, familyMemberMap.get("Gwen").getHunger());
        updateStatusBar(gwenThirstBar, familyMemberMap.get("Gwen").getThirst());
        updateStatusBar(gwenMoraleBar, familyMemberMap.get("Gwen").getMorale());
    }

    private void updateStatusBar(ImageView bar, int value) {
       
    }
}
