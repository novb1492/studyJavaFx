package new2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class checkbox extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CheckBox checkBox=new CheckBox("체크1");
		CheckBox checkBox2=new CheckBox("체크2");
		
		checkBox.setText("안녕");
		checkBox.setSelected(true);
		VBox vBox=new VBox();
		vBox.getChildren().addAll(checkBox,checkBox2);
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10, 10, 10, 10));
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(vBox));
		primaryStage.show();
		
		
	}
}
