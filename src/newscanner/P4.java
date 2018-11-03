package newscanner;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class P4 implements Initializable {
	
	@FXML
	private Label label4;
	
	@FXML
	private Label text4;
	
	@FXML
	private JFXSlider slider_min;
	
	@FXML
	private JFXSlider slider_max;

	@FXML
	private JFXButton back4;
	
	@FXML
	private JFXButton next4;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		settings.bundle.subscribe(v -> text4.setText(v.getString("area")));
		
		settings.bundle.subscribe(v -> back4.setText(v.getString("back")));
		back4.setOnAction(e -> {
			Main.stage.setScene(Main.scene3);
			Main.stage.show();
		});
		
		settings.bundle.subscribe(v -> next4.setText(v.getString("next")));
		next4.setOnAction(e -> {
			Main.stage.setFullScreen(true);
			P5.show();
		});
	}

}
