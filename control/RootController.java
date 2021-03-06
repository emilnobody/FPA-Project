package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author X3phiroth
 */
public class RootController implements Initializable {

    @FXML
    private MenuItem menu_Exit;
    @FXML
    private MenuItem menu_Path;
    @FXML
    private MenuItem menu_Filter;
    @FXML
    private MenuItem menu_About;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        menu_Exit.setOnAction((e) -> exit());
        menu_Path.setOnAction((e) -> setBasePath());
        menu_Filter.setOnAction((e) -> setFilter());
        menu_About.setOnAction((e) -> about());
    }

    private void exit() {
        System.out.println("Close mail client...");
        System.exit(0);
    }

    private void setBasePath() {
        System.out.println("Set base path...");
//        Stage stage = new Stage();
//        stage.setTitle("Base Path");
//        stage.setResizable(false);
        
        
    }

    private void setFilter() {
        System.out.println("Set filter...");
    }

    private void about() {
        try {
            System.out.println("About...");
            Stage stage = new Stage(StageStyle.UTILITY);
            stage.setTitle("About");
            stage.setResizable(false);
            Pane pane = FXMLLoader.load(getClass().getResource("../view/about.fxml"));
            Button button = new Button("OK");
            button.setStyle("-fx-padding: 8 25 8 25");
            button.setLayoutX(300);
            button.setLayoutY(200);
            button.setOnAction((e) -> {
                Stage temp = (Stage) button.getScene().getWindow();
                temp.close();
            });
            pane.getChildren().add(button);
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(RootController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}