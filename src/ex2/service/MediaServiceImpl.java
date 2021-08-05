package ex2.service;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaServiceImpl implements MediaService{
	private MediaView mediaView;
	private Button playButton;
	private Button pauseButton;
	private Button stopButton;
	
	private MediaPlayer mediaPlayer;
	private boolean endOfMedia;
	
	private void setControll(Parent form) {
		mediaView = (MediaView)form.lookup("#mediaView");
		playButton = (Button)form.lookup("#playButton");
		pauseButton = (Button)form.lookup("#pauseButton");
		stopButton = (Button)form.lookup("#stopButton");
	}
	
	
	@Override
	public void setMedia(Parent form, String mediaName) {
		setControll(form);
		// 미디어 객체 생성
		Media media = new Media(getClass().getResource(mediaName).toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.setOnEndOfMedia(()->{
			endOfMedia = true;
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
	
	@Override
	public void play() {
		if(endOfMedia) {
			mediaPlayer.stop();
		}
		mediaPlayer.play();
		endOfMedia = false;
	}

	@Override
	public void pause() {
		mediaPlayer.pause();
	}

	@Override
	public void stop() {
		mediaPlayer.stop();	
	}
}
