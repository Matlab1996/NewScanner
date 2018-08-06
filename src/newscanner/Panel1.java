package newscanner;

import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXSlider;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Panel1 extends Application {
	
	static Group root = new Group();
	static Label label = new Label();
	static Label text1 = new Label();
	static JFXSlider exposure = new JFXSlider();
	static JFXButton back1 = new JFXButton();
	static JFXButton next1 = new JFXButton();
	
	static String[] resolution = new String[] {"RU", "AZ", "EN"};
	static JFXComboBox<String> combo = new JFXComboBox<String>();
    static Scene scene = null;
    static Stage stage = new Stage();
    
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
        
        label.setLayoutX(10);
        label.setLayoutY(5);
        label.setPrefSize(320, 240);
        root.getChildren().add(label);
		
        settings.bundle.subscribe(v -> text1.setText(v.getString("exposure")));
		//text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		text1.setLayoutX(10);
		text1.setLayoutY(250);
		text1.setPrefSize(320, 31);
        root.getChildren().add(text1);
        
        exposure.setLayoutX(15);
        exposure.setLayoutY(315);
        exposure.setPrefSize(310, 45);
        exposure.setMin(-13);
        exposure.setMax(-1);
        exposure.setValue(-6);
        exposure.setShowTickLabels(true);
        //exposure.setShowTickMarks(true);
        exposure.setMajorTickUnit(1);
        //exposure.valueProperty().addListener((observable, oldValue, newValue) -> 
        										//text1.setText(Double.toString(newValue.doubleValue()))); 
        //exposure.setMinorTickCount(5);
        //exposure.setBlockIncrement(10);
        root.getChildren().add(exposure);
        
        settings.bundle.subscribe(v -> back1.setText(v.getString("back")));
        back1.setLayoutX(10);
        back1.setLayoutY(365);
        back1.setPrefSize(75, 25);
        //back1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            //@Override
            //public void handle(MouseEvent mouseEvent) {
            	//back1.setText("Thanks!");
            //}
        //});
        root.getChildren().add(back1);
        
        combo.getItems().addAll(resolution);
        //combo.setPromptText("Select Java Version");
        combo.setLayoutX(150);
        combo.setLayoutY(365);
        combo.setPrefSize(63, 25);
        combo.getSelectionModel().selectedItemProperty().addListener( (options, oldValue, newValue) -> {
        	switch (newValue) {
			case ("RU"): {
				settings.bundle.onNext(ResourceBundle.getBundle("global"));
				break;
			}
			case ("AZ"): {
				settings.bundle.onNext(ResourceBundle.getBundle("global_az"));
				break;
			}
			case ("EN"): {
				settings.bundle.onNext(ResourceBundle.getBundle("global_en"));
				break;
			}}
        }); 
        root.getChildren().add(combo);
        
        settings.bundle.subscribe(v -> next1.setText(v.getString("next")));
        next1.setLayoutX(255);
        next1.setLayoutY(365);
        next1.setPrefSize(75, 25);
        //next1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        //   @Override
        //    public void handle(MouseEvent mouseEvent) {
        //    	//Next1 main = new Next1();
        //    }
        //});
        next1.setOnAction(e -> Panel2.show(stage, new Scene(new Panel2()), 190) );
        root.getChildren().add(next1);

        scene = new Scene(root, Color.WHITE);
        
        stage.setScene(scene);
        stage.setWidth(355);
        stage.setHeight(440);
        stage.show();
        stage.setTitle("OK");
	}

    public static void main(String[] args) {
    	launch(args);
    }
}
