
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Practice extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane=new BorderPane();
		
		List<Label>list=new ArrayList<Label>();
		list.add(new Label("�޴�"));
		list.add(new Label("Ȩ"));
		list.add(new Label("�α���"));
		
		FlowPane flowPane=new FlowPane();
		flowPane.getChildren().addAll(list);
		flowPane.setHgap(100);
		flowPane.setPadding(new Insets(10,0,10,20));///top,right,bottom,left
		flowPane.setStyle("-fx-background-color : pink");
		borderPane.setTop(flowPane);
		
		FlowPane flowPaneLeft=new FlowPane();
		flowPaneLeft.setPrefWidth(90);
		flowPaneLeft.setStyle("-fx-background-color : #7ED2FF");
		Button button=new Button("�޴�����");
		flowPaneLeft.getChildren().add(button);
		borderPane.setLeft(flowPaneLeft);
		
		FlowPane flowPaneCenter=new FlowPane(new Button("������°�"));
		flowPaneCenter.setPrefWidth(90);
		flowPaneCenter.setStyle("-fx-background-color : #CEF279");
		borderPane.setCenter(flowPaneCenter);
		
		GridPane gridPane=new GridPane();
		gridPane.setStyle("-fx-background-color : #FAED7D");
		Button buttonId = new Button("���̵� �Է� : ");
		Button buttonPw = new Button("��й�ȣ �Է� : ");
		Button buttonLogin = new Button("�α���");
		
		buttonId.setPrefSize(120, 20);
		buttonPw.setPrefSize(120, 20);
		buttonLogin.setPrefSize(80, 50);
		
		gridPane.add(buttonId, 0, 0, 1, 1);
		gridPane.add(buttonPw, 0, 1,1,1);
		gridPane.add(buttonLogin, 1, 0, 1, 2);
		
		gridPane.setPadding(new Insets(20));
		borderPane.setRight(gridPane);
		
		FlowPane flowPaneBottom=new FlowPane(new Button("�ٴڱ�"));
		flowPaneBottom.setStyle("-fx-background-color : #AB4A12");
		flowPaneBottom.setAlignment(Pos.CENTER);
		borderPane.setBottom(flowPaneBottom);
		
		primaryStage.setTitle("����");
		primaryStage.setScene(new Scene(borderPane));
		primaryStage.show();
	}

}
