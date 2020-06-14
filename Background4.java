/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of a deer's home.
 */

import hsa.Console;
import java.awt.*;

public class Background4 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushDarkGreen = new Color(67, 102, 33);
	Color flowerRed = new Color(245, 88, 88);
	Color flowerPurple = new Color(161, 120, 173);
	Color flowerPink = new Color(224, 173, 177);
	Color flowerBlue = new Color(155, 224, 219);
	Color flowerYellow = new Color(235, 211, 132);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw bushes
	    c.setColor(bushDarkGreen);
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(95 - ring / 2, 385 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 70; ring++) {
		c.drawOval(70 - ring / 2, 310 - ring / 2, ring, ring);
		c.drawOval(20 - ring / 2, 335 - ring / 2, ring, ring);
		c.drawOval(100 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(110 - ring / 2, 415 - ring / 2, ring, ring);
		c.drawOval(15 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(60 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(60 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(460 - ring / 2, 425 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(500 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(560 - ring / 2, 390 - ring / 2, ring, ring);
		c.drawOval(620 - ring / 2, 375 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 120; ring++) {
		c.drawOval(560 - ring / 2, 325 - ring / 4, ring, ring / 2);
		c.drawOval(140 - ring / 2, 350 - ring / 2, ring, ring);
		c.drawOval(160 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(150 - ring / 2, 320 - ring / 2, ring, ring);
		c.drawOval(200 - ring / 2, 380 - ring / 2, ring, ring);
	    }

	    //draw tree trunks
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(30 + x, 200, 30 + x, 475);
		c.drawLine(600 + x, 150, 600 + x, 475);
	    }
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(50, 260 + y, 90, 263);
		c.drawLine(600, 185 + y, 550, 188);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 7; ring++) {
		c.drawOval(75 - ring / 2, 258 - ring / 2, ring, ring);
		c.drawOval(77 - ring / 2, 263 - ring / 2, ring, ring);
		c.drawOval(70 - ring / 2, 261 - ring / 2, ring, ring);
		c.drawOval(575 - ring / 2, 185 - ring / 2, ring, ring);
		c.drawOval(579 - ring / 2, 188 - ring / 2, ring, ring);
		c.drawOval(571 - ring / 2, 187 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(40 - ring / 2, 195 - ring / 2, ring, ring);
		c.drawOval(5 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(0 - ring / 2, 185 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(50 - ring / 2, 85 - ring / 2, ring, ring);
		c.drawOval(100 - ring / 2, 125 - ring / 2, ring, ring);
		c.drawOval(90 - ring / 2, 175 - ring / 2, ring, ring);
		c.drawOval(30 - ring / 2, 150 - ring / 2, ring, ring);
		c.drawOval(570 - ring / 2, 125 - ring / 2, ring, ring);
		c.drawOval(540 - ring / 2, 65 - ring / 2, ring, ring);
		c.drawOval(570 - ring / 2, 35 - ring / 2, ring, ring);
		c.drawOval(630 - ring / 2, 115 - ring / 2, ring, ring);
		c.drawOval(620 - ring / 2, 60 - ring / 2, ring, ring);
		c.drawOval(630 - ring / 2, 25 - ring / 2, ring, ring);

	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //arrays learnt from: https://www.tutorialspoint.com/java/java_arrays.htm
	    int[] nums = new int[]{
		1, -1, 5, -2, -4, -5, 2, 3, -2, -1, -6, -3, 4, 5, -3, -4, -3, -1, -4, -4, -2, 2, 0, 0, 0, 3, 0, -4, -3, 3, 4, 4, 2, 0, 0, -3, 0, -4, -3, 2, -2, 0, -4, -3, 4, 3, -4, 3, 0, 2, 0, 1, -2, 4, -3, -2, -2, 0, 0, 1, -1, 5, -2, -4, -5, 2, 3, -2, -1, -6, -3, 4, 5, -3, -4, -3, -1, -4, -4, -2, 2, 0, 0, 0, 3, 0, -4, -3, 3, 4, 4, 2, 0, 0, -3, 0, -4, -3, 2, -2, 0, -4, -3, 4, 3, -4, 3, 0, 2, 0, 1, -2, 4, -3, -2, -2, 0, 0
	    };
	    for (int x = 0; x < 40; x++) {
		for (int n = 0; n <= 3; n++) {
		    c.drawLine(220 + x * 5 + n, 425, 220 + x * 5 + nums[x] + 3, 405 + nums[x]);
		}
	    }

	    for (int x = 0; x <= 5; x++) {
		c.drawLine(248 + x, 425, 250, 400);
		c.drawLine(340 + x, 425, 342, 400);
		c.drawLine(550 + x, 425, 552, 400);
	    }

	    //draw flowers
	    c.setColor(flowerRed);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(250 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(255 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(254 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(246 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(245 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerBlue);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(552 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(557 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(556 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(548 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(547 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerPink);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(343 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(348 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(347 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(339 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(338 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerYellow);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(250 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(343 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(552 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	}
    }

    public Background4(Console con) {
	c = con;
	draw();
    }
}
