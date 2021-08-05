package ex2.service;

import javafx.scene.Parent;

public interface MediaService {
	public void play();
	public void pause();
	public void stop();
	public void setMedia(Parent form, String mediaName);
}
