package ex8;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;


public class RegisterService {

	public void RegisterProc(Parent registerForm) {
		TextField idText = (TextField)registerForm.lookup("#idText");
		TextField pwText = (TextField)registerForm.lookup("#pwText");
		TextField nameText = (TextField)registerForm.lookup("#nameText");
		TextField confirmText = (TextField)registerForm.lookup("#confirmText");
		ComboBox<String>comboBox=(ComboBox<String>) registerForm.lookup("#ageCombo");
		List<CheckBox>checkBoxs=new ArrayList<CheckBox>();
		List<RadioButton>RadioButtons=new ArrayList<RadioButton>();
		
		checkBoxs.add((CheckBox)registerForm.lookup("#musicCheck"));
		checkBoxs.add((CheckBox)registerForm.lookup("#movieCheck"));
		checkBoxs.add((CheckBox)registerForm.lookup("#sportCheck"));
		
		RadioButtons.add((RadioButton)registerForm.lookup("#manRadio"));
		RadioButtons.add((RadioButton)registerForm.lookup("#womenRadio"));
		
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
