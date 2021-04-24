package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfterLoginCust {
	
	@FXML
	private Button bookSpaceCust;
	
	@FXML 
	private Button viewBookingsCust;
	
	
	@FXML
	private Button logoutCust;
	
	
	
	@FXML
	public void logoutCust(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}
	
	@FXML
	public void BookSpace(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "CustBookSpace.fxml");
	}
	
	@FXML
	public void ViewBookings(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "CustViewBookings.fxml");
	}

	
	
}
