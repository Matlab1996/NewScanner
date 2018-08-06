package newscanner;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSlider;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Panel2 extends Group {

	static Label text2 = new Label();
	static JFXSlider distance = new JFXSlider();
	static JFXButton back2 = new JFXButton();
	static JFXButton next2 = new JFXButton();

	public Panel2() {
		
        
        //label2.setLayoutX(10);
        //label2.setLayoutY(5);
        //label2.setPrefSize(320, 240);
        //root2.getChildren().add(label2);
		
		settings.bundle.subscribe(v -> text2.setText(v.getString("distanse")));
        //text2.setText("Настройка экспозиции");
		//text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		//text1.setBounds(10, 250, 320, 31);
        text2.setLayoutX(10);
        text2.setLayoutY(5);
        text2.setPrefSize(320, 31);
        getChildren().add(text2);
        
        //exposure.setIndicatorPosition(IndicatorPosition.RIGHT);
		//exposure.setBounds(10, 290, 320, 45);
        distance.setLayoutX(15);
        distance.setLayoutY(70);
        distance.setPrefSize(310, 45);
        distance.setMin(0);
        distance.setMax(15);
        distance.setValue(1);
        distance.setShowTickLabels(true);
        //exposure.setShowTickMarks(true);
        distance.setMajorTickUnit(1);
        //exposure.setMinorTickCount(5);
        //exposure.setBlockIncrement(10);
        getChildren().add(distance);
        
        settings.bundle.subscribe(v -> back2.setText(v.getString("back")));
        back2.setLayoutX(10);
        back2.setLayoutY(115);
        back2.setPrefSize(75, 25);
        back2.setOnAction(e -> show(Panel1.stage, Panel1.scene, 440) );
        getChildren().add(back2);
        
        settings.bundle.subscribe(v -> next2.setText(v.getString("next")));
        next2.setLayoutX(255);
        next2.setLayoutY(115);
        next2.setPrefSize(75, 25);
        next2.setOnAction(e -> show(Panel1.stage, new Scene(new Panel3()), 440) );
        /*next1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            	MainApp2 main = new MainApp2();
            }
        });*/
        getChildren().add(next2);

        //settings.group.onNext(root2);
        //settings.group.subscribe(v -> Panel1.scene = new Scene(v, Color.WHITE));
        
        //primaryStage.setScene(Panel1.scene);
        //primaryStage.setWidth(355);
        //primaryStage.setHeight(170);
        //primaryStage.show();
        //primaryStage.setTitle("OK");
	}
	
	public static void show (Stage primaryStage, Scene scene, int y) {
		primaryStage.setScene(scene);
        primaryStage.setWidth(355);
        primaryStage.setHeight(y);
        primaryStage.show();
        primaryStage.setTitle("OK");
	}
	
}
