package TorontoParking;

import java.util.ArrayList;

public class Customer {
	
	
	static ArrayList<Bookings> bookings;
	Bookings booking;
	String email;
	String firstName;
	String lastName;
	String password;
	String plates;
	
	public Customer(String email, String firstName, String lastName, String password, String plates) {
		bookings = new ArrayList<Bookings>();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.plates = plates;
		String u = firstName.concat(lastName);
		UserData.AddUser(u);
		
	}
	
	public static void addBooking(Bookings booking) {
		bookings.add(booking);
	}
	
	public void removeBooking(Bookings booking) {
		this.booking = booking;
		for(int i = 0; i < bookings.size(); i++) {
			if(bookings.get(i).equals(booking)) {
				bookings.remove(i);
			}
		}
	}

}
