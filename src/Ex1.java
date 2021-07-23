
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label label=new Label("HELLO JAVAFX");
		label.setFont(new Font(20));
		
		Scene scene=new Scene(label,400,200);
		
		primaryStage.setTitle("kim javafx");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
