package practice;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;



public class Controller implements Initializable{
	private Parent loginForm;
	private Parent registerForm;
	private loginService loginService;
	private regsisService regsisService;
	
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	public void setRegisterForm(Parent registerForm) {
		this.registerForm = registerForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 loginService=new loginService();
		 regsisService=new regsisService();
		 
	}
	public void LoginProc() {
		loginService.login();
	}
	public void RegisterOpenProc() {
		loginService.RegisterOpenProc();
	}
	public void RegisterProc() {
		regsisService.RegisterProc(registerForm);
	}
	public void CancelProc(ActionEvent actionEvent) {
		
	}
}
