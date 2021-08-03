package ex8;

import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class RegisterService {

	public void RegisterProc(Parent registerForm) {
		TextField idText = (TextField)registerForm.lookup("#idText");
		System.out.println("idText : " + idText.getText());
	}

}
