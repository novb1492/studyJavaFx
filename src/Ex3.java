import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.stage.Stage;

public class Ex3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("emthy");
		primaryStage.show();
		Thread.sleep(2000);//2��
		
		primaryStage.setX(200);
		primaryStage.setY(200);	
		primaryStage.show();
		
		//ȭ���� ������ ���
		Toolkit toolkit= Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();
		
		System.out.println(dimension.width);
		System.out.println(dimension.height);
	}
}
