package ex3;

import java.net.URL;
import java.util.ResourceBundle;

import ex2.service.MediaService;
import ex2.service.MediaServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{
	
	private Parent mainForm;
	private MediaService mediaSvc;
	
	public void setMainForm(Parent mainForm) {
		this.mainForm = mainForm;
		mediaSvc.setMedia(mainForm, "/media/video.m4v");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mediaSvc = new MediaServiceImpl();
	}
	
	public void volControl() {
		
	}
	public void play() {
		mediaSvc.play();
	}
	public void pause() {
		mediaSvc.pause();
	}
	public void stop() {
		mediaSvc.stop();
	}

}
