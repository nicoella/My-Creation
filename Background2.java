/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of scenery near the edge of a forest.
 */

import hsa.Console;
import java.awt.*;

public class Background2 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color bushGreen = new Color(107, 153, 63);
	Color bushDarkGreen = new Color(67, 102, 33);
	Color flowerRed = new Color(245, 88, 88);
	Color flowerOrange = new Color(245, 136, 88);
	Color flowerPurple = new Color(225, 192, 235);
	Color flowerYellow = new Color(235, 211, 132);
	Color lightGray = new Color(163, 163, 159);
	Color gray = new Color(153, 138, 126);
	Color darkGray = new Color(133, 119, 109);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw back bushes
	    c.setColor(bushDarkGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(300 - ring / 2, 375 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 150; ring++) {
		c.drawOval(360 - ring / 2, 350 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 250; ring++) {
		c.drawOval(380 - ring / 2, 445 - ring / 2, ring, ring);
	    }
	    c.setColor(bushGreen);
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(40 - ring / 2, 350 - ring / 2, ring, ring);
		c.drawOval(170 - ring / 2, 355 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 130; ring++) {
		c.drawOval(500 - ring / 2, 325 - ring / 2, ring, ring);
		c.drawOval(550 - ring / 2, 315 - ring / 2, ring, ring);
		c.drawOval(460 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(600 - ring / 2, 375 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 140; ring++) {
		c.drawOval(100 - ring / 2, 325 - ring / 2, ring, ring);
		c.drawOval(210 - ring / 2, 425 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 200; ring++) {
		c.drawOval(70 - ring / 2, 455 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 250; ring++) {
		c.drawOval(520 - ring / 2, 460 - ring / 2, ring, ring);
	    }

	    //draw back tree trunks and branches
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(370 + x, 175, 370 + x, 475);
		c.drawLine(530 + x, 100, 530 + x, 475);
	    }
	    for (int y = 0; y <= 8; y++) {
		c.drawLine(370, 210 + y, 340, 214);
	    }

	    //draw front bushes
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 35; ring++) {
		c.drawOval(50 - ring / 2, 380 - ring / 2, ring, ring);
		c.drawOval(375 - ring / 2, 380 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 50; ring++) {
		c.drawOval(640 - ring / 2, 330 - ring / 2, ring, ring);
		c.drawOval(20 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(290 - ring / 2, 410 - ring / 2, ring, ring);
		c.drawOval(380 - ring / 2, 410 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 75; ring++) {
		c.drawOval(620 - ring / 2, 375 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(630 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(30 - ring / 2, 425 - ring / 2, ring, ring);
		c.drawOval(330 - ring / 2, 380 - ring / 2, ring, ring);
	    }

	    //draw rocks
	    c.setColor(lightGray);
	    for (int y = 0; y <= 75; y++) {
		int[] xPos = {440, 450, 515, 540, 560};
		int[] yPos = {425, 365 + y, 350 + y, 375 + y, 425};
		c.drawPolygon(xPos, yPos, 5);
	    }
	    c.setColor(gray);
	    for (int y = 0; y <= 50; y++) {
		int[] xPos = {540, 540, 570, 600, 610};
		int[] yPos = {425, 380 + y, 375 + y, 385 + y, 425};
		c.drawPolygon(xPos, yPos, 5);
	    }
	    for (int y = 0; y <= 60; y++) {
		int[] xPos = {440, 450, 490, 540, 560};
		int[] yPos = {425, 365 + y, 380 + y, 375 + y, 425};
		c.drawPolygon(xPos, yPos, 5);
	    }
	    c.setColor(darkGray);
	    for (int y = 0; y <= 45; y++) {
		int[] xPos = {540, 540, 580, 600, 610};
		int[] yPos = {425, 380 + y, 395 + y, 385 + y, 425};
		c.drawPolygon(xPos, yPos, 5);
	    }

	    //draw front tree trunks and branches
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(110 + x, 125, 110 + x, 475);
	    }
	    for (int y = 0; y <= 8; y++) {
		c.drawLine(130, 235 + y, 180, 239);
		c.drawLine(110, 215 + y, 55, 219);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 0; ring <= 5; ring++) {
		c.drawOval(81 - ring / 2, 215 - ring / 2, ring, ring);
		c.drawOval(79 - ring / 2, 219 - ring / 2, ring, ring);
		c.drawOval(163 - ring / 2, 235 - ring / 2, ring, ring);
		c.drawOval(170 - ring / 2, 237 - ring / 2, ring, ring);
		c.drawOval(356 - ring / 2, 208 - ring / 2, ring, ring);
		c.drawOval(359 - ring / 2, 210 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 7; ring++) {
		c.drawOval(75 - ring / 2, 215 - ring / 2, ring, ring);
		c.drawOval(167 - ring / 2, 233 - ring / 2, ring, ring);
		c.drawOval(353 - ring / 2, 212 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 80; ring++) {
		c.drawOval(440 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(430 - ring / 2, 135 - ring / 2, ring, ring);
		c.drawOval(340 - ring / 2, 90 - ring / 2, ring, ring);
		c.drawOval(525 - ring / 2, 40 - ring / 2, ring, ring);
		c.drawOval(525 - ring / 2, 120 - ring / 2, ring, ring);
		c.drawOval(560 - ring / 2, 125 - ring / 2, ring, ring);
		c.drawOval(585 - ring / 2, 85 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 100; ring++) {
		c.drawOval(340 - ring / 2, 125 - ring / 2, ring, ring);
		c.drawOval(390 - ring / 2, 135 - ring / 2, ring, ring);
		c.drawOval(380 - ring / 2, 85 - ring / 2, ring, ring);
		c.drawOval(500 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(580 - ring / 2, 25 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 125; ring++) {
		c.drawOval(100 - ring / 2, 75 - ring / 2, ring, ring);
		c.drawOval(160 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(100 - ring / 2, 25 - ring / 2, ring, ring);
		c.drawOval(200 - ring / 2, 20 - ring / 2, ring, ring);
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
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(100 + x, 425, 90, 405);
		c.drawLine(103 + x, 425, 102, 400);
		c.drawLine(140 + x, 425, 150, 395);
		c.drawLine(140 + x, 425, 159, 405);
		c.drawLine(204 + x, 425, 195, 418);
		c.drawLine(206 + x, 425, 199, 413);
		c.drawLine(208 + x, 425, 210, 400);
		c.drawLine(210 + x, 425, 218, 414);
		c.drawLine(212 + x, 425, 222, 419);
		c.drawLine(230 + x, 425, 225, 410);
		c.drawLine(231 + x, 425, 233, 408);
		c.drawLine(232 + x, 425, 238, 410);
		c.drawLine(440 + x, 425, 431, 410);
		c.drawLine(441 + x, 425, 442, 408);
		c.drawLine(442 + x, 425, 448, 410);
		c.drawLine(470 + x, 425, 462, 412);
		c.drawLine(471 + x, 425, 470, 400);
		c.drawLine(472 + x, 425, 485, 412);
		c.drawLine(473 + x, 425, 490, 415);
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
	    c.setColor(flowerRed);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(210 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(215 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(214 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(206 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(205 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerOrange);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(470 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(475 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(474 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(466 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(465 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerYellow);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(210 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(470 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	}
    }

    public Background2(Console con) {
	c = con;
	draw();
    }
}
