package newscanner;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Panel4 extends Group{
	
	static Label label4 = new Label();
	static Label text4 = new Label();
	static JFXSlider maxArea = new JFXSlider();
	static JFXSlider minArea = new JFXSlider();
	static JFXButton back4 = new JFXButton();
	static JFXButton next4 = new JFXButton();
	
	public Panel4() {
		label4.setLayoutX(10);
        label4.setLayoutY(5);
        label4.setPrefSize(320, 240);
        getChildren().add(label4);
		
        settings.bundle.subscribe(v -> text4.setText(v.getString("area")));
		//text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		text4.setLayoutX(10);
		text4.setLayoutY(250);
		text4.setPrefSize(320, 31);
        getChildren().add(text4);
        
        maxArea.setLayoutX(15);
        maxArea.setLayoutY(315);
        maxArea.setPrefSize(310, 45);
        maxArea.setMin(0);
        maxArea.setMax(400);
        maxArea.setValue(100);
        maxArea.setShowTickLabels(true);
        //maxArea.setShowTickMarks(true);
        maxArea.setMajorTickUnit(40);
        //maxArea.setMinorTickCount(5);
        //maxArea.setBlockIncrement(10);
        getChildren().add(maxArea);
        
        minArea.setLayoutX(15);
        minArea.setLayoutY(385);
        minArea.setPrefSize(310, 45);
        minArea.setMin(0);
        minArea.setMax(400);
        minArea.setValue(25);
        minArea.setShowTickLabels(true);
        //minArea.setShowTickMarks(true);
        minArea.setMajorTickUnit(40);
        //minArea.setMinorTickCount(5);
        //minArea.setBlockIncrement(10);
        getChildren().add(minArea);
        
        settings.bundle.subscribe(v -> back4.setText(v.getString("back")));
        back4.setLayoutX(10);
        back4.setLayoutY(435);
        back4.setPrefSize(75, 25);
        back4.setOnAction(e -> Panel2.show(Panel1.stage, new Scene(new Panel3()), 440) );
        getChildren().add(back4);
        
        settings.bundle.subscribe(v -> next4.setText(v.getString("next")));
        next4.setLayoutX(255);
        next4.setLayoutY(435);
        next4.setPrefSize(75, 25);
        next4.setOnAction(e ->{
        	Panel1.stage.setFullScreen(true);
        	Panel5.show();
        });
        getChildren().add(next4);
	}

}
