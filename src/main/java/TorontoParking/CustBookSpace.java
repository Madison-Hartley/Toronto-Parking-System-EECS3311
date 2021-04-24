package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CustBookSpace {
	
	@FXML 
	Button prevPage;
	
	@FXML
	Button bookButton;
	
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginCust.fxml");
	}
	
	@FXML
	public void BookButton(ActionEvent event) throws IOException {
		
	}

}
