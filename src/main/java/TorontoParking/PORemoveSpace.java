package TorontoParking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PORemoveSpace {
	
	@FXML
	Button removeSpace;
	
	@FXML
	Button prevPage;
	
	@FXML
	TextField parkingSpaceNum;
	
	@FXML
	Label statusLabel;
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void RemoveSpace(ActionEvent event) throws IOException {
		
		Boolean check = false;
		String spacenum = parkingSpaceNum.getText().toString();
		
		
		for(int i = 0; i < ParkingSpaces.allspaces.size(); i++) {
			if(ParkingSpaces.allspaces.get(i).getSpacenum().equals(spacenum)) {
				ParkingSpaces.allspaces.remove(i);
				check = true;
			}

		}
		
		if(check == true) {
			statusLabel.setText("Space removed successfully");
		}
		else {
			statusLabel.setText("Error: Space not removed. Check input.");
		}

	}
	

}
