import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane=new BorderPane();
		
		ArrayList<Label>labels=new ArrayList<Label>();
		labels.add(new Label("메뉴"));
		labels.add(new Label("홈"));
		labels.add(new Label("로그인"));
		
		FlowPane flowTop=new FlowPane();
		flowTop.getChildren().addAll(labels);
		flowTop.setStyle("-fx-background-color:pink");
		flowTop.setPadding(new Insets(10, 0, 10, 60));
		flowTop.setHgap(100);
		borderPane.setTop(flowTop);
		
		FlowPane flowLeft=new FlowPane(new Button("메뉴나열"));
		flowLeft.setStyle("-fx-background-color:blue");
		flowLeft.setPrefWidth(90);
		
		borderPane.setLeft(flowLeft);
		
		FlowPane flowCenter=new FlowPane(new Button("내용 들어가는 곳"));
		flowCenter.setStyle("-fx-background-color:green");
		flowLeft.setPrefWidth(90);
		borderPane.setCenter(flowCenter);
		
		GridPane gridPane=new GridPane();
		gridPane.setStyle("-fx-background-color:yellow");
		
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(borderPane,1000,500));
		primaryStage.show();
		
	}
}
