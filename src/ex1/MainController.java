package ex1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private Button playButton;
	@FXML private Button pauseButton;
	@FXML private Button stopButton;
	
	private MediaPlayer mediaPlayer;
	private boolean endOfVideo;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pauseButton.setDisable(true);
		stopButton.setDisable(true);
		// �̵�� ��ü ����
		Media media = new Media(getClass().getResource("/media/video.m4v").toString());
//		System.out.println(getClass().getResource("/media/video.m4v").toString());
		
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		mediaPlayer.setOnEndOfMedia(()->{
			endOfVideo=true;
		});
		mediaPlayer.setOnPlaying(()->{
			playButton.setDisable(true);
			pauseButton.setDisable(false);
			stopButton.setDisable(false);
		});
		mediaPlayer.setOnPaused(()->{
			playButton.setDisable(false);
			pauseButton.setDisable(true);
			stopButton.setDisable(false);
		});
		mediaPlayer.setOnStopped(()->{
			playButton.setDisable(false);
			pauseButton.setDisable(true);
			stopButton.setDisable(true);
		});
	}
	
	public void play() {
		if(endOfVideo) {
			mediaPlayer.stop();
		}
		mediaPlayer.play();
		endOfVideo=false;
	}
	public void pause() {
		mediaPlayer.pause();
	}
	public void stop() {
		mediaPlayer.stop();
	}
}
