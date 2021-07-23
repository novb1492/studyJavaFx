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
		primaryStage.setTitle("");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
