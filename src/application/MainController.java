package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label label1;
	public void onClick() {
		System.out.println("Button Clicked!");
		
		label1.setText("Button Clicked!");
	}
}
