package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class button extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button=new Button("¹öÆ°");
		button.setPrefSize(120, 100);
		Alert alert=new Alert(AlertType.INFORMATION);
		button.setOnAction((event)->{
			alert.setTitle("information");
			alert.setContentText("click");
			alert.show();
		});
		primaryStage.setTitle("button+alert");
		primaryStage.setScene(new Scene(button));
		primaryStage.show();
	}

}
