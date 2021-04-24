package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminPayment {
	
	@FXML
	Button approvePay;
	
	@FXML
	Button denyPay;
	
	@FXML 
	Button prevPage;
	
	@FXML
	TextField firstname;
	
	@FXML
	TextField lastname;
	
	@FXML
	TextField email;
	
	@FXML
	TextField spacenum;
	
	@FXML
	Label statusUpdate;
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginAdmin.fxml");
	}
	
	
	
	@FXML
	public void Approve(ActionEvent event) throws IOException {
		statusUpdate.setText("Payment Approved");
	}
	
	@FXML
	public void Deny(ActionEvent event) throws IOException {
		statusUpdate.setText("Payment Denied");
	}

	
	
	
	

}
