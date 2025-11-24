package AP.assignment;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class DayCounterController {
    private DayCounter dayCounter;
    private DayCounterApp app;
    private Stage primaryStage;

    @FXML
    private Text dayText;

    @FXML
    private Button closeDayCounterButton;
    @FXML
    private Button onEventCompleteButton;

    public DayCounterController() {
        System.out.println("DayCounterController constructor called"); // Debug statement
    }

    public void setDayCounter(DayCounter dayCounter) {
        this.dayCounter = dayCounter;
        updateDayText();
    }

    public void setApp(DayCounterApp app) {
        this.app = app;
        System.out.println("App instance set in DayCounterController: " + app); // Debug statement
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
        System.out.println("PrimaryStage in DayCounterController: " + primaryStage); // Debug statement
    }

    public void updateDayText() {
        dayText.setText("DAY " + dayCounter.getCurrentDay());
    }

    @FXML
    public void onEventComplete(ActionEvent event) throws Exception {
        if (app != null && primaryStage != null) {
            app.nextDay();
        } else {
            System.out.println("App or primaryStage is null!"); // Debug statement
        }
    }

    @FXML

private void handleCloseDayCounterButton(ActionEvent event) {
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

    }

