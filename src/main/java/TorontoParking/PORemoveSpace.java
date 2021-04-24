package TorontoParking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PORemoveSpace {
	
	@FXML
	Button removeSpace;
	
	@FXML
	Button prevPage;
	
	@FXML
	TextField parkingSpaceNum;
	
	ArrayList<String> parkingSpaces;
	
	
	
	
	
	@FXML
	public void PrevPage(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("/" + "AfterLoginPO.fxml");
	}
	
	@FXML
	public void RemoveSpace(ActionEvent event) throws IOException {
		try {
			parkingSpaces = new ArrayList<>(Files.readAllLines(Paths.get("/" + "parkingspaces.txt")));
		}
		catch (IOException e){
			
		}
		
		
		for(int i = 0; i < parkingSpaces.size(); i++) {
			if(parkingSpaces.get(i).equals(parkingSpaceNum)) {
				parkingSpaces.remove(i);
				Main m = new Main();
				m.changeScene("/" + "ActionSuccessful.fxml");
			}
			else {
				Main m = new Main();
				m.changeScene("/" + "ActionFailed.fxml");
			}
		}

	}
	

}
