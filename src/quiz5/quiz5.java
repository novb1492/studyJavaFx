package quiz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class quiz5 extends Application{

	private final String warrior="warrior";
	private final String magi="magi";
	private final String rogue="rogue";
	private final String warriorURL="/img/warrior.png";
	private final String magiwarriorURL="/img/magi.png";
	private final String roguewarriorURL="/img/Rogue.png";
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		getSystem getSystem=new getSystem();
		ImageView imageView=new ImageView("/img/L2Char.png");
		
		String[] jobs= {warrior,magi,rogue};
		String[] url2= {warriorURL,magiwarriorURL,roguewarriorURL};

		List<String>url=getSystem.geturls(url2);
		HashMap<String,ImageView>imageViews=getSystem.getImages(url, jobs);

		List<ToggleButton>buttons=getSystem.getToggleButtons(imageViews);

		HBox hBox=new HBox();
		hBox.getChildren().addAll(buttons);
		
		ImageView imageView5=new ImageView(warriorURL);
		imageView5.setFitWidth(30);
		imageView5.setFitHeight(35);
		ImageView imageView6=new ImageView(warriorURL);
		imageView6.setFitWidth(30);
		imageView6.setFitHeight(35);
		
		ToggleButton button4=new ToggleButton();
		button4.setGraphic(imageView5);
		ToggleButton button5=new ToggleButton();
		button5.setGraphic(imageView6);

		VBox vBox=new VBox();
		vBox.getChildren().addAll(hBox,button4,button5);
		vBox.setPadding(new Insets(80, 0, 0, 20));
		
		
		StackPane stack = new StackPane();
		stack.getChildren().addAll(imageView,vBox);
		vBox.setSpacing(50);
		
		
		
		primaryStage.setTitle("checkbox");
		primaryStage.setScene(new Scene(stack));
		primaryStage.show();
		
	}

}
