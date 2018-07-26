package newscanner;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CanvasPanel extends JFrame{
	
    public CanvasPanel() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 720);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
    }
    @Override
    public void paint(Graphics g) {
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, getWidth(), getHeight());
    	g.setColor(Color.GREEN);
    	Graphics2D g2 = (Graphics2D) g; 
    	g2.setStroke(new BasicStroke(5.0f));
    	
    	for(int x = 0; x <= getWidth(); x+=(getWidth()-1)/2) {
    		for(int y = 0; y <= getHeight(); y+=(getHeight()-1)/2) {
	    		g2.drawLine(x, y-10, x, y+10);
	    		g2.drawLine(x-10, y, x+10, y);
    		}
    	}
    } 

}
