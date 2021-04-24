package TorontoParking;

import java.util.ArrayList;

public class Bookings {
	
	String plates;
	String spaceNum;
	String date;
	String time;
	static ArrayList<Bookings> bookings = new ArrayList<Bookings>();
	
	public Bookings(String plates, String spaceNum, String date, String time) {
		this.plates = plates;
		this.time = time;
		this.date = date;
		this.spaceNum = spaceNum;
	
	}
	
	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}

	public String getSpaceNum() {
		return spaceNum;
	}

	public void setSpaceNum(String spaceNum) {
		this.spaceNum = spaceNum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public static ArrayList<Bookings> getBookings() {
		return bookings;
	}

	public static void setBookings(ArrayList<Bookings> bookings) {
		Bookings.bookings = bookings;
	}

	public static void AddBooking(Bookings booking) {
		bookings.add(booking);
	}
	
	public void RemoveBooking(Bookings booking) {
		
	}

}
