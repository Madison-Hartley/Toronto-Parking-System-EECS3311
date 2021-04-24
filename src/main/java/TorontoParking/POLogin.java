package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class POLogin {
	
	@FXML
	private Button login;
	
	@FXML
	private Label wrongLogin;
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	Boolean check = false;
	
	
	
	@FXML
	private void userlogin(ActionEvent event) throws IOException {
		checkLogin();
	}
	
	private void checkLogin() throws IOException {

		
		for(int i = 0; i < UserData.usernames.size(); i++) {
			if(username.getText().toString().equals(POData.usernames.get(i))) {
				check = true;
				wrongLogin.setText("logging in");
				Main m = new Main();
				m.changeScene("/" + "AfterLoginPO.fxml");
			
			}

		}
		
		if(username.getText().toString().equals("eecs3311")) {
			check = true;
			wrongLogin.setText("logging in");
			Main m = new Main();
			m.changeScene("/" + "AfterLoginPO.fxml");
		}
		
		if(check == false) {
 			wrongLogin.setText("Wrong username and/or password. Please retry.");
		}
		
	}
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}

}
