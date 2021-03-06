import javafx.application.Application;
import javafx.geometry.Insets;
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


		Rectangle rectangle=new Rectangle(100,100);
		Rectangle rectangle2=new Rectangle(100,100);
		Rectangle rectangle3=new Rectangle(100,100);
		Rectangle rectangle4=new Rectangle(233,233);
		
		HBox hBox=new HBox();
		hBox.setSpacing(10);
		hBox.setPadding(new Insets(10));
		hBox.getChildren().addAll(rectangle,rectangle2,rectangle3);
		
		Rectangle rectangle5=new Rectangle(100,100);
		Rectangle rectangle6=new Rectangle(100,100);
		Rectangle rectangle7=new Rectangle(100,100);
		
		HBox hBox2=new HBox();
		
		hBox2.setPadding(new Insets(10));
		hBox2.setSpacing(10);
		hBox2.getChildren().addAll(rectangle5,rectangle6,rectangle7);
		
		VBox vBox=new VBox();
		vBox.setSpacing(10);
		vBox.getChildren().addAll(hBox, hBox2);
		
		HBox hBox3=new HBox();
		hBox3.setSpacing(10);
		hBox3.setPadding(new Insets(10));
		hBox3.getChildren().addAll(vBox, rectangle4);
		
		primaryStage.setScene(new Scene(hBox3));
		primaryStage.show();
		
	}
}
