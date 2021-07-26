
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
import javafx.stage.Stage;

public class Quiz1 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		
		/* TOP */
		ArrayList<Label> label = new ArrayList<Label>();
		label.add(new Label("�޴�"));
		label.add(new Label("Ȩ"));
		label.add(new Label("�α���"));
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().addAll(label);
		flowTop.setStyle("-fx-background-color : pink");
		flowTop.setPadding(new Insets(10, 0, 10, 60));
		flowTop.setHgap(100);
		border.setTop(flowTop);
	
		/* Left */
		FlowPane flowLeft = new FlowPane(new Button("�޴� ����"));
		flowLeft.setStyle("-fx-background-color : #7ED2FF");
		flowLeft.setPrefWidth(90);
		border.setLeft(flowLeft);
		
		/* Center */
		FlowPane flowCenter = new FlowPane(new Button("���� ���� ��"));
		flowCenter.setStyle("-fx-background-color : #CEF279");
//		flowCenter.setPrefWidth(90);
		border.setCenter(flowCenter);
		
		/* Right */
		GridPane gridRight = new GridPane();
		gridRight.setPadding(new Insets(20));
		gridRight.setStyle("-fx-background-color : #FAED7D");
		Button buttonId = new Button("���̵� �Է� : ");
		Button buttonPw = new Button("��й�ȣ �Է� : ");
		Button buttonLogin = new Button("�α���");
		buttonId.setPrefSize(120, 20);
		buttonPw.setPrefSize(120, 20);
		buttonLogin.setPrefSize(80, 50);
		
		gridRight.add(buttonId, 0, 0, 1, 1);
		gridRight.add(buttonPw, 0, 1, 1, 1);
		gridRight.add(buttonLogin, 1, 0, 1, 2);
		border.setRight(gridRight);
		
		/* Bottom */
		FlowPane flowBottom = new FlowPane(new Button("�ٴڱ�"));
		flowBottom.setStyle("-fx-background-color : #AB4A12");
		flowBottom.setAlignment(Pos.CENTER);
		border.setBottom(flowBottom);
		
		primaryStage.setTitle("Quzi1");
		primaryStage.setScene(new Scene(border, 450, 200));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}
}
