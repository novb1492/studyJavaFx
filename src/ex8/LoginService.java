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
	
	private registerDao registerDao=new registerDao();
	
	public void LoginProc(Parent root) {
		System.out.println("login시도");
		TextField idText = (TextField)root.lookup("#idText");
		PasswordField pwText = (PasswordField)root.lookup("#pwText");
		
		String id = idText.getText();
		String pwd = pwText.getText();
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pwd);
		
		if(checkLogin(id,pwd)) {
			System.out.println("로그인완료");
			showIndex(root);
		}else {
			System.out.println("회원정보가 일치 하지 않습니다");
		}
	}
	public void showIndex(Parent root) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("index.fxml"));
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stage stage=new Stage();
		stage.setTitle("EX7");
		stage.setScene(new Scene(root));
		stage.show();
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
	public boolean checkLogin(String id,String pwd) {
		registerDto registerDto=registerDao.selectId(id);
		if(registerDto!=null) {
			if(registerDto.getPwd().equals(pwd)) {
				return true;
			}
		}
		return false;
	}
}
