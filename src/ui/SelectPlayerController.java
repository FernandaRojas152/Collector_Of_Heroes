package ui;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SelectPlayerController{
	@FXML
    private Pane pane;

    @FXML
    private HBox tab;

    @FXML
    private Label player;

    @FXML
    private Label text;
    
    @FXML
    public void initialize() {
    	
    }
    
	@FXML
    void close(MouseEvent event) {
    	Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
    	stage.close();
    }
}
