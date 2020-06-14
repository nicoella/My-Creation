/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a deer talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class Opossum extends Thread {

    private Console c;

    public Opossum(Console con) {
	c = con;
    }

    public void opossum() {
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color white = new Color(255, 255, 255);
	Color lightPink = new Color(214, 198, 203);
	Color brown = new Color(92, 84, 78);
	Color darkBrown = new Color(51, 36, 22);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int cX = -100, cY = 435; //variables to store the current top-left coordinate of the opossum
	int x = 0, y = 0; //variables used in for loops to move the opossum around

	for (x = 0; x <= 170; x++) {
	    synchronized (c) {
		c.setColor(grassGreen);
		c.fillRect(cX - 1, cY + (x - 1) % 20 / 10 * -3, 93, 50);
	    }
	    synchronized (c) {
		cX++;
		y = x % 20 / 10 * -3; //used to animate height changes in the raccoon

		//draw the tail
		c.setColor(darkBrown);
		xPos = new int[]{
		    cX + 20, cX + 20, cX + 15, cX + 15
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 25 + y, cY + 25 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX + 15, cX + 15, cX, cX + 5
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 25 + y, cY + 15 + y, cY + 15 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX, cX + 5, cX
		};
		yPos = new int[]{
		    cY + 15 + y, cY + 15 + y, cY + 5 + y
		};
		c.fillPolygon(xPos, yPos, 3);
		//draw the back feet
		xPos = new int[]{
		    cX + 20, cX + 30 - x % 20 / 10 * 5, cX + 35 - x % 20 / 10 * 5, cX + 45
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 50 + y, cY + 50 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the front feet
		xPos = new int[]{
		    cX + 45, cX + 55 + x % 20 / 10 * 5, cX + 60 + x % 20 / 10 * 5, cX + 70
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 50 + y, cY + 50 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the body
		c.setColor(brown);
		c.fillOval(cX + 20, cY + y, 40, 40);
		c.fillRoundRect(cX + 40, cY + 5 + y, 30, 35, 10, 10);
		//draw the ear
		c.setColor(darkBrown);
		c.fillOval(cX + 62, cY + y, 10, 10);
		//draw the face
		c.setColor(white);
		c.fillArc(cX + 55, cY + 5 + y, 40, 35, 100, 170);
		xPos = new int[]{
		    cX + 70, cX + 90, cX + 90, cX + 73
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 40 + y, cY + 35 + y, cY + 5 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 67, cY + 20 + y, 5, 5);
		//draw the nose
		c.setColor(lightPink);
		c.fillOval(cX + 88, cY + 35 + y, 4, 4);
	    }
	    try {
		sleep(25);
	    } catch (Exception e) {
	    }
	}

	//delay when the opossum starts talking
	try {
	    sleep(1000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 100, cY + 5, 200, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("I just got back from looking", cX + 110, cY + 20);
	    c.drawString("for food and my tree is gone!", cX + 110, cY + 35);
	    c.drawString("AAAAAAAAHHHHH!!!", cX + 110, cY + 50);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(8000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 100, cY + 5, 202, 52);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 105, cY + 5, 180, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Yes, I must leave to find", cX + 110, cY + 20);
	    c.drawString("another tree. But, I will make", cX + 110, cY + 35);
	    c.drawString("sure to come back and visit!", cX + 110, cY + 50);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(10000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //erase the opossum
	    c.fillRect(cX + 105, cY + 5, 182, 52);
	    //erase the speech bubble
	    c.fillRect(cX, cY, 93, 50);
	}

	for (x = 0; x >= -250; x--) {
	    y = x % 20 / 10 * 5; //used to animate height changes in the opossum
	    synchronized (c) {

		//draw the tail
		c.setColor(darkBrown);
		xPos = new int[]{
		    cX + 73 + x, cX + 73 + x, cX + 78 + x, cX + 78 + x
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 25 + y, cY + 25 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX + 78 + x, cX + 78 + x, cX + 93 + x, cX + 88 + x
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 25 + y, cY + 15 + y, cY + 15 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX + 93 + x, cX + 88 + x, cX + 93 + x
		};
		yPos = new int[]{
		    cY + 15 + y, cY + 15 + y, cY + 5 + y
		};
		c.fillPolygon(xPos, yPos, 3);
		//draw the feet
		xPos = new int[]{
		    cX + 73 + x, cX + 63 + x - x % 20 / 10 * 5, cX + 58 + x - x % 20 / 10 * 5, cX + 48 + x
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 50 + y, cY + 50 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX + 48 + x, cX + 38 + x + x % 20 / 10 * 5, cX + 33 + x + x % 20 / 10 * 5, cX + 23 + x
		};
		yPos = new int[]{
		    cY + 20 + y, cY + 50 + y, cY + 50 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the body
		c.setColor(brown);
		c.fillOval(cX + 33 + x, cY + y, 40, 40);
		c.fillRoundRect(cX + 23 + x, cY + 5 + y, 30, 35, 10, 10);
		//draw the ear
		c.setColor(darkBrown);
		c.fillOval(cX + 21 + x, cY + y, 10, 10);
		//draw the face
		c.setColor(white);
		c.fillArc(cX - 2 + x, cY + 5 + y, 40, 35, 280, 160);
		xPos = new int[]{
		    cX + 23 + x, cX + 3 + x, cX + 3 + x, cX + 20 + x
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 40 + y, cY + 35 + y, cY + 5 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 21 + x, cY + 20 + y, 5, 5);
		//draw the nose
		c.setColor(lightPink);
		c.fillOval(cX + 1 + x, cY + 35 + y, 4, 4);
	    }

	    //used to delay the animation
	    try {
		sleep(25);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the opossum
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY + y, 93, 50);
	    }
	}

    }

    public void run() {
	opossum();
    }
}
