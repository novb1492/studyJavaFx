package scencebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class controller implements Initializable {
	@FXML private Button button;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction((event)->{
			System.out.println("버튼클릭");
		});
		
	}
	
}
