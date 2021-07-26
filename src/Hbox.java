import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Hbox extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hBox=new HBox();

		Rectangle rectangle=new Rectangle(100,100);
		Rectangle rectangle2=new Rectangle(100,100);
		Rectangle rectangle3=new Rectangle(100,100);
		
		hBox.setSpacing(10);
		hBox.getChildren().addAll(rectangle,rectangle2);
		
		
		HBox hBox2=new HBox();

		hBox2.setSpacing(10);
		hBox2.getChildren().addAll(rectangle,rectangle2);
		
		VBox vBox=new VBox();
		vBox.setSpacing(10);
		
		vBox.getChildren().addAll(hBox,hBox2);
		primaryStage.setScene(new Scene(vBox));
		primaryStage.show();
		
	}
}
