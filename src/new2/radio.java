package new2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class radio extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton radioButton=new RadioButton("radio");
		RadioButton radioButton2=new RadioButton("radio");
		
		//라디오 하남나 선택가능
		ToggleGroup toggleGroup=new ToggleGroup();
		radioButton.setToggleGroup(toggleGroup);
		radioButton2.setToggleGroup(toggleGroup);
		
		HBox hBox=new HBox();
		hBox.getChildren().addAll(radioButton,radioButton2);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setSpacing(20);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

}
