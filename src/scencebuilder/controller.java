package scencebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class controller implements Initializable {
	@FXML private Button button;
	@FXML private TextField id;
	@FXML private TextField pwd;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction((event)->{buttonClick();});
		
	}
	
	public void buttonClick() {
		System.out.println(id.getText());
	}
}
