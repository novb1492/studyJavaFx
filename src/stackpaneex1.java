import java.awt.Color;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class stackpaneex1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stackPane=new StackPane();
		Rectangle rectangle=new Rectangle(100, 100);
		Label label=new Label("사각형 안에 텍스트");
		
		StackPane.setMargin(rectangle, new Insets(-70,0,0,0));
		StackPane.setMargin(label, new Insets(50,0,0,0));
		stackPane.getChildren().addAll(rectangle,label);
		
		primaryStage.setTitle("stackpane");
		primaryStage.setScene(new Scene(stackPane,300,200));
		primaryStage.show();
	}

}
