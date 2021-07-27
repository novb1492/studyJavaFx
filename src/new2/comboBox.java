package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class comboBox extends Application {
	 public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ComboBox<String>comboBox=new ComboBox<String>();
		comboBox.getItems().addAll("멍","침대","축");
		comboBox.setValue("침대");
		
		HBox hBox=new HBox();
		hBox.getChildren().add(comboBox);
		
		primaryStage.setTitle("comboBox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}
}
