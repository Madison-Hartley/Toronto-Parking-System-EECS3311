package TorontoParking;

import java.util.ArrayList;

public class PO {
	
	static ArrayList<PO> allPO = new ArrayList<PO>();
	String firstname;
	String lastname;
	String email;
	
	public PO(String firstname, String lastname, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	public static void AddPO(PO po) {
		allPO.add(po);
	}
	
	public void RemovePO(PO po) {
		if(allPO.contains(po)) {
			allPO.remove(po);
		}
	}
	
	public void RemovePO(int index) {
		if(allPO.size() > index) {
			allPO.remove(index);
		}
	}
	
	
	public String getfirstname() {
		return this.firstname;
	}
	
	
	public String getlastname() {
		return this.lastname;
	}
	
	public String getemail() {
		return this.email;
	}

}
