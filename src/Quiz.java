import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Quiz extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//화면의 사이즈 얻기
		int width=1000,height=500;
		Toolkit toolkit= Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();
		Label label=new Label("Quiz");
		Scene scene=new Scene(label,width,height);
				
		System.out.println(dimension.width+"가로");
		System.out.println(dimension.height+"세로");
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
		primaryStage.setX(dimension.width/2-width/2);
		primaryStage.setY(dimension.height/2-height/2);	
	}

}
