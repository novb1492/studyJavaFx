package new2;



import javafx.application.Application;
import javafx.geometry.Insets;
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
		
		label.setPrefSize(300, 30);
		label.setAlignment(Pos.CENTER);
		label.setPadding(new Insets(0, 0,0	, 100));
		//label.setGraphic(new ImageView("/img/quiz.jpg"));
		label.setWrapText(true);
		
		HBox hBox=new HBox();
		hBox.getChildren().add(label);
		hBox.setPrefSize(100, 200);
		hBox.setSpacing(10);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
	}

}
