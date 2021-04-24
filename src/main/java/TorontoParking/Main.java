package TorontoParking;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
//	String javaVersion = System.getProperty("java.version");
//	String javafxVersion = System.getProperty("javafx.version");
//	Label l = new Label("Hello, JavaFX" + javafxVersion + ", running on Java...");
//	Scene scene = new Scene(new StackPane(l), 640, 480);
//	primaryStage.setScene(scene);
//	primaryStage.show();
		stg = primaryStage;
		primaryStage.setResizable(false);
		URL fxmlResource = getClass().getResource("/" + "Homepage.fxml");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(fxmlResource);
		Parent root = loader.load();
		//Parent root = FXMLLoader.load(getClass().getResource(fxmlResource));
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("src/main/resources/CustLogin.fxml"));
		//Parent root = loader.load();
		primaryStage.setTitle("Toronto Parking System");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.show();
	}
	
	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}

	public static void main(String[] args) {

		launch();

	}
	
	

}
