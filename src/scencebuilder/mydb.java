package scencebuilder;

import java.util.HashMap;

public class mydb {
	private HashMap<String, String>map=new HashMap<String, String>();
	
	public mydb() {
		map.put("if","if1234");
		map.put("else","else1234");
		map.put("while","while1234");
		map.put("for","for1234");
	}
	public boolean login(String id, String pwd) {
		for(String s: map.keySet()) {
			if(s.equals(id)) {
				if(map.get(s).equals(pwd)) {
					return true;
				}
			}
		}
		return false;
	}
}
