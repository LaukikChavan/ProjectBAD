package windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.pdfsam.ui.RingProgressIndicator;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SplashScreenController implements Initializable {

	@FXML
	public StackPane mainScreen;
	public double height;
	public int  weight, age;

	public void setData(int hf, int hi, int w, int a) {
		height = ((hf / 3.281) + (hi / 39.37));
		weight = w;
		age = a;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		RingProgressIndicator ringProgressIndicator = new RingProgressIndicator();
		ringProgressIndicator.setRingWidth(1000);
		
		mainScreen.getChildren().add(ringProgressIndicator);
		
		new WorkerThread(ringProgressIndicator).start();		
	}
	
	class WorkerThread extends Thread{
		RingProgressIndicator rpi;
		int Progress = 0;
		
		public WorkerThread(RingProgressIndicator rpi) {
			this.rpi = rpi;
		}
		
		@Override
		public void run(){		
			
			while(true) {
				try {
					Thread.sleep(50);
				}catch(Exception e) {
					
				}
				//Platform.runLater(() -> {
					rpi.setProgress(Progress);
				//});
				Progress+=1;
				if(Progress > 100) {
					break;
				}
			}
			
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					Parent root;
						try {

							root =  FXMLLoader.load(getClass().getResource("Display.fxml"));
							
							Scene scene = new Scene(root);
							
							Stage pStage = new Stage();
							
							pStage.setTitle("ProjectBAD");
							pStage.setScene(scene);		
							pStage.show();	
							
							mainScreen.getScene().getWindow().hide();
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
			});
			
		}
	}
	
}
