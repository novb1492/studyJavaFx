


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageViewEx2 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		AnchorPane anchor = new AnchorPane();
		ImageView image1 = new ImageView("/img/smilerere.png");
		ImageView image2 = new ImageView("/img/smilerere.png");
		
		image2.setRotate(45);
		anchor.getChildren().add(image2);
		hb.getChildren().addAll(image1, image2);
		
		primaryStage.setTitle("ImageView");
		primaryStage.setScene(new Scene(hb, 400, 300));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
