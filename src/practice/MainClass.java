package practice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		/* loginForm.fxml의 load()가 실행 되면 ex7.Controller.java를 객체로 생성. */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		Parent root = loader.load();
		
		primaryStage.setTitle("EX7");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		/* loginForm.fxml에서 생성한 객체를 getController() 갖고 온다. */
		Controller control = loader.getController();
		/* loginForm.fxml의 화면객체를 Controller로 전달 */
		control.setLoginForm(root);
	}

}
