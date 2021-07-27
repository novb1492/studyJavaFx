

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneEx2 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
		Rectangle rec = new Rectangle(100, 100, Color.RED);
		Label label = new Label("사각형 안에 텍스트");
		
		StackPane.setMargin(rec, new Insets(-70,0,0,0));
		StackPane.setMargin(label, new Insets(50,0,0,0));
		stack.getChildren().addAll(rec, label);
		
		primaryStage.setTitle("StackPane");
		primaryStage.setScene(new Scene(stack, 300, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
