package AP.assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

public class DayCounterApp extends Application {
    private final DayCounter dayCounter;
    private final ArrayList<FamilyMemberStatus> familyMembers;
    private Stage primaryStage;
    private JournalStatusController statusController;

    public static void main(String[] args) {
        launch(args);
    }

    public DayCounterApp() {
        this.dayCounter = new DayCounter();
        this.familyMembers = new ArrayList<>();
        initializeFamilyMembers();
    }

    private void initializeFamilyMembers() {
        familyMembers.add(new FamilyMemberStatus("Susan", 80, 70, 70, 70));
        familyMembers.add(new FamilyMemberStatus("Robert", 80, 70, 70, 70));
        familyMembers.add(new FamilyMemberStatus("Gwen", 80, 70, 70, 70));
    }

    @Override
    public void start(Stage stage) {
        this.primaryStage = stage;
        try {
            showDayCounterScene();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDayCounterScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DayCounter.fxml"));
        Parent root = loader.load();

        DayCounterController controller = loader.getController();
        controller.setDayCounter(dayCounter);
        controller.setApp(this);
        controller.setPrimaryStage(primaryStage);

        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showJournalStoryScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("JournalStory.fxml"));
        Parent root = loader.load();

        JournalStoryController controller = loader.getController();
        controller.setApp(this);
        controller.setPrimaryStage(primaryStage);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void showHomeViewScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeView.fxml"));
        Parent root = loader.load();

        HomeViewController controller = loader.getController();
        controller.setApp(this);
        controller.setPrimaryStage(primaryStage);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    public void showJournalStatusScene() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("JournalStatus.fxml"));
        Parent root = loader.load();

        JournalStatusController controller = loader.getController();
        controller.setApp(this);
        controller.setPrimaryStage(primaryStage);

        this.statusController = controller;

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void nextDay() throws Exception {
        if (!dayCounter.isMaxDayReached()) {
            dayCounter.incrementDay();
            updateFamilyMembersStatus(); // Update family members' status for the new day
            showDayCounterScene(); // Update the scene for the next day
        } else {
            System.out.println("Day limit reached. Cannot increment further.");
            // Optionally, display an alert to the user
        }
    }

    private void updateFamilyMembersStatus() {
        for (FamilyMemberStatus member : familyMembers) {
            member.setHunger(member.getHunger() - 5);
            member.setThirst(member.getThirst() - 5);
            member.setMorale(member.getMorale() - 1);
            member.setHealth(member.getHealth() - 2);
        }
        if (statusController != null) {
            statusController.updateStatusBars();
        }
    }

    public ArrayList<FamilyMemberStatus> getFamilyMembers() {
        return familyMembers;
    }

    public DayCounter getDayCounter() {
        return dayCounter;
    }

    // New method to get formatted status
    public String getFormattedFamilyMembersStatus() {
        StringBuilder statusBuilder = new StringBuilder();
        for (FamilyMemberStatus member : familyMembers) {
            statusBuilder.append(member.getName()).append(" Health Value: ").append(member.getHealth()).append("/100\n");
            statusBuilder.append(member.getName()).append(" Hunger Value: ").append(member.getHunger()).append("/100\n");
            statusBuilder.append(member.getName()).append(" Thirst Value: ").append(member.getThirst()).append("/100\n");
            statusBuilder.append(member.getName()).append(" Morale Value: ").append(member.getMorale()).append("/100\n");
        }
        return statusBuilder.toString();
    }
}
