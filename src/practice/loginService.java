package practice;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginService {
	public void RegisterOpenProc() {
		Stage stage=new Stage();
		FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("registerForm.fxml"));
		Parent parent=null;
		try {
			parent=fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stage.setScene(new Scene(parent));
		stage.show();
		
		Controller controller=fxmlLoader.getController();
		controller.setRegisterForm(parent);
		
	}
}
