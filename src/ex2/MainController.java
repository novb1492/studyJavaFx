package ex2;

import java.net.URL;
import java.util.ResourceBundle;

import ex2.service.MediaService;
import ex2.service.MediaServiceImpl;

import javafx.fxml.Initializable;
import javafx.scene.Parent;



public class MainController implements Initializable{
	private Parent mainForm;
	private MediaService mediaService;
	
	public  void setMainForm(Parent mainForm) {
		this.mainForm=mainForm;
		mediaService.setMedia(mainForm, "/media/video.m4v");
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		mediaService=new MediaServiceImpl();
		
	}
	
	public void play() {
		mediaService.play();
	}
	public void pause() {
		mediaService.pause();
	}
	public void stop() {
		mediaService.stop();
	}
}
