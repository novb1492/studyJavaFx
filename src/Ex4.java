import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		
	}
}
