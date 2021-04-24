package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RemovePO {
	
	@FXML
	Button prevPage;
	
	@FXML
	Button removeAcc;
	
	@FXML
	TextField firstname;
	
	@FXML
	TextField lastname;
	
	@FXML
	TextField email;
	
	@FXML
	Label statusLabel;
	
	Boolean check = false;

	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginAdmin.fxml");
	}
	
	@FXML
	public void RemoveAcc(ActionEvent event) throws IOException {
		for(int i = 0; i < PO.allPO.size(); i++) {
			String checkfirst = PO.allPO.get(i).getfirstname();
			String checklast = PO.allPO.get(i).getlastname();
			String checkemail = PO.allPO.get(i).getemail();
			
			if(checkfirst.equals(firstname.getText().toString())) {
				if(checklast.equals(lastname.getText().toString())) {
					if(checkemail.equals(email.getText().toString())) {
						PO.allPO.remove(i);
						check = true;
						break;
					}
				}
			}
		}
		
		if(check == true) {
			statusLabel.setText("Account deleted");
		}
		else {
			statusLabel.setText("Wrong credentials entered. Please retry.");
		}
	
	}
	
	

}
