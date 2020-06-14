/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of the side of a road.
 */

import hsa.Console;
import java.awt.*;

public class Background9 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushDarkGreen = new Color(67, 102, 33);
	Color bushGreen = new Color(107, 153, 63);
	Color gray = new Color(100, 100, 100);
	Color darkGray = new Color(50, 50, 50);
	Color black = new Color(0, 0, 0);
	Color lightYellow = new Color(240, 220, 70);
	Color grayBrown = new Color(152, 132, 114);
	Color darkGrayBrown = new Color(112, 91, 72);
	Font f1 = new Font("Arial", Font.BOLD, 15);
	Font f2 = new Font("Arial", Font.BOLD, 40);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw bushes
	    c.setColor(bushDarkGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(170 - ring / 2, 350 - ring / 2, ring, ring);
		c.drawOval(130 - ring / 2, 365 - ring / 2, ring, ring);
		c.drawOval(210 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(170 - ring / 2, 425 - ring / 2, ring, ring);
		c.drawOval(220 - ring / 2, 425 - ring / 2, ring, ring);
	    }
	    c.setColor(bushGreen);
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(20 - ring / 2, 350 - ring / 2, ring, ring);
		c.drawOval(60 - ring / 2, 380 - ring / 2, ring, ring);
		c.drawOval(90 - ring / 2, 420 - ring / 2, ring, ring);
		c.drawOval(20 - ring / 2, 400 - ring / 2, ring, ring);
	    }

	    //draw sign
	    c.setColor(darkGray);
	    for (int x = 620; x <= 625; x++) {
		c.drawLine(x, 300, x, 425);
	    }
	    c.setColor(lightYellow);
	    for (int x = 590; x <= 640; x++) {
		c.drawLine(x, 225, x, 325);
	    }
	    c.setFont(f1);
	    c.setColor(black);
	    c.drawString("MAXIMUM", 600, 250);
	    c.drawString("KM/H", 600, 315);
	    c.setFont(f2);
	    c.drawString("50", 600, 290);

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw dead squirrel
	    //draw tail
	    c.setColor(darkGrayBrown);
	    c.fillRoundRect(315, 475, 20, 10, 10, 10);
	    c.fillRoundRect(325, 475, 10, 15, 10, 10);
	    //draw face
	    c.setColor(grayBrown);
	    c.fillOval(260, 460, 25, 25);
	    c.fillOval(267, 454, 15, 15);
	    //draw ear
	    c.fillRoundRect(257, 475, 10, 5, 5, 5);
	    //draw body
	    c.fillRoundRect(270, 465, 50, 20, 10, 10);
	    //draw legs
	    for (int x = 0; x <= 10; x++) {
		c.drawLine(283 + x, 465, 288, 457);
		c.drawLine(308 + x, 465, 313, 457);
	    }
	    //draw x-eye
	    c.setColor(black);
	    c.drawLine(270, 470, 275, 475);
	    c.drawLine(270, 471, 275, 476);
	    c.drawLine(270, 472, 275, 477);
	    c.drawLine(275, 470, 270, 475);
	    c.drawLine(275, 471, 270, 476);
	    c.drawLine(275, 472, 270, 477);

	    //draw road
	    c.setColor(gray);
	    for (int y = 425; y <= 450; y++) {
		c.drawLine(340, y, 620, y);
	    }
	}
    }

    public Background9(Console con) {
	c = con;
	draw();
    }
}
