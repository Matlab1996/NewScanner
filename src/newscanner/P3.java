package newscanner;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class P3 implements Initializable {
	
	@FXML
	private Label label3;
	
	@FXML
	private Label text3;
	
	@FXML
	private JFXSlider slider3;

	@FXML
	private JFXButton back3;
	
	@FXML
	private JFXButton next3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		settings.bundle.subscribe(v -> text3.setText(v.getString("upper")));
		
		settings.bundle.subscribe(v -> back3.setText(v.getString("back")));
		back3.setOnAction(e -> {
			Main.stage.setScene(Main.scene2);
			Main.stage.show();
		});
		
		settings.bundle.subscribe(v -> next3.setText(v.getString("next")));
		next3.setOnAction(e -> {
			Main.stage.setScene(Main.scene4);
			Main.stage.show();
		});
	}

}
