package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddPO {
	
	@FXML
	Button prevPage;
	
	@FXML
	Button createPO;
	
	@FXML
	TextField firstname;
	
	@FXML
	TextField lastname;
	
	@FXML
	TextField email;
	
	@FXML
	Label updaterLabel;
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginAdmin.fxml");
	}

	@FXML
	public void CreatePO(ActionEvent event) throws IOException {
		String first = firstname.getText().toString();
		String last = lastname.getText().toString();
		String em = email.getText().toString();
		PO newpo = new PO(first, last, em);
		PO.AddPO(newpo);
		if(PO.allPO.contains(newpo)) {
			updaterLabel.setText("New Parking Officer account created");
		}
		else {
			updaterLabel.setText("Error: Account not created. Please check inputs.");
		}
		
	}
	
}
