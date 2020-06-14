/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of a raccoon's home.
 */

import hsa.Console;
import java.awt.*;

public class Background5 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color lightGray = new Color(163, 163, 159);
	Color gray = new Color(153, 138, 126);
	Color darkGray = new Color(133, 119, 109);
	Color grayBrown = new Color(152, 132, 114);
	Color darkGrayBrown = new Color(112, 91, 72);
	Color orangeBrown = new Color(184, 133, 89);
	Color darkOrangeBrown = new Color(133, 83, 41);
	Color lightBlue = new Color(134, 143, 163);
	Color darkBlue = new Color(68, 96, 102);
	Color yellow = new Color(245, 235, 126);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw tree trunks and branches
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(40 + x, 200, 40 + x, 475);
		c.drawLine(400 + x, 175, 400 + x, 475);
	    }
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(60, 260 + y, 100, 262);
		c.drawLine(400, 285 + y, 340, 287);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 7; ring++) {
		c.drawOval(85 - ring / 2, 257 - ring / 2, ring, ring);
		c.drawOval(81 - ring / 2, 263 - ring / 2, ring, ring);
		c.drawOval(88 - ring / 2, 260 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(480 - ring / 2, 65 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 60; ring++) {
		c.drawOval(140 - ring / 2, 95 - ring / 2, ring, ring);
		c.drawOval(485 - ring / 2, 115 - ring / 2, ring, ring);
		c.drawOval(465 - ring / 2, 105 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(420 - ring / 2, 65 - ring / 2, ring, ring);
		c.drawOval(390 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(350 - ring / 2, 165 - ring / 2, ring, ring);
		c.drawOval(385 - ring / 2, 215 - ring / 4, ring, ring / 2);
		c.drawOval(455 - ring / 2, 165 - ring / 2, ring, ring);
		c.drawOval(420 - ring / 2, 165 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 150; ring++) {
		c.drawOval(80 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(10 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(0 - ring / 2, 165 - ring / 2, ring, ring);
		c.drawOval(100 - ring / 2, 160 - ring / 2, ring, ring);
	    }

	    //draw bush
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(600 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(580 - ring / 2, 400 - ring / 4, ring, ring / 2);
		c.drawOval(550 - ring / 2, 450 - ring / 2, ring, ring);
		c.drawOval(600 - ring / 2, 450 - ring / 2, ring, ring);
	    }

	    //draw fallen tree
	    c.setColor(darkGray);
	    for (int y = 0; y <= 60; y++) {
		c.drawLine(50, 365 + y, 190, 370 + y);
		c.drawLine(190, 370 + y, 280, 370 + y);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawArc(255 - ring / 2, 403 - ring / 2, ring, ring, 310, 105);
	    }
	    for (int x = 0; x <= 10; x++) {
		c.drawLine(75 + x, 365, 70 + x, 350);
	    }
	    c.setColor(lightGray);
	    for (int ring = 1; ring <= 60; ring++) {
		c.drawOval(50 - ring / 6, 395 - ring / 2, ring / 3, ring);
	    }
	    for (int ring = 1; ring <= 10; ring++) {
		c.drawOval(75 - ring / 2, 350 - ring / 4, ring, ring / 2);
	    }
	    c.setColor(gray);
	    for (int ring = 1; ring <= 3; ring++) {
		c.drawOval(50 - ring * 15 / 6, 395 - ring * 15 / 2, ring * 15 / 3, ring * 15);
	    }

	    //draw trash
	    c.setColor(darkGrayBrown);
	    for (int y = 0; y <= 20; y++) {
		c.drawLine(105, 348 + y, 110, 350 + (int) (y / 1.25));
		c.drawLine(115, 348 + y, 110, 350 + (int) (y / 1.25));
		c.drawLine(115, 348 + y, 120, 350 + (int) (y / 1.25));
		c.drawLine(125, 348 + y, 120, 350 + (int) (y / 1.25));
		c.drawLine(125, 348 + y, 130, 350 + (int) (y / 1.25));
		c.drawLine(135, 348 + y, 130, 350 + (int) (y / 1.25));
	    }
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawOval(135 - ring / 12, 358 - ring / 2, ring / 6, ring);
	    }
	    c.setColor(grayBrown);
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawOval(105 - ring / 12, 358 - ring / 2, ring / 6, ring);
	    }
	    c.setColor(orangeBrown);
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(310 + x, 395, 325 + x, 390);
	    }
	    for (int x = 0; x <= 20; x++) {
		c.drawLine(310 + x, 395, 310 + x, 425);
	    }
	    c.setColor(darkOrangeBrown);
	    for (int x = 0; x <= 20; x++) {
		c.drawLine(310 + x, 400, 310 + x, 415);
	    }
	    c.setColor(lightBlue);
	    for (int y = 0; y <= 25; y++) {
		c.drawLine(357, 405 + y / 2, 370, 400 + y);
	    }
	    for (int y = 0; y <= 25; y++) {
		c.drawLine(380, 400 + y, 400, 400 + y);
	    }
	    c.setColor(darkBlue);
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(357 - x, 405, 357 - x, 417);
	    }
	    for (int y = 0; y <= 25; y++) {
		c.drawLine(370, 400 + y, 380, 400 + y);
	    }
	    c.setColor(yellow);
	    for (int y = 0; y <= 15; y++) {
		c.drawLine(460, 410 + y, 480, 410 + y);
	    }
	    for (int y = 0; y <= 15; y++) {
		c.drawLine(480, 410 + y, 485, 415 + y / 3);
	    }
	    for (int y = 0; y <= 7; y++) {
		c.drawLine(460, 410 + y, 453, 407 + y / 2);
	    }
	    for (int y = 0; y <= 8; y++) {
		c.drawLine(460, 417 + y, 449, 420 + y / 3);
	    }
	    c.setColor(gray);
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(485, 415 + y, 493, 416 + (int) (y / 1.25));
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	}
    }

    public Background5(Console con) {
	c = con;
	draw();
    }
}
