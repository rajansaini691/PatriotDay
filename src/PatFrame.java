import java.awt.Color;

import javax.swing.JFrame;

public class PatFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Patriot Day!!!");
		myFrame.setSize(800, 600);
		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
		
		PatPanel p1 = new PatPanel();
		myFrame.add(p1);
		
		
	}

}
