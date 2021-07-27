package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class textare  extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea textArea=new TextArea();
		textArea.setPrefSize(100, 100);
		
		AnchorPane anchorPane=new AnchorPane();
		anchorPane.getChildren().add(textArea);
		anchorPane.setPrefSize(300, 200);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(anchorPane));
		primaryStage.show();
	}
}
