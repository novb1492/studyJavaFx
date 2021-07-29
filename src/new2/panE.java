package new2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class panE extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label label=new Label("press clcik");
		Pane pane2=new Pane();
		pane2.getChildren().add(label);
		
		Button button=new Button("click");
		button.setPrefSize(120, 50);
		
		button.setOnMousePressed((event)->{
			label.setText("clicking");
		});
		button.setOnMouseReleased((event)->{
			label.setText("press clcik");
		});
		
		DropShadow dropShadow=new DropShadow();
		
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, eventHandler->{
			button.setEffect(dropShadow);
		});
		/*button.setOnMouseEntered((event)->{
			button.setEffect(dropShadow);
		});
		button.setOnMouseExited((data)-> {
			button.setEffect(null);
		});*/
		
		
		Pane pane=new Pane();
		pane.getChildren().add(button);
		
		
		VBox vBox=new VBox(pane2,pane);
		vBox.setSpacing(30);
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(vBox,200,300));
		primaryStage.show();
	}

}
