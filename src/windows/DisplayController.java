package windows;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class DisplayController implements Initializable  {
	
	@FXML
	public BarChart<String, Double> myChart;
	
	@FXML
	public Label bmiStatus, piStatus, wiStatus, bmrStatus, bfpStatus, lbmStatus, bmiImp, piImp, wiImp, bmrImp, lbmImp, bfpImp;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		XYChart.Series<String, Double> set = new XYChart.Series<String, Double>();
		
		set.getData().add(new XYChart.Data<String, Double>("BMI (Body Mass \n Index)", DataSh.bmi));
		set.getData().add(new XYChart.Data<String, Double>("PI (Ponderal \n Index)", DataSh.pi));
		set.getData().add(new XYChart.Data<String, Double>("Water Intake", DataSh.wi));
		set.getData().add(new XYChart.Data<String, Double>("BFP  (Body Fat \n Percentage)", DataSh.bfp));
		set.getData().add(new XYChart.Data<String, Double>("BMR * 100 (Bosal Metabolic \n Rate) in Calories", (DataSh.bmr / 100)));
		set.getData().add(new XYChart.Data<String, Double>("LBM * 10 (Mucle Mass \n Percentage)", (DataSh.lbm / 10)));
		
		myChart.getData().addAll(set);
		
		bmiStatus.setText(DataSh.bmiStrSt);
		piStatus.setText(DataSh.piStrSt);
		wiStatus.setText(DataSh.wiStrSt);
		bmrStatus.setText(DataSh.bmrStrSt);
		bfpStatus.setText(DataSh.bfpStrSt);
		lbmStatus.setText(DataSh.lbmStrSt);		
		bmiImp.setText(DataSh.bmiStrim);
		piImp.setText(DataSh.piStrim);
		wiImp.setText(DataSh.wiStrim);
		bmrImp.setText(DataSh.bmrStrim);
		bfpImp.setText(DataSh.bfpStrim);
		lbmImp.setText(DataSh.lbmStrim);
		
	}

}
