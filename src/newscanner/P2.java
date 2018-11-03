package newscanner;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class P2 implements Initializable {
	
	@FXML
	private Label text2;
	
	@FXML
	private JFXSlider slider2;
	
	@FXML
	private JFXButton back2;
	
	@FXML
	private JFXButton next2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		settings.bundle.subscribe(v -> text2.setText(v.getString("distanse")));
		
		settings.bundle.subscribe(v -> back2.setText(v.getString("back")));
		back2.setOnAction(e -> {
			Main.stage.setScene(Main.scene1);
			Main.stage.show();
		});
		
		settings.bundle.subscribe(v -> next2.setText(v.getString("next")));
		next2.setOnAction(e -> {
			Main.stage.setScene(Main.scene3);
			Main.stage.show();
		});
	}

}
