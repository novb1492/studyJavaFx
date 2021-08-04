package ex8;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;



public class RegisterService {
	
	private registerDao registerDao=new registerDao();

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
		
		registerDao.insert(idText,pwText,nameText,confirmText,comboBox,checkBoxs,RadioButtons);
	
	
	}

}
