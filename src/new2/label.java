package new2;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class label extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label=new Label("label");
		
		label.setPrefSize(200, 30);
		label.setAlignment(Pos.CENTER);
		label.setGraphic(new ImageView("/img/quiz.jpg"));

		HBox hBox=new HBox();
		hBox.getChildren().add(label);
		hBox.setPrefSize(300, 200);
		hBox.setSpacing(10);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

}
