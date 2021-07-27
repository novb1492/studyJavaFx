import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
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
			
			List<Label>list=new ArrayList<Label>();
			list.add(new Label("메뉴"));
			list.add(new Label("홈"));
			list.add(new Label("로그인"));
			
			FlowPane flowPane=new FlowPane();
			flowPane.getChildren().addAll(list);
			flowPane.setHgap(100);
			flowPane.setPadding(new Insets(10,0,10,20));///top,right,bottom,left
			flowPane.setStyle("-fx-background-color : pink");
			borderPane.setTop(flowPane);
			
			ListView<String>listLeft=new ListView<String>();
			listLeft.getItems().addAll("itme1","item2","item3");
			listLeft.setMaxSize(90, 100);
			//AnchorPane anchorPane=new AnchorPane();
			//anchorPane.getChildren().add(listLeft);
			
			//FlowPane flowPaneleft=new FlowPane();
			//flowPaneleft.getChildren().add(anchorPane);
			borderPane.setLeft(listLeft);
			
			FlowPane flowPaneCenter=new FlowPane(new Button("내용들어가는곳"));
			flowPaneCenter.setPrefWidth(90);
			borderPane.setCenter(flowPaneCenter);
			
			GridPane gridPane=new GridPane();
			Button buttonId = new Button("아이디 입력 : ");
			Button buttonPw = new Button("비밀번호 입력 : ");
			
			Button buttonLogin = new Button("로그인");
			
			buttonId.setPrefSize(120, 20);
			buttonPw.setPrefSize(120, 20);
			buttonLogin.setPrefSize(80, 50);
			
			gridPane.add(buttonId, 0, 0, 1, 1);
			gridPane.add(buttonPw, 0, 1,1,1);
			gridPane.add(buttonLogin, 1, 0, 1, 2);
			
			gridPane.setPadding(new Insets(20));
			borderPane.setRight(gridPane);
			
			FlowPane flowPaneBottom=new FlowPane(new Button("바닥글"));
			flowPaneBottom.setAlignment(Pos.CENTER);
			borderPane.setBottom(flowPaneBottom);
			
			StackPane stack = new StackPane();

			ImageView image = new ImageView("img/quiz.jpg");
			stack.getChildren().addAll(image,borderPane);
		
			 
			primaryStage.setTitle("연습");
			primaryStage.setScene(new Scene(stack));
			primaryStage.show();
		}
		
	
}
