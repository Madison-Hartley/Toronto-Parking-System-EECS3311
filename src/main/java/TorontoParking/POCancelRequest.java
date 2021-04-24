package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class POCancelRequest {
	
	
	
	@FXML
	Button gogo;
	
	@FXML
	Button prevPage;
	
	@FXML
	TextArea dispbookings;
	
	@FXML
	TextArea disp2;
	
	@FXML
	TextArea disp3;
	
	@FXML
	Label deleteStatus;
	
	@FXML
	Button cancel1;
	
	@FXML
	Button cancel2;
	
	@FXML
	Button cancel3;
	
	@FXML
	TextField plates;
	
	int index1;
	int index2;
	int index3;
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void ShowBookings(ActionEvent event) throws IOException {
		
		
		boolean check = false;
		int count = 0;
		
		for(int i = 0; i < Customer.bookings.size(); i++) {
			Customer.bookings.get(i);
			String p1 = Customer.bookings.get(i).getPlates();
			String p2 = plates.getText().toString();
			if(p1.equals(p2)) {
			if(count == 0) {
				index1 = i;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				dispbookings.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
				count++;
			}
			else if (count == 1) {
				index2 = i;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				disp2.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
				count++;
			}
			else if(count == 2) {
				index3 = i;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				disp3.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
				count++;
			}
			}
		}
		
		
		
		if(check == false) {
			dispbookings.setText("Error: no bookings found. Please check input.");
		}
	}
	
	
	public void CancelFirst(ActionEvent event) throws IOException {
		if(Customer.bookings.size() > index1) {
			Customer.bookings.remove(index1);
			deleteStatus.setText("First Request Deleted");
		}
		else {
			deleteStatus.setText("Error: request not deleted. Please refresh by pressing 'Generate Requests'.");
		}
	}
	
	public void CancelSecond(ActionEvent event) throws IOException {
		if(Customer.bookings.size() > index2) {
			Customer.bookings.remove(index2);
			deleteStatus.setText("Second Request Deleted");
		}
		else {
			deleteStatus.setText("Error: request not deleted. Please refresh by pressing 'Generate Requests'.");
		}
	}
	
	public void CancelThird(ActionEvent event) throws IOException {
		if(Customer.bookings.size() > index3) {
			Customer.bookings.remove(index3);
			deleteStatus.setText("Third Request Deleted");
		}
		else {
			deleteStatus.setText("Error: request not deleted. Please refresh by pressing 'Generate Requests'.");
		}
	}

}
