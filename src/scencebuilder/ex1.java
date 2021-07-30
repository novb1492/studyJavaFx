package scencebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ex1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Ex1.fxml"));
		Scene scene =  new Scene(root);
		
		primaryStage.setTitle("Ex1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
