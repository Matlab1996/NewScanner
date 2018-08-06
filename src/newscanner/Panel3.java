package newscanner;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class Panel3 extends Group{
	
	static Label label3 = new Label();
	static Label text3 = new Label();
	static JFXSlider upper = new JFXSlider();
	static JFXButton back3 = new JFXButton();
	static JFXButton next3 = new JFXButton();

	public Panel3() {
		label3.setLayoutX(10);
        label3.setLayoutY(5);
        label3.setPrefSize(320, 240);
        getChildren().add(label3);
		
        settings.bundle.subscribe(v -> text3.setText(v.getString("upper")));
		//text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		text3.setLayoutX(10);
		text3.setLayoutY(250);
		text3.setPrefSize(320, 31);
        getChildren().add(text3);
        
        upper.setLayoutX(15);
        upper.setLayoutY(315);
        upper.setPrefSize(310, 45);
        upper.setMin(10);
        upper.setMax(220);
        upper.setValue(100);
        upper.setShowTickLabels(true);
        //exposure.setShowTickMarks(true);
        upper.setMajorTickUnit(30);
        //exposure.setMinorTickCount(5);
        //exposure.setBlockIncrement(10);
        getChildren().add(upper);
        
        settings.bundle.subscribe(v -> back3.setText(v.getString("back")));
        back3.setLayoutX(10);
        back3.setLayoutY(365);
        back3.setPrefSize(75, 25);
        back3.setOnAction(e -> Panel2.show(Panel1.stage, new Scene(new Panel2()), 190) );
        getChildren().add(back3);
        
        settings.bundle.subscribe(v -> next3.setText(v.getString("next")));
        next3.setLayoutX(255);
        next3.setLayoutY(365);
        next3.setPrefSize(75, 25);
        next3.setOnAction(e -> Panel2.show(Panel1.stage, new Scene(new Panel4()), 510) );
        getChildren().add(next3);
	}
}
