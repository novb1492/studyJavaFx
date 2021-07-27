

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneEx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane anchor = new AnchorPane();
		
		String[] text = {"TOP", "RIGHT", "BOTTOM", "LEFT"};
		Button[] buttons = new Button[4];
		
		for(int i = 0; i < buttons.length; i++)
			buttons[i] = new Button(text[i]);
		
		AnchorPane.setTopAnchor(buttons[0], 10.0);
		AnchorPane.setRightAnchor(buttons[1], 20.0);
		AnchorPane.setBottomAnchor(buttons[2], 30.0);
		AnchorPane.setLeftAnchor(buttons[3], 40.0);
		
		anchor.getChildren().addAll(buttons[0], buttons[1],buttons[2],buttons[3]);
		
		primaryStage.setTitle("AnchorPane");
		primaryStage.setScene(new Scene(anchor, 300, 200));
		primaryStage.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
