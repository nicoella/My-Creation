/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class draws a background of the squirrel's home.
 */

import hsa.Console;
import java.awt.*;

public class Background1 {

    private Console c;

    public void draw() {
	Color skyBlue = new Color(182, 231, 245);
	Color leafGreen = new Color(169, 214, 126);
	Color treeBrown = new Color(112, 80, 75);
	Color grassGreen = new Color(127, 184, 71);
	Color bushLightGreen = new Color(154, 204, 105);
	Color bushGreen = new Color(107, 153, 63);
	Color flowerPink = new Color(224, 173, 177);
	Color flowerBlue = new Color(155, 224, 219);
	Color flowerOrange = new Color(245, 136, 88);
	Color flowerYellow = new Color(235, 211, 132);
	Color grayBrown = new Color(152, 132, 114);
	Color darkGrayBrown = new Color(112, 91, 72);
	Color black = new Color(0, 0, 0);
	Color gray = new Color(153, 138, 126);
	Color darkGray = new Color(122, 106, 91);

	synchronized (c) {
	    //draw sky
	    c.setColor(skyBlue);
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }

	    //draw back tree trunks and branches
	    c.setColor(treeBrown);
	    for (int y = 0; y <= 3; y++) {
		c.drawLine(261, 316 + y, 280, 318);
	    }
	    for (int x = 0; x <= 3; x++) {
		c.drawLine(320 + x, 227, 310, 250);
		c.drawLine(415 + x, 247, 440, 230);
	    }
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(250, 320 + y, 280, 310);
		c.drawLine(370, 225 + y, 310, 228);
		c.drawLine(390, 245 + y, 450, 248);
	    }
	    for (int x = 0; x <= 20; x++) {
		c.drawLine(230 + x, 275, 230 + x, 475);
		c.drawLine(510 + x, 225, 510 + x, 475);
	    }
	    for (int x = 0; x <= 30; x++) {
		c.drawLine(370 + x, 150, 370 + x, 475);

	    }

	    //draw back bushes
	    c.setColor(bushGreen);
	    for (int ring = 1; ring <= 35; ring++) {
		c.drawOval(147 - ring / 2, 450 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(455 - ring / 2, 405 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 50; ring++) {
		c.drawOval(425 - ring / 2, 455 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 55; ring++) {
		c.drawOval(430 - ring / 2, 423 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 60; ring++) {
		c.drawOval(80 - ring / 2, 435 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 75; ring++) {
		c.drawOval(115 - ring / 2, 435 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 90; ring++) {
		c.drawOval(0 - ring / 2, 430 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(460 - ring / 2, 442 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 105; ring++) {
		c.drawOval(30 - ring / 2, 470 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 110; ring++) {
		c.drawOval(105 - ring / 2, 475 - ring / 2, ring, ring);
	    }

	    //draw front bushes
	    c.setColor(bushLightGreen);
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(600 - ring / 2, 380 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(510 - ring / 2, 435 - ring / 2, ring, ring);
		c.drawOval(565 - ring / 2, 475 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(550 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 110; ring++) {
		c.drawOval(605 - ring / 2, 434 - ring / 2, ring, ring);
	    }

	    //draw front tree trunk and branches
	    c.setColor(treeBrown);
	    for (int y = 0; y <= 5; y++) {
		c.drawLine(40, 295 + y, 0, 300);
	    }
	    for (int y = 0; y <= 20; y++) {
		c.drawLine(60, 265 + y, 160, 265);
	    }
	    for (int x = 0; x <= 40; x++) {
		c.drawLine(30 + x, 200, 30 + x, 475);
	    }

	    //draw tree leaves
	    c.setColor(leafGreen);
	    for (int ring = 1; ring <= 7; ring++) {
		c.drawOval(300 - ring / 2, 221 - ring / 2, ring, ring);
		c.drawOval(305 - ring / 2, 227 - ring / 2, ring, ring);
		c.drawOval(308 - ring / 2, 243 - ring / 2, ring, ring);
		c.drawOval(316 - ring / 2, 245 - ring / 2, ring, ring);
		c.drawOval(438 - ring / 2, 245 - ring / 2, ring, ring);
		c.drawOval(442 - ring / 2, 248 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 10; ring++) {
		c.drawOval(298 - ring / 2, 227 - ring / 2, ring, ring);
		c.drawOval(310 - ring / 2, 250 - ring / 2, ring, ring);
		c.drawOval(438 - ring / 2, 252 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 20; ring++) {
		c.drawOval(60 - ring / 2, 190 - ring / 2, ring, ring);
		c.drawOval(515 - ring / 2, 185 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 25; ring++) {
		c.drawOval(80 - ring / 2, 200 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 40; ring++) {
		c.drawOval(235 - ring / 2, 230 - ring / 2, ring, ring);
		c.drawOval(255 - ring / 2, 245 - ring / 2, ring, ring);
		c.drawOval(540 - ring / 2, 185 - ring / 4, ring, ring / 2);
	    }
	    for (int ring = 1; ring <= 55; ring++) {
		c.drawOval(350 - ring / 2, 70 - ring / 2, ring, ring);
		c.drawOval(310 - ring / 2, 100 - ring / 2, ring, ring);
		c.drawOval(320 - ring / 2, 125 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 60; ring++) {
		c.drawOval(220 - ring / 2, 265 - ring / 2, ring, ring);
		c.drawOval(250 - ring / 2, 275 - ring / 2, ring, ring);
		c.drawOval(440 - ring / 2, 85 - ring / 3, ring, (int) (ring / 1.5));
		c.drawOval(510 - ring / 2, 215 - ring / 2, ring, ring);
		c.drawOval(540 - ring / 2, 250 - ring / 4, ring, ring / 2);
		c.drawOval(540 - ring / 2, 215 - ring / 2, ring, ring);
		c.drawOval(35 - ring / 2, 190 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 80; ring++) {
		c.drawOval(80 - ring / 2, 85 - ring / 2, ring, ring);
		c.drawOval(400 - ring / 2, 65 - ring / 2, ring, ring);
		c.drawOval(500 - ring / 2, 235 - ring / 4, ring, ring / 2);
	    }
	    for (int ring = 1; ring <= 100; ring++) {
		c.drawOval(360 - ring / 2, 125 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 130; ring++) {
		c.drawOval(80 - ring / 2, 142 - ring / 2, ring, ring);
	    }
	    for (int ring = 1; ring <= 150; ring++) {
		c.drawOval(20 - ring / 2, 120 - ring / 2, ring, ring);
		c.drawOval(415 - ring / 2, 125 - ring / 4, ring, ring / 2);
	    }

	    //draw grass
	    c.setColor(grassGreen);
	    for (int y = 425; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	    for (int x = 0; x <= 5; x++) {
		c.drawLine(28 + x, 425, 17, 400);
		c.drawLine(32 + x, 425, 30, 407);
		c.drawLine(68 + x, 425, 74, 398);
		c.drawLine(72 + x, 425, 87, 410);
		c.drawLine(190 + x, 425, 180, 410);
		c.drawLine(190 + x, 425, 187, 400);
		c.drawLine(191 + x, 425, 205, 400);
		c.drawLine(192 + x, 425, 210, 410);
		c.drawLine(268 + x, 425, 268, 400);
		c.drawLine(270 + x, 425, 282, 405);
		c.drawLine(287 + x, 425, 283, 410);
		c.drawLine(288 + x, 425, 288, 400);
		c.drawLine(293 + x, 425, 298, 410);
		c.drawLine(350 + x, 425, 338, 405);
		c.drawLine(353 + x, 425, 344, 395);
		c.drawLine(388 + x, 425, 395, 400);
		c.drawLine(392 + x, 425, 405, 405);
	    }

	    //draw flowers
	    c.setColor(flowerPink);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(187 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(192 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(191 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(183 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(182 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerBlue); //similar to sky
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(268 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(273 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(272 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(264 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(263 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerOrange);
	    for (int ring = 1; ring <= 6; ring++) {
		c.drawOval(288 - ring / 2, 395 - ring / 2, ring, ring);
		c.drawOval(293 - ring / 2, 398 - ring / 2, ring, ring);
		c.drawOval(292 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(284 - ring / 2, 404 - ring / 2, ring, ring);
		c.drawOval(283 - ring / 2, 398 - ring / 2, ring, ring);
	    }
	    c.setColor(flowerYellow);
	    for (int ring = 1; ring <= 5; ring++) {
		c.drawOval(187 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(268 - ring / 2, 400 - ring / 2, ring, ring);
		c.drawOval(288 - ring / 2, 400 - ring / 2, ring, ring);
	    }
	    
	    //draw nut
	    c.setColor(gray);
	    for(int ring=1; ring<=12; ring++) {
		c.drawOval(188-ring/2,471-ring/2,ring,ring);
	    }
	    c.setColor(darkGray);
	    for(int ring=1; ring<=18; ring++) {
		c.drawOval(188-ring/2,470-ring/4,ring,ring/2);
	    }
	}
    }

    public Background1(Console con) {
	c = con;
    }
    
    public static void main(String[] args) {
	Console k = new Console(30,60);
	Background1 b = new Background1(k);
	b.draw();
	ThiefSquirrel j = new ThiefSquirrel(k);
	j.run();
    }
}
