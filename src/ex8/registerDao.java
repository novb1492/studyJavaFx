package ex8;

import java.util.List;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class registerDao {
	public void insert(TextField idText,TextField pwText,TextField nameText,TextField confirmText,ComboBox<String>comboBox,List<CheckBox>checkBoxs,List<RadioButton>RadioButtons) {
		System.out.println("idText : " + idText.getText());
		System.out.println("pwText : " + pwText.getText());
		System.out.println("nameText : " + nameText.getText());
		System.out.println("confirmText : " + confirmText.getText());
		System.out.println("comboBox : " + comboBox.getSelectionModel().getSelectedItem());
		for(CheckBox c:checkBoxs) {
			if(c.isSelected()) {
				System.out.println("CheckBox : " + c.getText());
			}
		}
		for(RadioButton c:RadioButtons) {
			if(c.isSelected()) {
				System.out.println("RadioButton : " + c.getText());
			}
		}
	}
}
