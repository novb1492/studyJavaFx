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
		
		if(registerDao.selectId(idText.getText())==null) {
			if(pwText.getText().equals(confirmText.getText())) {
				checkBoxs.add((CheckBox)registerForm.lookup("#musicCheck"));
				checkBoxs.add((CheckBox)registerForm.lookup("#movieCheck"));
				checkBoxs.add((CheckBox)registerForm.lookup("#sportCheck"));
				
				RadioButtons.add((RadioButton)registerForm.lookup("#manRadio"));
				RadioButtons.add((RadioButton)registerForm.lookup("#womenRadio"));
				
				registerDto registerDto=new registerDto();
				registerDto.setId(idText.getText());
				registerDto.setPwd(pwText.getText());
				registerDto.setName(nameText.getText());
				registerDto.setAge(Integer.parseInt(comboBox.getSelectionModel().getSelectedItem()));
				
				String hobby="";
				for(CheckBox c:checkBoxs) {
					if(c.isSelected()) {
						hobby+=c.getText()+" ";
					}
				}
				registerDto.setHobby(hobby);
				
				for(RadioButton c:RadioButtons) {
					if(c.isSelected()) {
						registerDto.setGender(c.getText());
					}
				}
				registerDao.insert(registerDto);
				System.out.println("회원가입 완료");
				return;
			}
			System.out.println("비밀번호 불일치");
			return;
		}
		System.out.println("이미 존재함");
		return;
		
	}

}
