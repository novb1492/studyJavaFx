package ex8;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;


public class Controller implements Initializable{
	private Parent loginForm;
	private Parent registerForm;
	
	private LoginService loginSvc;
	private RegisterService regSvc;
	private cancleService cancleService;
	
	public void setLoginForm(Parent loginForm) {
		this.loginForm = loginForm;
	}
	public void setRegisterForm(Parent registerForm) {
		this.registerForm = registerForm;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginSvc = new LoginService();
		regSvc = new RegisterService();
		cancleService=new cancleService();
	}
	public void LoginProc() {
		loginSvc.LoginProc(loginForm);
	}
	public void RegisterOpenProc() {
		loginSvc.RegisterOpenProc();
	}
	public void RegisterProc() {
		regSvc.RegisterProc(registerForm);
	}
	public void CancelProc(ActionEvent actionEvent) {
		cancleService.windowClose(actionEvent);
	}
	public void index() {
		System.out.println("index");
	}
}
