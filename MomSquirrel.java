/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates the mom squirrel talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class MomSquirrel extends Thread {

    private Console c;

    public MomSquirrel(Console con) {
	c = con;
    }

    public void momSquirrel() {
	Color grayBrown = new Color(152, 132, 114);
	Color darkGrayBrown = new Color(112, 91, 72);
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color white = new Color(255, 255, 255);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int cX = -50, cY = 430; //variables to store the current top-left coordinate of the mom squirrel
	int x, y; //variables used in for loops to move the squirrel around
	int delay = 10;

	//delay when the mom squirrel starts running
	try {
	    sleep(50);
	} catch (Exception e) {
	}

	//for loop to draw the mom squirrel walking to the right
	for (x = 0; x <= 200; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		xPos = new int[]{
		    cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x
		};
		yPos = new int[]{
		    cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3
		};
		c.fillPolygon(xPos, yPos, 11);
		//draw the face
		c.setColor(grayBrown);
		c.fillOval(cX + 44 + x, cY + 10 - x % 20 / 10 * 3, 25, 25);
		c.fillOval(cX + 49 + x, cY + 5 - x % 20 / 10 * 3, 7, 7);
		c.fillOval(cX + 60 + x, cY + 17 - x % 20 / 10 * 3, 15, 15);
		//draw the body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 35, 25, 20, 20);
		//draw the legs
		xPos = new int[]{
		    cX + 49 + x + x % 20 / 10 * 7, cX + 43 + x + x % 20 / 10 * 7, cX + 41 + x, cX + 51 + x
		};
		yPos = new int[]{
		    cY + 50 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3
		};
		c.fillPolygon(xPos, yPos, 4);
		xPos = new int[]{
		    cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7
		};
		yPos = new int[]{
		    cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the eyes
		c.setColor(black);
		c.fillOval(cX + 55 + x, cY + 20 - x % 20 / 10 * 3, 6, 5);

		//used to delay the animation
		try {
		    Thread.sleep(delay);
		} catch (Exception e) {
		}

		//used to erase the mom squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 80, 50);
	    }
	}

	//update the current top-left coordinate of the mom squirrel
	cX += x;
	x = 0;

	c.setColor(darkGrayBrown);
	xPos = new int[]{
	    cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x
	};
	yPos = new int[]{
	    cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3
	};
	c.fillPolygon(xPos, yPos, 11);
	//draw the face
	c.setColor(grayBrown);
	c.fillOval(cX + 44 + x, cY + 10 - x % 20 / 10 * 3, 25, 25);
	c.fillOval(cX + 49 + x, cY + 5 - x % 20 / 10 * 3, 7, 7);
	c.fillOval(cX + 60 + x, cY + 17 - x % 20 / 10 * 3, 15, 15);
	//draw the body
	c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 35, 25, 20, 20);
	//draw the legs
	xPos = new int[]{
	    cX + 49 + x + x % 20 / 10 * 7, cX + 43 + x + x % 20 / 10 * 7, cX + 41 + x, cX + 51 + x
	};
	yPos = new int[]{
	    cY + 50 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3
	};
	c.fillPolygon(xPos, yPos, 4);
	xPos = new int[]{
	    cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7
	};
	yPos = new int[]{
	    cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3, cY + 50 - x % 20 / 10 * 3
	};
	c.fillPolygon(xPos, yPos, 4);
	//draw the eyes
	c.setColor(black);
	c.fillOval(cX + 55 + x, cY + 20 - x % 20 / 10 * 3, 6, 5);

	//delay when the text shows up
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX - 150, cY - 5, 140, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Hmm, it may be a city, I", cX - 145, cY + 10);
	    c.drawString("will go see. For now, go", cX - 145, cY + 25);
	    c.drawString("play with your friends.", cX - 145, cY + 40);
	    //used to delay how long the speech bubble will stay
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX - 150, cY - 5, 142, 52);
	}
    }

    public void run() {
	momSquirrel();
    }
}
