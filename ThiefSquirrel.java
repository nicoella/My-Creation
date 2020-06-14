/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a theif squirrel running.
 */

import hsa.Console;
import java.awt.*;

public class ThiefSquirrel extends Thread {

    private Console c;

    public ThiefSquirrel(Console con) {
	c = con;
    }

    public void thiefSquirrel() {
	Color leafGreen = new Color(169, 214, 126);
	Color skyBlue = new Color(182, 231, 245);
	Color treeBrown = new Color(112, 80, 75);
	Color grayBrown = new Color(152, 132, 114);
	Color darkGrayBrown = new Color(112, 91, 72);
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color gray = new Color(153, 138, 126);
	Color darkGray = new Color(122, 106, 91);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int x, y; //variables used in for loops to move the deer around
	int cX = -100, cY = 435; //variables to store the current top-left coordinate of the deer

	//used to delay when the squirrel will start moving
	try {
	    sleep(2000);
	} catch (Exception e) {
	}
	//for loop to animate the thief squirrel running to the right
	for (x = 0; x <= 200; x++) {
	    //draw the tail
	    c.setColor(grayBrown);
	    xPos = new int[]{
		cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x
	    };
	    yPos = new int[]{
		cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3
	    };
	    c.fillPolygon(xPos, yPos, 11);
	    //draw the face
	    c.setColor(darkGrayBrown);
	    c.fillRoundRect(cX + 44 + x, cY + 10 - x % 20 / 10 * 3, 25, 25, 15, 15);
	    c.fillRoundRect(cX + 49 + x, cY + 5 - x % 20 / 10 * 3, 7, 7, 5, 5);
	    c.fillOval(cX + 60 + x, cY + 17 - x % 20 / 10 * 3, 15, 15);
	    //draw the body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 35, 25, 15, 15);
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
		sleep(5);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the thief squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 80, 50);
	    }
	}

	//update the current top left coordinate of the thief squirrel
	cX += x;
	x = 0;

	//draw the tail
	c.setColor(grayBrown);
	xPos = new int[]{
	    cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x
	};
	yPos = new int[]{
	    cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3
	};
	c.fillPolygon(xPos, yPos, 11);
	//draw the face
	c.setColor(darkGrayBrown);
	c.fillRoundRect(cX + 44 + x, cY + 10 - x % 20 / 10 * 3, 25, 25, 15, 15);
	c.fillRoundRect(cX + 49 + x, cY + 5 - x % 20 / 10 * 3, 7, 7, 5, 5);
	c.fillOval(cX + 60 + x, cY + 17 - x % 20 / 10 * 3, 15, 15);
	//draw the body
	c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 35, 25, 15, 15);
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
	c.fillOval(cX + 55 + x, cY + 20 - x % 20 / 10 * 3, 7, 5);

	//used to make the squirrel stop running for a second
	try {
	    sleep(1000);
	} catch (Exception e) {
	}
	
	//erase the nut in the background
	c.setColor(grassGreen);
	c.fillRect(178,465,20,14);
	
	//draw the nut
	c.setColor(gray);
	c.fillOval(cX + 73 + x, cY + 20 - x % 20 / 10 * 3, 12, 12);
	c.setColor(darkGray);
	c.fillOval(cX + 70 + x, cY + 20 - x % 20 / 10 * 3, 18, 8);
	//used to make the squirrel stand still for a second
	try {
	    sleep(1000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //used to erase the squirrel
	    c.fillRect(cX + x, cY - x % 20 / 10 * 3, 80, 50);
	}

	//for loop to draw the thief squirrel running to the right
	for (x = 0; x <= 600; x++) {
	    //draw the tail
	    c.setColor(grayBrown);
	    xPos = new int[]{
		cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x
	    };
	    yPos = new int[]{
		cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3
	    };
	    c.fillPolygon(xPos, yPos, 11);
	    //draw the face
	    c.setColor(darkGrayBrown);
	    c.fillRoundRect(cX + 44 + x, cY + 10 - x % 20 / 10 * 3, 25, 25, 15, 15);
	    c.fillRoundRect(cX + 49 + x, cY + 5 - x % 20 / 10 * 3, 7, 7, 5, 5);
	    c.fillOval(cX + 60 + x, cY + 17 - x % 20 / 10 * 3, 15, 15);
	    //draw the body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 35, 25, 15, 15);
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
	    c.fillOval(cX + 55 + x, cY + 20 - x % 20 / 10 * 3, 7, 5);
	    //draw the nut
	    c.setColor(gray);
	    c.fillOval(cX + 73 + x, cY + 20 - x % 20 / 10 * 3, 12, 12);
	    c.setColor(darkGray);
	    c.fillOval(cX + 70 + x, cY + 20 - x % 20 / 10 * 3, 18, 8);
	    
	    //used to delay the animation
	    try {
		sleep(5);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the thief squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 90, 50);
	    }
	}
    }

    public void run() {
	thiefSquirrel();
    }
}
