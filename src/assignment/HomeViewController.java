package AP.assignment;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class HomeViewController {
    private Stage primaryStage;
    private DayCounterApp app;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
        System.out.println("PrimaryStage in HomeViewController: " + primaryStage); // Debug statement
    }

    public void setApp(DayCounterApp app) {
        this.app = app;
    }

    @FXML
    private void handleJournalButton(ActionEvent event) {
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
}






    




