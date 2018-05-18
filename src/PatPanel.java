import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PatPanel extends JPanel {
	
	//Sets variables
	Font fonty = new Font("Comic Sans MS", Font.BOLD, 60);
	Color colory = new Color(255, 0, 255);
	int flagHeight = 28;
	int starSpacing = 71;
	int starHeight = 70;
	
	public void paintComponent(Graphics g) {
		//Draws a red rectangle - the back of the flag
		g.setColor(Color.RED);		
		g.fillRect(10, 10, 700, 368);
		
		//Draws a blue square on it - the place where the stars are
		g.setColor(Color.BLUE);
		g.fillRect(10, 10, 300, 200);
		
		//Draws the white stripes:
		//Top stripes
		g.setColor(Color.WHITE);
		for(int i = 0; i < 3; i++) {
			g.fillRect(310, 10 + flagHeight + 2 * flagHeight * i, 400, flagHeight);
		}
		
		//Bottom stripes
		for(int i = 0; i < 3; i++) {
			g.fillRect(10, 210 + 2 * flagHeight * i, 700, flagHeight);
		}
		
		//Draw Stars
		g.setColor(Color.WHITE);
		g.setFont(fonty);
		
		//Draw normal stars
		for(int i = 0; i < 6; i++) {
			g.drawString("*", 20 + i * 50, starHeight);
		}
		
		for(int i = 0; i < 6; i++) {
			g.drawString("*", 20 + i * 50, starHeight + starSpacing);
		}
		
		for(int i = 0; i < 6; i++) {
			g.drawString("*", 20 + i * 50, starHeight + starSpacing * 2);
		}

		//Draw offset stars
		for(int i = 0; i < 5; i++) {
			g.drawString("*", 45 + i * 50, starHeight * 3/2);
		}
		
		for(int i = 0; i < 5; i++) {
			g.drawString("*", 45 + i * 50, starHeight * 5/2);
		}
		
	}
	
}
