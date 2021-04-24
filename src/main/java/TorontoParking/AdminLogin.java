package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminLogin {
	
	@FXML 
	Button prevPage;
	
	@FXML
	Button login;
	
	@FXML
	TextField username;
	
	@FXML
	TextField password;
	
	@FXML 
	Label wrongLogin;
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}
	
	@FXML
	public void login(ActionEvent event) throws IOException {
		if(username.getText().toString().equals("admin") && password.getText().toString().equals("eecs3311")) {
			wrongLogin.setText("logging in");
			Main m = new Main();
			m.changeScene("/" + "AfterLoginAdmin.fxml");

		}
		else {
			wrongLogin.setText("Wrong username and/or password. Please retry.");
		}
	}

}
