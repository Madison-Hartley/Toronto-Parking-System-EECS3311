package TorontoParking;

import java.util.ArrayList;

public class ParkingSpaces {
	
	String spacenum;
	int spacenumber;
	static ArrayList<ParkingSpaces> allspaces = new ArrayList<ParkingSpaces>();
	
	
	public ParkingSpaces() {
		
	}
	
	public ParkingSpaces(Integer spacenumber) {
		this.spacenumber = spacenumber;
		this.spacenum = spacenumber.toString();
	}
	
	public ParkingSpaces(String spacenum) {
		this.spacenum = spacenum;
	}
	
	public void AddSpace(ParkingSpaces space) {
		allspaces.add(space);
	}
	
	public void RemoveSpace(ParkingSpaces space) {
		if(allspaces.contains(space)) {
			allspaces.remove(space);
		}
	}

	public String getSpacenum() {
		return spacenum;
	}

	public void setSpacenum(String spacenum) {
		this.spacenum = spacenum;
	}

	public ArrayList<ParkingSpaces> getAllspaces() {
		return allspaces;
	}

	public void setAllspaces(ArrayList<ParkingSpaces> allspaces) {
		ParkingSpaces.allspaces = allspaces;
	}


}
