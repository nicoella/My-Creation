/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of a rabbit's home.
 */

import hsa.Console;
import java.awt.*;

public class Background8 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color flowerPink = new Color(224, 173, 177);
	Color flowerYellow = new Color(235, 211, 132);
	Color flowerPurple = new Color(225, 192, 235);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw tree trunks
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(240 + x, 175, 240 + x, 425);
	    }
	    for (int x = 0; x <= 30; x++) {
		c.drawLine(480 + x, 250, 480 + x, 425);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(230 - ring / 2, 135 - ring / 2, ring, ring);
		c.drawOval(210 - ring / 2, -20 - ring / 2, ring, ring);
		c.drawOval(370 - ring / 2, -20 - ring / 2, ring, ring);
		c.drawOval(370 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(550 - ring / 2, 170 - ring / 2, ring, ring);
		c.drawOval(490 - ring / 2, 150 - ring / 2, ring, ring);
		c.drawOval(430 - ring / 2, 185 - ring / 2, ring, ring);
		c.drawOval(450 - ring / 2, 225 - ring / 2, ring, ring);
		c.drawOval(510 - ring / 2, 225 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 140; ring++) {
		c.drawOval(320 - ring / 2, 130 - ring / 2, ring, ring);
		c.drawOval(240 - ring / 2, 50 - ring / 2, ring, ring);
		c.drawOval(290 - ring / 2, 50 - ring / 2, ring, ring);
		c.drawOval(180 - ring / 2, 75 - ring / 2, ring, ring);
	    }

	    //draw bushes
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(440 - ring / 2, 390 - ring / 2, ring, ring);
		c.drawOval(480 - ring / 2, 410 - ring / 2, ring, ring);
		c.drawOval(420 - ring / 2, 420 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 120; ring++) {
		c.drawOval(260 - ring / 2, 405 - ring / 2, ring, ring);
		c.drawOval(200 - ring / 2, 430 - ring / 2, ring, ring);
		c.drawOval(300 - ring / 2, 440 - ring / 2, ring, ring);
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	    for (int x = 0; x <= 2; x++) {
		c.drawLine(230 + x, 425, 240, 340);
		c.drawLine(458 + x, 425, 448, 350);
	    }

	    //draw flowers
	    c.setColor(flowerPurple);
	    for (int ring = 0; ring <= 12; ring++) {
		c.drawOval(228 - ring / 2, 390 - ring / 4, ring, ring / 2);
		c.drawOval(229 - ring / 2, 377 - ring / 4, ring, ring / 2);
		c.drawOval(230 - ring / 2, 364 - ring / 4, ring, ring / 2);
		c.drawOval(231 - ring / 2, 351 - ring / 4, ring, ring / 2);
		c.drawOval(242 - ring / 2, 390 - ring / 4, ring, ring / 2);
		c.drawOval(243 - ring / 2, 377 - ring / 4, ring, ring / 2);
		c.drawOval(244 - ring / 2, 364 - ring / 4, ring, ring / 2);
		c.drawOval(245 - ring / 2, 351 - ring / 4, ring, ring / 2);
		c.drawOval(238 - ring / 4, 338 - ring / 2, ring / 2, ring);

		c.drawOval(448 - ring / 2, 394 - ring / 4, ring, ring / 2);
		c.drawOval(446 - ring / 2, 381 - ring / 4, ring, ring / 2);
		c.drawOval(444 - ring / 2, 368 - ring / 4, ring, ring / 2);
		c.drawOval(442 - ring / 2, 355 - ring / 4, ring, ring / 2);
		c.drawOval(462 - ring / 2, 394 - ring / 4, ring, ring / 2);
		c.drawOval(460 - ring / 2, 381 - ring / 4, ring, ring / 2);
		c.drawOval(458 - ring / 2, 368 - ring / 4, ring, ring / 2);
		c.drawOval(456 - ring / 2, 355 - ring / 4, ring, ring / 2);
		c.drawOval(449 - ring / 4, 342 - ring / 2, ring / 2, ring);
	    }
	}
    }

    public Background8(Console con) {
	c = con;
	draw();
    }
}
