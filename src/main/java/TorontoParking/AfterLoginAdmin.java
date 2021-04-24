package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfterLoginAdmin {
	
	@FXML
	Button addPO;
	
	@FXML
	Button removePO;
	
	@FXML
	Button changePay;
	
	@FXML
	Button logout;
	
	@FXML
	public void AddPO(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AddPO.fxml");
	}
	
	@FXML
	public void RemovePO(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "RemovePO.fxml");
	}
	
	@FXML 
	public void ChangePay(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AdminPayment.fxml");
	}
	
	@FXML
	public void Logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}

}
