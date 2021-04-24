package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewRequests {
	
	
	@FXML
	Button prevPage;
	
	@FXML
	Button showBookings;
	
	@FXML
	TextField plate;
	
	@FXML
	TextArea dispbookings;
	
	@FXML
	TextArea disp2;
	
	@FXML
	TextArea disp3;
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void ShowBookings(ActionEvent event) throws IOException {
		boolean check = false;
		int count = 0;
		for(int i = 0; i < Bookings.bookings.size(); i++) {
			String bok = Bookings.bookings.get(i).getPlates();
			String thisbok = plate.getText().toString();
			if(thisbok.equals(bok)) {
				if(count == 0) {
					String disptime = Bookings.bookings.get(i).getTime();
					String dispdate = Bookings.bookings.get(i).getDate();
					String dispspace = Bookings.bookings.get(i).getSpaceNum();
					dispbookings.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
					check = true;
					count++;
				}
				else if (count == 1) {
					String disptime = Bookings.bookings.get(i).getTime();
					String dispdate = Bookings.bookings.get(i).getDate();
					String dispspace = Bookings.bookings.get(i).getSpaceNum();
					disp2.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
					check = true;
					count++;
				}
				else if(count == 2) {
					String disptime = Bookings.bookings.get(i).getTime();
					String dispdate = Bookings.bookings.get(i).getDate();
					String dispspace = Bookings.bookings.get(i).getSpaceNum();
					disp3.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
					check = true;
					count++;
				}
			}
		}
		
		if(check == false) {
			dispbookings.setText("Error: no booking requests found. Please check input.");
		}
	}
	

}
