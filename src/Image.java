import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Image extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane anchorPane=new AnchorPane();
		StackPane stackPane=new StackPane();
		BorderPane borderPane=new BorderPane();
		ImageView imageView=new ImageView("image/SmileReRe.png");
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
