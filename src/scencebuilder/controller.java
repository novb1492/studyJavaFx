package scencebuilder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;


public class controller implements Initializable {
	@FXML private Button button;
	@FXML private TextField id;
	@FXML private TextField pwd;
	@FXML private CheckBox rememberMe;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setDisable(true);
		id.textProperty().addListener((attribute, before, after)->{
			emthyCheck();
		});
		pwd.textProperty().addListener((attribute, before, after)->{
			emthyCheck();
		});
		button.setOnAction((event)->{buttonClick();});
		
	}
	
	public void buttonClick() {
		Alert alert=new Alert(AlertType.INFORMATION);
		mydb mydb=new mydb();
		String text="";
		if(id.getText().isEmpty()) {
			text="id���� �Է����ּ���";
		}else if(pwd.getText().isEmpty()) {
			text="pwd���� �Է����ּ���";
		}else {
			if(mydb.login(id.getText(), pwd.getText())) {
				text="����";
			}
		}
		alert.setContentText(text);
		alert.show();
		rememberMe();
	}
	public void emthyCheck() {
		if(id.getText().isEmpty()||pwd.getText().isEmpty()) {
			button.setDisable(true);
		}else {
			button.setDisable(false);
		}
	}
	public void rememberMe() {
		if(rememberMe.isSelected()) {
			pwd.clear();
			return;
		}
		id.clear();
		pwd.clear();
	}

}
