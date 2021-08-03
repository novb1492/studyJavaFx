package ex8;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginService {
	
	public void LoginProc(Parent root) {
	
		TextField idText = (TextField)root.lookup("#idText");
		PasswordField pwText = (PasswordField)root.lookup("#pwText");
		
		String id = idText.getText();
		String pw = pwText.getText();
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
	}

	public void RegisterOpenProc() {
		Stage registerStage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("registerForm.fxml"));
		
		Parent registerForm = null;
		try {
			registerForm = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addComboBox(registerForm);
		
		registerStage.setScene(new Scene(registerForm));
		registerStage.show();
		
		Controller control = loader.getController();
		control.setRegisterForm(registerForm);
		
	} 
	public void addComboBox(Parent registerForm) {
		ComboBox<String>comboBoxs=(ComboBox<String>) registerForm.lookup("#ageCombo");
		if(comboBoxs!=null) {
			comboBoxs.getItems().addAll("10","20","30","40");
		}
	}
}
