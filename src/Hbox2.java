import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Hbox2 extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rectangle=new Rectangle(400,100);
		Rectangle rectangle2=new Rectangle(400,100);
		Rectangle rectangle4=new Rectangle(233,233);
		
		HBox hBox=new HBox();
		hBox.setSpacing(10);
		hBox.setPadding(new Insets(10));
		hBox.getChildren().add(rectangle);
		
		HBox hBox2=new HBox();
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(10));
		hBox2.getChildren().add(rectangle2);
		
		VBox vBox=new VBox();
		vBox.setSpacing(10);
		vBox.getChildren().addAll(hBox,hBox2);
		
		HBox hBox3=new HBox();
		hBox3.setSpacing(10);
		hBox3.setPadding(new Insets(10));
		hBox3.getChildren().addAll(vBox,rectangle4);
		
		primaryStage.setScene(new Scene(hBox3));
		primaryStage.show();
	}
}
