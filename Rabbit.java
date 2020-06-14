/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a rabbit talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class Rabbit extends Thread {

    private Console c;
    //color variables, declared globally to be used in multiple methods
    Color eyePatch = new Color(255, 255, 255);
    Color body = new Color(255, 255, 255);
    int delay = 15; //variable to delay the speed of the rabbit

    public Rabbit(Console con) { //overloaded constructor, default body colour, eyepatch colour, and speed
	c = con;
    }

    public Rabbit(Console con, Color epCol, int d) { //overloaded constructor, takes the colour of the eyepatch and the speed of the rabbit
	c = con;
	eyePatch = epCol;
	delay = d;
    }

    public Rabbit(Console con, Color epCol, Color bCol, int d) { //overloaded constructor, takes the colour of the eyepatch, the body colour, and the speed of the rabbit
	c = con;
	eyePatch = epCol;
	body = bCol;
	delay = d;
    }

    public void rabbit() {
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color lightPink = new Color(214, 198, 203);
	Color white = new Color(255, 255, 255);
	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int x = 0, y = 0; //variables used in for loops to move the rabbit around
	int cX = 200 - (30 - delay) / 5 * 60, cY = 430; //variables to store the current top-left coordinate of the rabbit

	for (int n = 0; n < 10; n++) {
	    y = n % 2 * -5;
	    synchronized (c) {
		c.setColor(body);
		//draw the head
		c.fillOval(cX + 25, cY + 10 + y, 30, 30);
		c.fillRoundRect(cX + 48, cY + 20 + y, 10, 15, 10, 10);
		//draw the nose
		c.setColor(lightPink);
		c.fillOval(cX + 57, cY + 23 + y, 3, 5);
		//draw the body
		c.setColor(body);
		c.fillArc(cX + 5, cY + 25 + y, 60, 60, 90, 90);
		c.fillRoundRect(cX + 5, cY + 50 + y, 35, 10, 10, 10);
		c.fillRect(cX + 35, cY + 55 + y, 10, 5);
		//draw the ear
		c.fillOval(cX + 25, cY + y, 10, 20);
		c.setColor(lightPink);
		c.fillOval(cX + 29, cY + 4 + y, 4, 15);
		//draw the front leg
		c.setColor(body);
		xPos = new int[]{
		    cX + 51, cX + 53, cX + 48, cX + 45, cX + 31, cX + 31
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 60 + y, cY + 60 + y, cY + 45 + y, cY + 55 + y, cY + 25 + y
		};
		c.fillPolygon(xPos, yPos, 6);
		//draw the tail
		c.fillOval(cX + 2, cY + 55 + y, 5, 5);
		//draw the eye patch
		c.setColor(eyePatch);
		c.fillOval(cX + 33, cY + 15 + y, 18, 18);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 41, cY + 20 + y, 5, 5);
	    }
	    try {
		sleep(delay * 20);
	    } catch (Exception e) {
	    }
	    synchronized (c) {
		c.setColor(grassGreen);
		c.fillRect(cX, cY + y, 61, 61);
	    }
	}

	synchronized (c) {
	    c.setColor(body);
	    //draw the head
	    c.fillOval(cX + 25, cY + 10, 30, 30);
	    c.fillRoundRect(cX + 48, cY + 20, 10, 15, 10, 10);
	    //draw the nose
	    c.setColor(lightPink);
	    c.fillOval(cX + 57, cY + 23, 3, 5);
	    //draw the body
	    c.setColor(body);
	    c.fillArc(cX + 5, cY + 25, 60, 60, 90, 90);
	    c.fillRoundRect(cX + 5, cY + 50, 35, 10, 10, 10);
	    c.fillRect(cX + 35, cY + 55, 10, 5);
	    //draw the ear
	    c.fillOval(cX + 25, cY, 10, 20);
	    c.setColor(lightPink);
	    c.fillOval(cX + 29, cY + 4, 4, 15);
	    //draw the front leg
	    c.setColor(body);
	    xPos = new int[]{
		cX + 51, cX + 53, cX + 48, cX + 45, cX + 31, cX + 31
	    };
	    yPos = new int[]{
		cY + 25, cY + 60, cY + 60, cY + 45, cY + 55, cY + 25
	    };
	    c.fillPolygon(xPos, yPos, 6);
	    //draw the tail
	    c.fillOval(cX + 2, cY + 55, 5, 5);
	    //draw the eye patch
	    c.setColor(eyePatch);
	    c.fillOval(cX + 33, cY + 15, 18, 18);
	    //draw the eye
	    c.setColor(black);
	    c.fillOval(cX + 41, cY + 20, 5, 5);
	}

	//delay when the rabbit will start talking
	try {
	    sleep(3000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + (30 - delay) / 5 * 60 + 10, cY + 5, 170, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("We *cough* are not!", cX + (30 - delay) / 5 * 60 + 20, cY + 20);
	    c.drawString("We can't stop *cough*", cX + (30 - delay) / 5 * 60 + 20, cY + 35);
	    c.drawString("coughing...", cX + (30 - delay) / 5 * 60 + 20, cY + 50);
	    //delay how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + (30 - delay) / 5 * 60 + 10, cY + 5, 172, 52);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + (30 - delay) / 5 * 60 + 10, cY, 190, 65, 5, 5);
	    c.setColor(black);
	    c.drawString("The pollution from *cough* the", cX + (30 - delay) / 5 * 60 + 15, cY + 15);
	    c.drawString("nearby city is making us cough.", cX + (30 - delay) / 5 * 60 + 15, cY + 30);
	    c.drawString("We must leave soon or *cough*", cX + (30 - delay) / 5 * 60 + 15, cY + 45);
	    c.drawString("we may not live... Goodbye...", cX + (30 - delay) / 5 * 60 + 15, cY + 60);
	    //delay how long the speech bubble will stay for
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {

	    c.setColor(grassGreen);
	    //erase the speech bubble
	    c.fillRect(cX + (30 - delay) / 5 * 60, cY, 60, 60);
	    //erase the rabbit
	    c.fillRect(cX + (30 - delay) / 5 * 60 + 10, cY, 192, 67);

	    //for loop to draw the rabbit walking to the left
	    for (x = 0; x >= -300; x--) {
		y = x % 20 / 10 * 5; //used to animate height changes in the rabbit

		c.setColor(body);
		//draw the head
		c.fillOval(cX + 5 + x, cY + 10 + y, 30, 30);
		c.fillRoundRect(cX + 2 + x, cY + 20 + y, 10, 15, 10, 10);
		//draw the nose
		c.setColor(lightPink);
		c.fillOval(cX + x, cY + 23 + y, 3, 5);
		//draw the body
		c.setColor(body);
		c.fillArc(cX - 5 + x - x % 20 / 10 * 5, cY + 25 + y, 60, 60, 0, 90 - x % 20 / 10 * 10);
		c.fillRoundRect(cX + 20 + x - x % 20 / 10 * 5, cY + 50 + y, 35, 10, 10, 10);
		c.fillRect(cX + 15 + x - x % 20 / 10 * 5, cY + 55 + y, 10, 5);
		//draw the ear
		c.fillOval(cX + 25 + x, cY + y, 10, 20);
		c.setColor(lightPink);
		c.fillOval(cX + 27 + x, cY + 4 + y, 4, 15);
		//draw the front leg
		c.setColor(body);
		xPos = new int[]{
		    cX + 9 + x, cX + 7 + x + x % 20 / 10 * 5, cX + 12 + x + x % 20 / 10 * 5, cX + 15 + x, cX + 29 + x, cX + 29 + x
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 60 + y, cY + 60 + y, cY + 45 + y, cY + 55 + y, cY + 25 + y
		};
		c.fillPolygon(xPos, yPos, 6);
		//draw the tail
		c.fillOval(cX + 53 + x - x % 20 / 10 * 5, cY + 50 + y, 5, 5);
		//draw the eye patch
		c.setColor(eyePatch);
		c.fillOval(cX + 9 + x, cY + 15 + y, 18, 18);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 14 + x, cY + 20 + y, 5, 5);

		//used to delay the animation
		try {
		    sleep(delay / 2);
		} catch (Exception e) {
		}

		//used to erase the rabbit
		c.setColor(grassGreen);
		c.fillRect(cX + x - x % 20 / 10 * 5, cY + y, 61, 61);
	    }
	}
    }

    public void run() {
	rabbit();
    }
}
