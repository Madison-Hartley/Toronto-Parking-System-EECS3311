package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GrantRequestPO {
	
	
	@FXML
	Button prevPage;
	
	@FXML
	Button grant1;
	
	@FXML
	Button grant2;
	
	@FXML
	Button grant3;
	
	@FXML
	Button getReq;
	
	@FXML
	TextField plates;
	
	@FXML
	TextArea tex1;
	
	@FXML
	TextArea tex2;
	
	@FXML
	TextArea tex3;
	
	@FXML
	Label updateLabel;
	
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void GetReq(ActionEvent event) throws IOException {
		boolean check = false;
		int count = 0;
		for(int i = 0; i < Customer.bookings.size(); i++) {
			String p1 = Customer.bookings.get(i).getPlates();
			String p2 = plates.getText().toString();
			if((p1.equals(p2)) && count == 0) {
				count ++;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				tex1.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
			}
			else if((p1.equals(p2)) && count == 1) {
				count ++;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				tex2.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
			}
			else if((p1.equals(p2)) && count == 2) {
				count ++;
				String disptime = Customer.bookings.get(i).getTime();
				String dispdate = Customer.bookings.get(i).getDate();
				String dispspace = Customer.bookings.get(i).getSpaceNum();
				tex3.setText("Booking time: " + disptime + " Booking Date: " + dispdate + " Booking Space: " + dispspace);
				check = true;
			}
		}
		
		if(check == false) {
			updateLabel.setText("Error: customer has no bookings. Check input and try again.");
		}
	}
	
	@FXML
	public void GrantFirst(ActionEvent event) throws IOException {
		updateLabel.setText("Request Granted!");
	}
	
	@FXML
	public void GrantSecond(ActionEvent event) throws IOException {
		updateLabel.setText("Request Granted!");
	}
	
	@FXML
	public void GrantThird(ActionEvent event) throws IOException {
		updateLabel.setText("Request Granted!");
	}
	
	
	
	

}
