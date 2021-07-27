package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class datePick extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DatePicker datePicker=new DatePicker();
		datePicker.setPrefSize(150, 20);
		datePicker.setLayoutX(10);
		datePicker.setLayoutX(10);
		AnchorPane anchorPane=new AnchorPane();
		
		anchorPane.getChildren().add(datePicker);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(anchorPane));
		primaryStage.show();
	}

}
