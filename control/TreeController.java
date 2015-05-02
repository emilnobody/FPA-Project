package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class TreeController implements Initializable{

    @FXML
    private TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String> root = new TreeItem<>("Folder");
        for(int i = 1; i < 6; ++i) {
            root.getChildren().add(new TreeItem<>("Subfolder " + i));
        }
        root.setExpanded(true);
        treeView.setRoot(root);
    }

}