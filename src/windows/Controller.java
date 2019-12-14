package windows;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	public TextField heigthFt, heigthIn, weigth, age;
	public ToggleButton isMale, isFemale;
	public AnchorPane mainPane;
	public ProgressBar bmiProg;
	
	public void calclutionAndDisplay(ActionEvent event) throws IOException, InterruptedException {
		
		String hfs = heigthFt.getText();
		String his = heigthIn.getText();
		String ws = weigth.getText();
		String as = age.getText();
		
		if((!hfs.isBlank()) && (!his.isBlank()) && (!ws.isBlank()) && (!as.isBlank())) {			
			int hf = Integer.parseInt(hfs);
			int hi = Integer.parseInt(his);
			int w = Integer.parseInt(ws);
			int a = Integer.parseInt(as);
			
			String gender = "";
			if(isMale.isSelected()) {
				new DataSh();
				DataSh.setData(hf, hi, w, a, true);
			}
			
			if(isFemale.isSelected()) {
				new DataSh();
				DataSh.setData(hf, hi, w, a, false);
			}			

			Parent next =  FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
			
			Scene scene = new Scene(next);			
			Stage pStage = new Stage();
			pStage.setTitle("Analizing...");
			pStage.setScene(scene);		
			pStage.show();	
			
			mainPane.getScene().getWindow().hide();	
			
		}else {
			if(hfs.isBlank() || his.isBlank()) {
				heigthFt.setStyle("-fx-border-color: red;");
				heigthIn.setStyle("-fx-border-color: red;");
			}
			if(ws.isBlank()) {
				weigth.setStyle("-fx-border-color: red;");
			}
			if(as.isBlank()) {
				age.setStyle("-fx-border-color: red;");				
			}
		}
	}
}
