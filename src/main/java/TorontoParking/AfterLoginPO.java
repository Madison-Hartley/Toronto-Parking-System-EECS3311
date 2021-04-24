package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AfterLoginPO {
	
	@FXML
	Button addSpace;
	
	@FXML
	Button removeSpace;
	
	@FXML
	Button viewRequests;
	
	@FXML
	Button grantRequest;
	
	@FXML
	Button cancelRequest;
	
	@FXML
	Button logout;
	
	
	@FXML
	public void Logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "Homepage.fxml");
	}
	
	@FXML
	public void RemoveSpace(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "PORemoveSpace.fxml");
	}
	
	@FXML
	public void AddSpace(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "POAddSpace.fxml");
	}
	
	@FXML
	public void ViewRequests(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "POViewRequests.fxml");
	}
	
	@FXML
	public void GrantRequest(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "POGrantRequest.fxml");
	}
	
	@FXML
	public void CancelRequest(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "POCancelRequest.fxml");
	}

}
