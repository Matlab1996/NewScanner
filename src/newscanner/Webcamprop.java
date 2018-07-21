package newscanner;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Webcamprop extends JFrame {

	public static void main(String[] args) throws IOException, AWTException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel app = new Panel();
					app.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
