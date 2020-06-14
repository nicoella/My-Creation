/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of an opossum's home.
 */

import hsa.Console;
import java.awt.*;

public class Background7 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushGreen = new Color(107, 153, 63);
	Color bushLightGreen = new Color(154, 204, 105);
	Color gray = new Color(153, 138, 126);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw bushes
	    c.setColor(bushGreen);
	    for (int ring = 1; ring <= 25; ring++) {
		c.drawOval(75 - ring / 2, 370 - ring / 2, ring, ring);
		c.drawOval(115 - ring / 2, 465 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(500 - ring / 2, 395 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(30 - ring / 2, 380 - ring / 2, ring, ring);
		c.drawOval(90 - ring / 2, 425 - ring / 2, ring, ring);
		c.drawOval(10 - ring / 2, 465 - ring / 2, ring, ring);
		c.drawOval(440 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(530 - ring / 2, 450 - ring / 2, ring, ring);
		c.drawOval(400 - ring / 2, 390 - ring / 2, ring, ring);
		c.drawOval(460 - ring / 2, 440 - ring / 2, ring, ring);
	    }
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(400 - ring / 2, 415 - ring / 2, ring, ring);
		c.drawOval(300 - ring / 2, 465 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(430 - ring / 2, 450 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 120; ring++) {
		c.drawOval(360 - ring / 2, 455 - ring / 2, ring, ring);
	    }

	    //draw tree stumps
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 60; x++) {
		c.drawLine(45 + (int) (x / 1.25), 375, 40 + x, 425);
		c.drawLine(465 + (int) (x / 1.25), 375, 460 + x, 425);
	    }
	    c.setColor(gray);
	    for (int ring = 0; ring <= 50; ring++) {
		c.drawOval(69 - ring / 2, 375 - ring / 6, ring, ring / 3);
		c.drawOval(489 - ring / 2, 375 - ring / 6, ring, ring / 3);
	    }
	    c.setColor(treeBrown);
	    for (int ring = 1; ring <= 4; ring++) {
		c.drawOval(69 - ring * 10 / 2, 375 - ring * 10 / 6, ring * 10, ring * 10 / 3);
		c.drawOval(489 - ring * 10 / 2, 375 - ring * 10 / 6, ring * 10, ring * 10 / 3);
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(40 + x, 425, 35, 405);
		c.drawLine(42 + x, 425, 40, 400);
		c.drawLine(105 + x, 425, 108, 410);
		c.drawLine(107 + x, 425, 112, 415);
	    }
	}
    }

    public Background7(Console con) {
	c = con;
	draw();
    }
}
