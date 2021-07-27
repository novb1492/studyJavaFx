


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageViewEx1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane stack = new StackPane();
		BorderPane border = new BorderPane();
		border.setBottom(new Label("스마일 이미지"));
		
		ImageView image = new ImageView("SmileReRe.jpg");
		stack.getChildren().addAll(image, border);

		primaryStage.setTitle("이미지");
		primaryStage.setScene(new Scene(stack ,300,200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
