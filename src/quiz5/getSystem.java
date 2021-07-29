package quiz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class getSystem {
	
	public List<String> geturls(String[] url2 ) {
		List<String>url=new ArrayList<String>();
		for(String s:url2) {
			url.add(s);
		}
		return url;
	}
	public HashMap<String,ImageView> getImages(List<String>url,String[] jobs) {
		HashMap<String,ImageView>imageViews=new HashMap<String, ImageView>();
		for(int i=0;i<url.size();i++) {
			ImageView imageView2=new ImageView(url.get(i));
			imageView2.setFitWidth(30);
			imageView2.setFitHeight(35);
			imageViews.put(jobs[i],imageView2);
		}
		return imageViews;
	}
	public List<ToggleButton> getToggleButtons(HashMap<String,ImageView>imageViews) {
		ToggleGroup toggleGroup=new ToggleGroup();
		List<ToggleButton>buttons=new ArrayList<ToggleButton>();
		for(String s:imageViews.keySet()) {
			ToggleButton button=new ToggleButton();
			button.setGraphic(imageViews.get(s));
			button.setToggleGroup(toggleGroup);
			buttons.add(button);
		}
		return buttons;
	}
}
