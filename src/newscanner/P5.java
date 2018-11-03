package newscanner;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class P5 extends AnchorPane {
	
	static Canvas canvas = new Canvas(Main.stage.getWidth(), Main.stage.getHeight());
	
	static Scene scene5 = null;
    
    public P5() {
        getChildren().add(canvas);
        this.setStyle("-fx-background-color:BLACK");
        
    }

    public static void show() {
    	GraphicsContext gc = canvas.getGraphicsContext2D();
    	gc.setStroke(Color.GREEN);
        gc.setLineWidth(5);
        
        scene5 = new Scene(new P5());
        scene5.setOnKeyTyped(new EventHandler <KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCharacter().equals(" ")) {
					Main.stage.setScene(Main.scene4);
					Main.stage.show();
				}
			}
        	
        });
        
        Main.stage.setScene(scene5);
        Main.stage.setFullScreen(true);
        for(int x = 0; x <= Main.stage.getWidth(); x+=(Main.stage.getWidth()-1)/2) {
    		for(int y = 0; y <= Main.stage.getHeight(); y+=(Main.stage.getHeight()-1)/2) {
	    		gc.strokeLine(x, y-10, x, y+10);
	    		gc.strokeLine(x-10, y, x+10, y);
    		}
    	}
        Main.stage.show();
    }
}
