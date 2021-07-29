package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class eventex1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label=new Label("click");
		label.setFont(new Font(30));
		label.setLayoutX(50);
		label.setLayoutY(50);
		
		//정석
		label.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				label.setScaleX(1.5);
				label.setScaleY(1.5);
			}
		});
		//람다식
		label.setOnMouseExited((data)-> {
				label.setScaleX(1);
				label.setScaleY(1);
		});
		AnchorPane anchorPane=new AnchorPane();
		anchorPane.getChildren().add(label);
		
		HBox hBox=new HBox();
		hBox.getChildren().add(anchorPane);
		
		primaryStage.setTitle("event");
		primaryStage.setScene(new Scene(hBox,500,300));
		primaryStage.show();
		
	}
}
