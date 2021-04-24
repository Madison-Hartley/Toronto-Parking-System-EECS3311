package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Homepage {
	
	
	
	
	@FXML
	Button custLogin;
	
	@FXML
	Button POlogin;
	
	@FXML
	Button adminLogin;
	
	@FXML
	Button createAcc;
	
	
	@FXML
	public void CustLogin(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "CustLogin.fxml");
	}
	
	@FXML
	public void POLogin(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "POLogin.fxml");
	}
	
	@FXML
	public void AdminLogin(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AdminLogin.fxml");
	}
	
	@FXML
	public void CreateAcc(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "CustReg.fxml");
	}

}
