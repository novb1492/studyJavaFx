package new2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class quiz4 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label=new Label("values");
		label.setRotate(-90);
		label.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				label.setScaleX(1.5);
				label.setScaleY(1.5);
			}
		});
		
		Label label2=new Label("a label that needs to be wrapped");
		label2.setOnMouseEntered((data)->{
				label2.setScaleX(1.5);
				label2.setScaleY(1.5);

		});
		
		ImageView imageView=new ImageView("/img/search.png");
		
		imageView.setOnMouseEntered((data)->{
			imageView.setScaleX(1.5);
			imageView.setScaleY(1.5);
		});

		HBox hBox=new HBox();
		hBox.getChildren().addAll(imageView,label,label2);
		hBox.setSpacing(20);
		
	
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(hBox));
		primaryStage.show();
		
	}

}
