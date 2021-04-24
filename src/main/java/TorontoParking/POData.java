package TorontoParking;

import java.util.ArrayList;

public class POData {
	
	static ArrayList<String> usernames = new ArrayList<String>();
	
	public static String AddUser(String username) {
		usernames.add(username);
		return username;
	}
	
	public void RemoveUser(String username) {
		if(usernames.contains(username)) {
			usernames.remove(username);
		}
	}

}
