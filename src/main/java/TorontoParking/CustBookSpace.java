package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CustBookSpace {
	
	@FXML 
	Button prevPage;
	
	@FXML
	Button bookButton;
	
	@FXML
	TextField licensePlate;
	
	@FXML
	TextField parkingSpaceNum;
	
	@FXML
	TextField bookingDate;
	
	@FXML
	TextField bookingTime;
	
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginCust.fxml");
	}
	
	@FXML
	public void BookButton(ActionEvent event) throws IOException {
		
		Bookings booking = new Bookings(licensePlate.getText().toString(), parkingSpaceNum.getText().toString(), bookingDate.getText().toString(), bookingTime.getText().toString());
		Customer.addBooking(booking);
		Bookings.AddBooking(booking);
		Main m = new Main();
		m.changeScene("/" + "ActionSuccessfulCust.fxml");
		
	}

}
