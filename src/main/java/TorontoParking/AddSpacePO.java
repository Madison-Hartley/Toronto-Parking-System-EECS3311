package TorontoParking;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddSpacePO {
	
	@FXML
	Button prevPage;
	
	@FXML
	Button createSpace;
	
	@FXML
	TextField numbertomake;
	
	@FXML
	Label updateLabel;
	
	@FXML
	Button refreshButton;
	
	@FXML
	public void CreateSpace(ActionEvent event) throws IOException {
		Integer newnum = ParkingSpaces.allspaces.size() + 1;
		ParkingSpaces newspace = new ParkingSpaces(newnum);
		ParkingSpaces.allspaces.add(newspace);
		updateLabel.setText("Successfully created parking space(s).");
	}
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void RefreshButton(ActionEvent event) throws IOException {
		updateLabel.setText(" ");
	}
	
	

}
