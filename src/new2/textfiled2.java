package new2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class textfiled2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField textField=new TextField();
		PasswordField pwd=new PasswordField();
		
		textField.setMaxSize(200, 30);
		pwd.setMaxSize(200, 30);
		textField.setText("id");
		
		VBox vBox=new VBox();
		vBox.setPadding(new Insets(50, 10, 10, 50));
		vBox.setSpacing(10);
		vBox.getChildren().addAll(textField,pwd);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(vBox));
		primaryStage.show();
		
	}

}
