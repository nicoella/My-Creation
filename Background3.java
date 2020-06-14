/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of a city.
 */

import hsa.Console;
import java.awt.*;

public class Background3 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color flowerRed = new Color(245, 88, 88);
	Color flowerYellow = new Color(235, 211, 132);
	Color lightGray = new Color(163, 163, 159);
	Color gray = new Color(153, 138, 126);
	Color darkGray = new Color(133, 119, 109);
	Color blueGray = new Color(132, 141, 143);
	Color darkBlue = new Color(92, 100, 102);
	Color darkPurple = new Color(149, 145, 153);
	Color windowYellow = new Color(203, 204, 188, 150);
	Color windowBlue = new Color(173, 215, 224, 150);
	Color brown = new Color(92, 84, 78);
	Color darkBrown = new Color(51, 36, 22);
	Color black = new Color(0, 0, 0);
	Color white = new Color(255, 255, 255);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw buildings
	    c.setColor(darkPurple);
	    for (int x = 0; x <= 60; x++) {
		c.drawLine(340 + x, 225, 340 + x, 425);
	    }
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(340, 225, 340 - x, 425);
	    }
	    c.setColor(windowYellow);
	    for (int x = 0; x < 3; x++) {
		for (int n = 0; n <= 5; n++) {
		    c.drawLine(360 + x * 15 + n, 230, 360 + x * 15 + n, 380);
		}
	    }
	    c.setColor(darkBlue);
	    for (int x = 0; x <= 50; x++) {
		c.drawLine(380 + x, 385, 380 + x, 425);
	    }
	    c.setColor(blueGray);
	    for (int y = 0; y <= 1; y++) {
		for (int x = 0; x < 3; x++) {
		    for (int n = 0; n <= 7; n++) {
			c.drawLine(385 + x * 15 + n, 395 + y * 15, 385 + x * 15 + n, 398 + y * 15);
		    }
		}
	    }
	    for (int x = 0; x < 2; x++) {
		for (int n = 0; n < 16; n++) {
		    c.drawLine(385 + x * 23 + n, 403, 385 + x * 23 + n, 406);
		}
	    }
	    c.setColor(brown);
	    for (int x = 0; x <= 60; x++) {
		c.drawLine(280 + x, 330, 280 + x, 425);
	    }
	    c.setColor(darkBrown);
	    for (int x = 0; x <= 17; x++) {
		c.drawLine(280 + x * 4, 345, 280 + x * 4, 370);
		c.drawLine(280 + x * 4, 375, 280 + x * 4, 400);
	    }
	    c.drawLine(280, 345, 348, 345);
	    c.drawLine(280, 370, 348, 370);
	    c.drawLine(280, 375, 348, 375);
	    c.drawLine(280, 400, 348, 400);
	    c.setColor(windowYellow);
	    for (int x = 0; x < 3; x++) {
		for (int y = 0; y <= 5; y++) {
		    c.drawLine(285 + x * 20, 335 + y, 295 + x * 20, 335 + y);
		}
	    }
	    c.setColor(darkGray);
	    for (int x = 0; x <= 80; x++) {
		c.drawLine(200 + x, 175, 200 + x, 425);
	    }
	    c.setColor(lightGray);
	    for (int x = 0; x <= 3; x++) {
		for (int n = 0; n <= 2; n++) {
		    c.drawLine(210 + x * 20 + n * n, 175, 210 + x * 20 + n * n, 425);
		    c.drawLine(210 + x * 20 - n * n, 175, 210 + x * 20 - n * n, 425);
		}
	    }
	    for (int y = 0; y <= 50; y++) {
		c.drawLine(280, 125 + y, 200, 150 + y / 2);
	    }
	    c.setColor(gray);
	    for (int y = 0; y <= 1; y++) {
		c.drawLine(195, 160 + y, 285, 160 + y);
		c.drawLine(195, 175 + y, 285, 175 + y);
	    }
	    for (int x = 0; x <= 18; x++) {
		c.drawLine(195 + x * 5, 160, 195 + x * 5, 175);
	    }
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(195, 150 - y, 285, 125 - y);
	    }
	    c.setColor(darkBlue);
	    for (int x = 0; x <= 80; x++) {
		c.drawLine(160 + x, 225, 160 + x, 425);
	    }
	    for (int y = 0; y <= 4; y++) {
		for (int x = 0; x <= 5; x++) {
		    c.drawLine(160 - x, 245 + y * 25, 160 - x, 255 + y * 25);
		}
	    }
	    c.setColor(windowBlue);
	    for (int y = 0; y <= 5; y++) {
		for (int x = 0; x <= 3; x++) {
		    for (int n = 0; n <= 6; n++) {
			c.drawLine(167 + x * 20 + n, 237 + y * 25, 167 + x * 20 + n, 250 + y * 25);
		    }
		}
	    }

	    //draw truck
	    c.setColor(brown);
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(340, 275 + y, 455, 280 + y);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(435 + x, 275, 450 + x, 410);
	    }
	    c.setColor(black);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(425 + x, 405, 425 + x, 420);
	    }
	    for (int x = 0; x <= 10; x++) {
		c.drawLine(430 + x, 400, 430 + x, 405);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(455 + x, 400, 455 + x, 405);
	    }
	    c.drawLine(345, 280, 345, 350);
	    c.setColor(darkGray);
	    for (int y = 0; y <= 4; y++) {
		c.drawLine(325, 348 + y, 378, 348 + y);
	    }
	    c.setColor(gray);
	    for (int y = 0; y <= 4; y++) {
		c.drawLine(330, 345 + y, 375, 345 + y);
	    }
	    c.setColor(lightGray);
	    for (int x = 0; x <= 4; x++) {
		c.drawLine(345 + x, 345, 345 + x, 352);
	    }
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(435 - ring / 2, 422 - ring / 2, ring, ring);
		c.drawOval(457 - ring / 2, 422 - ring / 2, ring, ring);
	    }
	    c.setColor(windowYellow);
	    for (int x = 0; x <= 6; x++) {
		c.drawLine(432 + x, 402, 432 + x, 408);
	    }

	    //draw tree trunk and branches
	    c.setColor(treeBrown);
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(540 + x, 100, 540 + x, 425);
	    }
	    for (int y = 0; y <= 8; y++) {
		c.drawLine(440, 200, 540, 196 + y);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 7; ring++) {
		c.drawOval(455 - ring / 2, 200 - ring / 2, ring, ring);
		c.drawOval(448 - ring / 2, 196 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(500 - ring / 2, 70 - ring / 2, ring, ring);
		c.drawOval(485 - ring / 2, 35 - ring / 2, ring, ring);
		c.drawOval(610 - ring / 2, 25 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 125; ring++) {
		c.drawOval(580 - ring / 2, 70 - ring / 2, ring, ring);
		c.drawOval(510 - ring / 2, -15 - ring / 2, ring, ring);
		c.drawOval(580 - ring / 2, 0 - ring / 2, ring, ring);
	    }

	    //draw bushes
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 50; ring++) {
		c.drawOval(90 - ring / 2, 375 - ring / 2, ring, ring);
		c.drawOval(640 - ring / 2, 425 - ring / 2, ring, ring);
		c.drawOval(660 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	    for (int ring = 0; ring <= 130; ring++) {
		c.drawOval(30 - ring / 2, 365 - ring / 2, ring, ring);
		c.drawOval(70 - ring / 2, 425 - ring / 2, ring, ring);
	    }

	    //draw clouds
	    c.setColor(white);
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawOval(140 - ring / 2, 90 - ring / 2, ring, ring);
		c.drawOval(95 - ring / 2, 88 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 35; ring++) {
		c.drawOval(120 - ring / 2, 85 - ring / 2, ring, ring);
		c.drawOval(310 - ring / 2, 55 - ring / 2, ring, ring);
		c.drawOval(360 - ring / 2, 60 - ring / 2, ring, ring);
		c.drawOval(335 - ring / 2, 60 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 140; ring++) {
		c.drawOval(120 - ring / 2, 100 - ring / 20, ring, ring / 10);
		c.drawOval(340 - ring / 2, 70 - ring / 14, ring, ring / 7);
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(130 + x, 425, 122, 418);
		c.drawLine(131 + x, 425, 130, 405);
		c.drawLine(132 + x, 425, 140, 409);
		c.drawLine(133 + x, 425, 143, 412);
		c.drawLine(525 + x, 425, 515, 420);
		c.drawLine(526 + x, 425, 520, 400);
		c.drawLine(570 + x, 425, 575, 400);
		c.drawLine(571 + x, 425, 580, 414);
		c.drawLine(590 + x, 425, 587, 414);
		c.drawLine(591 + x, 425, 593, 400);
		c.drawLine(592 + x, 425, 608, 413);
	    }

	    //draw flower
	    c.setColor(flowerRed);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(593 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(598 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(597 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(588 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(587 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerYellow);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(593 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	}
    }

    public Background3(Console con) {
	c = con;
	draw();
    }
}
