
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex4 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//좌표로 배치
		AnchorPane anchorPane=new AnchorPane();
		//우;,아래,가운데 오른쪽,아래 영역으로 배치
		BorderPane borderPane=new BorderPane();
		//행단위 배치
		FlowPane flowPane=new FlowPane();
		//겹쳐서배치
		StackPane stackPane=new StackPane();
		//격자배치
		GridPane gridPane=new GridPane();
		//수평으로 나열
		HBox hBox=new HBox();
		//수직으로 나열
		VBox vBox=new VBox();
		
		//플로우
		List<Button>array=new ArrayList<Button>();
		for(int i=0;i<=15;i++) {
			array.add(new Button("버튼"+(i+1)));
			flowPane.getChildren().add(array.get(i));
		}
		
		flowPane.setVgap(80);//가로
		flowPane.setHgap(20);//세로
		
		Scene scene=new Scene(flowPane,1000,500);
		/*primaryStage.setTitle("flow");
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
		//그리드
		Button bu=new Button("버튼1");
		Button bu2=new Button("버튼2");
		Label label=new Label("label");
		Label label2=new Label("label2");
		
		GridPane.setConstraints(label, 0, 0);
		GridPane.setConstraints(label2, 0, 1);
		
		GridPane.setConstraints(bu,1, 0);
		GridPane.setConstraints(bu2, 1, 1);
		
		gridPane.getChildren().addAll(bu,bu2,label,label2);
		gridPane.setPadding(new Insets(20, 0, 0, 20));//상 우 하좌 top,right,botton,left
		gridPane.setVgap(20);
		gridPane.setHgap(40);
		
		FlowPane flowPane2=new FlowPane();
		flowPane2.getChildren().add(new Button("col1(0),row(2)"));
		flowPane2.setStyle("-fx-background-color:black");
		flowPane2.setAlignment(Pos.CENTER);
		gridPane.add(flowPane2,0,2,2,1);
		FlowPane flowPane3=new FlowPane();
		flowPane3.getChildren().add(new Button("col1(3),row(0)"));
		flowPane3.setStyle("-fx-background-color:pink");
		flowPane3.setPrefSize(100, 100);
	
		gridPane.add(flowPane3,3,0,2,1);
		
		
		
		scene=new Scene(gridPane,1000,500);
		primaryStage.setTitle("grid");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//보더
		Button[] button=new Button[5];
		String[] text= {"top","left","center","right","bottom"};
		
		for(int i=0;i<button.length;i++) {
			button[i]=new Button(text[i]);
		}
		borderPane.setTop(button[0]);
		borderPane.setLeft(button[1]);
		borderPane.setCenter(button[2]);
		borderPane.setRight(button[3]);
		borderPane.setBottom(button[4]);
		

		/*primaryStage.setTitle("border");
		primaryStage.setScene(new Scene(borderPane,1000,500));
		primaryStage.show();*/
	}
}
