/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of a porcupine's home.
 */

import hsa.Console;
import java.awt.*;

public class Background6 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color black = new Color(0, 0, 0);
	Color brown = new Color(92, 84, 78);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw tree trunks & branches
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 30; x++) {
		c.drawLine(90 + x, 150, 90 + x, 475);
	    }
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(450 + x, 175, 450 + x, 475);
	    }
	    for (int y = 0; y <= 10; y++) {
		c.drawLine(100, 220 + y, 160, 225);
		c.drawLine(455, 220 + y, 400, 225);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 95; ring++) {
		c.drawOval(100 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(125 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(125 - ring / 2, 125 - ring / 2, ring, ring);
		c.drawOval(85 - ring / 2, 135 - ring / 2, ring, ring);
		c.drawOval(75 - ring / 2, 115 - ring / 2, ring, ring);
		c.drawOval(450 - ring / 2, 135 - ring / 2, ring, ring);
		c.drawOval(440 - ring / 2, 95 - ring / 2, ring, ring);
		c.drawOval(490 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(540 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(500 - ring / 2, 150 - ring / 2, ring, ring);
	    }

	    //draw bush
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawOval(225 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(140 - ring / 2, 465 - ring / 2, ring, ring);
		c.drawOval(240 - ring / 2, 470 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 70; ring++) {
		c.drawOval(230 - ring / 2, 435 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(180 - ring / 2, 425 - ring / 2, ring, ring);
		c.drawOval(190 - ring / 2, 475 - ring / 2, ring, ring);
	    }

	    //cattail plant
	    c.setColor(black);
	    c.drawLine(330, 425, 332, 330);
	    c.drawLine(570, 425, 567, 345);
	    c.drawLine(577, 425, 580, 335);
	    c.setColor(brown);
	    for (int ring = 0; ring <= 25; ring++) {
		c.drawOval(331 - ring / 6, 347 - ring / 2, ring / 3, ring);
		c.drawOval(568 - ring / 6, 360 - ring / 2, ring / 3, ring);
		c.drawOval(579 - ring / 6, 352 - ring / 2, ring / 3, ring);
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(325 + x, 425, 320, 420);
		c.drawLine(327 + x, 425, 326, 400);
		c.drawLine(329 + x, 425, 335, 415);
		c.drawLine(570 + x, 425, 567, 405);
		c.drawLine(573 + x, 425, 576, 395);
		c.drawLine(576 + x, 425, 579, 415);
		c.drawLine(585 + x, 425, 580, 415);
		c.drawLine(587 + x, 425, 589, 400);
		c.drawLine(588 + x, 425, 590, 402);
		c.drawLine(610 + x, 425, 607, 400);
		c.drawLine(612 + x, 425, 613, 405);
		c.drawLine(614 + x, 425, 617, 395);
	    }

	    //draw polluted lake
	    c.setColor(black);
	    for (int y = 0; y <= 10; y++) {
		c.drawLine(350, 425 + y, 550, 425 + y);
	    }
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawArc(350 - ring / 2, 425 - ring / 2, ring, ring, 180, 180);
		c.drawArc(550 - ring / 2, 425 - ring / 2, ring, ring, 180, 180);
	    }
	}
    }

    public Background6(Console con) {
	c = con;
	draw();
    }
}
