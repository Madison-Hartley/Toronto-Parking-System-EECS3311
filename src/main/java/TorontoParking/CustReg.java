package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CustReg {
	
	@FXML
	TextField firstName;
	
	@FXML
	TextField lastName;
	
	@FXML
	TextField email;
	
	@FXML
	TextField password;
	
	@FXML
	Button prevPage;
	
	@FXML
	Button createAcc;
	
	Customer cust;
	
	@FXML
	public void prevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}
	
	@FXML
	public void CreateAcc(ActionEvent event) throws IOException {
		String email1 = email.getText().toString();
		String firstname1 = firstName.getText().toString();
		String lastname1 = lastName.getText().toString();
		String pass = password.getText().toString();
		cust = new Customer(email1, firstname1, lastname1, pass);
		Main m = new Main();
		m.changeScene("/" + "AfterLoginCust.fxml");
	}

}
