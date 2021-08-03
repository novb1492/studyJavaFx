package practice;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class regsisService {
	
	public void RegisterProc(Parent Parent) {
		TextField idText = (TextField)Parent.lookup("#idText");
		TextField pwText = (TextField)Parent.lookup("#pwText");
		TextField nameText = (TextField)Parent.lookup("#nameText");
		TextField confirmText = (TextField)Parent.lookup("#confirmText");
		ComboBox<String>comboBox=(ComboBox<String>) Parent.lookup("#ageCombo");
		List<CheckBox>checkBoxs=new ArrayList<CheckBox>();
		List<RadioButton>RadioButtons=new ArrayList<RadioButton>();
		
		checkBoxs.add((CheckBox)Parent.lookup("#musicCheck"));
		checkBoxs.add((CheckBox)Parent.lookup("#movieCheck"));
		checkBoxs.add((CheckBox)Parent.lookup("#sportCheck"));
		
		RadioButtons.add((RadioButton)Parent.lookup("#manRadio"));
		RadioButtons.add((RadioButton)Parent.lookup("#womenRadio"));
		
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
