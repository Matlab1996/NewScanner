package newscanner;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Panel5 extends Group {
	
	static Canvas canvas = new Canvas(Panel1.stage.getWidth(), Panel1.stage.getHeight());
    
    public Panel5() {
        getChildren().add(canvas);
        
    }

    public static void show() {
    	GraphicsContext gc = canvas.getGraphicsContext2D();
    	gc.setStroke(Color.GREEN);
        gc.setLineWidth(5);
        Panel1.stage.setScene(new Scene(new Panel5(), Color.BLACK));
        Panel1.stage.setFullScreen(true);
        for(int x = 0; x <= Panel1.stage.getWidth(); x+=(Panel1.stage.getWidth()-1)/2) {
    		for(int y = 0; y <= Panel1.stage.getHeight(); y+=(Panel1.stage.getHeight()-1)/2) {
	    		gc.strokeLine(x, y-10, x, y+10);
	    		gc.strokeLine(x-10, y, x+10, y);
    		}
    	}
        Panel1.stage.show();
    }
}
