package newscanner;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXSlider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class P1 implements Initializable {
	
	@FXML
	private Label label1;
	
	@FXML
	private Label text1;
	
	@FXML
	private JFXSlider slider1;
	
	@FXML
	private JFXButton back1;
	
	@FXML
	private JFXComboBox<String> comboBox;

	@FXML
	private JFXButton next1;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		settings.bundle.subscribe(v -> text1.setText(v.getString("exposure")));
		
		comboBox.getItems().addAll("AZ", "EN", "RU");
		comboBox.getSelectionModel().selectedItemProperty().addListener( (options, oldValue, newValue) -> {
        	switch (newValue) {
			case ("RU"): {
				settings.bundle.onNext(ResourceBundle.getBundle("properties/global"));
				break;
			}
			case ("AZ"): {
				settings.bundle.onNext(ResourceBundle.getBundle("properties/global_az"));
				break;
			}
			case ("EN"): {
				settings.bundle.onNext(ResourceBundle.getBundle("properties/global_en"));
				break;
			}}
        });
		
		settings.bundle.subscribe(v -> back1.setText(v.getString("back")));
		
		settings.bundle.subscribe(v -> next1.setText(v.getString("next")));
		next1.setOnAction(e -> {
			Main.stage.setScene(Main.scene2);
			Main.stage.show();
		});
	}

}
