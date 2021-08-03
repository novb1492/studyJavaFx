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
		/* loginForm.fxml�� load()�� ���� �Ǹ� ex7.Controller.java�� ��ü�� ����. */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		Parent root = loader.load();
		
		primaryStage.setTitle("EX7");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		/* loginForm.fxml���� ������ ��ü�� getController() ���� �´�. */
		Controller control = loader.getController();
		/* loginForm.fxml�� ȭ�鰴ü�� Controller�� ���� */
		control.setLoginForm(root);
	}

}
