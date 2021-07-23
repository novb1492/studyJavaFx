
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
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
		//��ǥ�� ��ġ
		AnchorPane anchorPane=new AnchorPane();
		//��;,�Ʒ�,��� ������,�Ʒ� �������� ��ġ
		BorderPane borderPane=new BorderPane();
		//����� ��ġ
		FlowPane flowPane=new FlowPane();
		//���ļ���ġ
		StackPane stackPane=new StackPane();
		//���ڹ�ġ
		GridPane gridPane=new GridPane();
		//�������� ����
		HBox hBox=new HBox();
		//�������� ����
		VBox vBox=new VBox();
		
		//�÷ο�
		List<Button>array=new ArrayList<Button>();
		for(int i=0;i<=15;i++) {
			array.add(new Button("��ư"+(i+1)));
			flowPane.getChildren().add(array.get(i));
		}
		
		flowPane.setVgap(80);//����
		flowPane.setHgap(20);//����
		
		Scene scene=new Scene(flowPane,1000,500);
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//�׸���
		Button bu=new Button("��ư1");
		Button bu2=new Button("��ư2");
		Label label=new Label("label");
		Label label2=new Label("label2");
		
		GridPane.setConstraints(label, 0, 1);
		GridPane.setConstraints(label2, 0, 2);
		
		GridPane.setConstraints(bu,1, 1);
		GridPane.setConstraints(bu2, 1, 2);
		
		gridPane.getChildren().addAll(bu,bu2,label,label2);
		gridPane.setPadding(new Insets(20, 0, 0, 20));//�� �� ���� top,right,botton,left
		gridPane.setVgap(20);
		gridPane.setHgap(40);
		scene=new Scene(gridPane,1000,500);
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
