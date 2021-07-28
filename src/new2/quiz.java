package new2;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class quiz extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane=new BorderPane();
		
		ArrayList<Label> label = new ArrayList<Label>();
		label.add(new Label("Ȩ"));
		label.add(new Label("��ȸ"));
		label.add(new Label("����"));
		label.add(new Label("����"));
		label.add(new Label("��ȭ"));
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().addAll(label);
		flowTop.setPadding(new Insets(0,0,0,200));
		flowTop.setHgap(20);
		borderPane.setTop(flowTop);
		
		label.clear();
		label.add(new Label("ī�װ�"));
		label.add(new Label("��Ʈ��/pc"));
		label.add(new Label("�ڵ�����ǰ"));
		label.add(new Label("ĳ��/����"));
		
		VBox vBox=new VBox();
		vBox.getChildren().addAll(label);
		vBox.setSpacing(20);
		vBox.setPadding(new Insets(30,10,0,10));
		borderPane.setLeft(vBox);
		
		TextField textField=new TextField();
		PasswordField passwordField=new PasswordField();
		
		HBox hBox=new HBox();
		hBox.getChildren().addAll(new Label("Id"), textField);
		hBox.setPadding(new Insets(30, 0, 0, 20));
		
		HBox hBox2=new HBox();
		hBox2.getChildren().addAll(new Label("Pw"),passwordField);
		hBox2.setPadding(new Insets(0, 0, 0, 20));
		
		RadioButton RadioButton=new RadioButton();
		RadioButton.setText("��");
		RadioButton RadioButton2=new RadioButton();
		RadioButton2.setText("��");
		
		ToggleGroup toggleGroup=new ToggleGroup();
		RadioButton.setToggleGroup(toggleGroup);
		RadioButton2.setToggleGroup(toggleGroup);
		
		HBox hBox3=new HBox();
		hBox3.getChildren().addAll(RadioButton, RadioButton2);
		hBox3.setSpacing(20);
		hBox3.setPadding(new Insets(10, 0, 0, 20));
		
		CheckBox checkBox=new CheckBox();
		checkBox.setText("����");
		CheckBox checkBox2=new CheckBox();
		checkBox2.setText("����");
		
		HBox hBox4=new HBox();
		hBox4.getChildren().addAll(checkBox, checkBox2);
		hBox4.setSpacing(20);
		hBox4.setPadding(new Insets(10, 0, 0, 20));
		
		TextArea textArea=new TextArea();
		textArea.setMaxSize(200, 30);
		
		VBox vBox3=new VBox();
		vBox3.getChildren().addAll(new Label("�ϰ������"),textArea);
		vBox3.setSpacing(10);
		vBox3.setPadding(new Insets(10, 0, 0, 20));
		
		VBox vBox2=new VBox();
		vBox2.getChildren().addAll(hBox, hBox2,hBox3,hBox4,vBox3);
		vBox2.setSpacing(10);
		borderPane.setCenter(vBox2);
		
		GridPane gridPane=new GridPane();
		Button buttonLogin=new Button("�α���");
		buttonLogin.setPrefSize(80, 50);
		gridPane.add(new TextField(), 0, 0, 1, 1);
		gridPane.add(new TextField(), 0, 1,1,1);
		gridPane.add(buttonLogin, 1, 0, 1, 2);
		gridPane.setPadding(new Insets(30, 0, 0, 20));
		borderPane.setRight(gridPane);
		
		primaryStage.setTitle("quiz3");
		primaryStage.setScene(new Scene(borderPane,500,300));
		primaryStage.show();
	}
}
