package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CustLogin {

	@FXML
	private Button loginCust;
	
	@FXML
	private Label wrongLoginCust;
	
	@FXML
	private TextField usernameCust;
	
	@FXML
	private PasswordField passwordCust;
	
	Boolean check = false;
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}
	
	
	@FXML
	private void userlogin(ActionEvent event) throws IOException {
		checkLogin();
	}
	

	private void checkLogin() throws IOException {
		for(int i = 0; i < UserData.usernames.size(); i++) {
			if(usernameCust.getText().toString().equals(UserData.usernames.get(i))) {
				check = true;
			wrongLoginCust.setText("logging in");
			Main m = new Main();
			m.changeScene("/" + "AfterLoginCust.fxml");
			}

		}
		if(usernameCust.getText().toString().equals("eecs3311")) {
			check = true;
			wrongLoginCust.setText("logging in");
			Main m = new Main();
			m.changeScene("/" + "AfterLoginCust.fxml");
		}
		
		if(check == false) {
			wrongLoginCust.setText("Wrong username and/or password. Please retry.");
		}
		
	}
	
}
