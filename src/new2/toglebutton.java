package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class toglebutton extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ToggleButton toggleButton=new ToggleButton();
		ToggleButton toggleButton2=new ToggleButton();
		
		toggleButton.setGraphic(new ImageView("img/magi.png"));
		toggleButton2.setGraphic(new ImageView("img/Rogue.png"));
		
		HBox hBox=new HBox();
		hBox.getChildren().addAll(toggleButton,toggleButton2);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

}
