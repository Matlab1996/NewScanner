package newscanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Back2ActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Panel.panel.removeAll();
		Panel.panel.setBackground(Color.white);
		settings.height.onNext(415);
		
		Panel.label.setBounds(10, 5, 320, 240);
		Panel.panel.add(Panel.label);
		
		settings.bundle.subscribe(v -> Panel.text1.setText(v.getString("exposure")));
		Panel.text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Panel.text1.setBounds(10, 250, 320, 31);
		Panel.panel.add(Panel.text1);
		
		settings.exposure.subscribe(value -> Panel.exposure.setValue(value));
		Panel.exposure.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				settings.exposure.onNext(Panel.exposure.getValue());
			}
		});
		Panel.exposure.setPaintTicks(true);
		Panel.exposure.setPaintLabels(true);
		Panel.exposure.setMajorTickSpacing(1);
		Panel.exposure.setSnapToTicks(false);
		Panel.exposure.setBackground(Color.white);
		Panel.exposure.setBounds(10, 290, 320, 45);
		Panel.panel.add(Panel.exposure);
		
		Panel.back1.setBorderPainted(true);
		Panel.back1.setBackground(Color.white);
		Panel.back1.setBounds(10, 340, 75, 25);
		Panel.back1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Panel.panel.add(Panel.back1);
		
		Panel.next1.setBackground(Color.white);
		Panel.next1.setBorderPainted(true);
		Panel.next1.setBounds(255, 340, 75, 25);
		Panel.next1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Panel.next1.addActionListener(new Next1ActionListener());
		Panel.panel.add(Panel.next1);
		
		Panel.Combo(340);
		Panel.panel.add(Panel.comboBox);

	}

}
