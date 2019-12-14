package windows;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application{
	
		public static void main(String[] args) {
		launch(args);		
	}

	@Override
	public void start(Stage pStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/stylesheets/mainStyle.css").toExternalForm());
		
		pStage.setTitle("ProjectBAD");
		pStage.setScene(scene);		
		pStage.show();	
	}

}
