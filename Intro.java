/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws the introduction to the animation.
*/

import hsa.Console;
import java.awt.*;

public class Intro {

    private Console c;

    public Intro(Console con) {
	c = con;
	draw();
    }

    public void draw() {
	Color black = new Color(0, 0, 0);
	Color white = new Color(255, 255, 255);
	Font f1 = new Font("TimesRoman", Font.BOLD, 35);
	Font f2 = new Font("TimesRoman", Font.PLAIN, 15);
	
	//colour the screen black
	c.setColor(black);
	for (int y = 0; y <= 500; y++) {
	    c.drawLine(0, y, 640, y);
	}
	c.setColor(white);
	//draw the title
	c.setFont(f1);
	c.drawString("U R B A N   S P R A W L", 120, 200);
	//draw supplementary information
	c.setFont(f2);
	c.drawString("A short animation on how urban sprawl affects forest animals.", 130, 250);
	//keep intro on the screen for 5 seconds
	try {
	    Thread.sleep(5000);
	} catch (Exception e) {
	}
    }
}
