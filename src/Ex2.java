import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex2 extends Application {
	
	
	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label=new Label("HELLO JAVAFX");
		label.setFont(new Font(20));
		
		Scene scene=new Scene(label,300,200);
		
		primaryStage.setTitle("first window");
		primaryStage.setScene(scene);
		primaryStage.setX(900);
		primaryStage.setY(600);
		primaryStage.show();
		
	}
			
}
