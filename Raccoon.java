/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a raccoon talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class Raccoon extends Thread {

    private Console c;

    public Raccoon(Console con) {
	c = con;
    }

    public void raccoon() {
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color white = new Color(255, 255, 255);
	Color gray = new Color(110, 110, 110);
	Color darkGray = new Color(50, 50, 50);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int cX = 60, cY = 435; //variables to store the current top-left coordinate of the raccoon
	int x = 0, y = 0; //variables used in for loops to move the raccoon around

	synchronized (c) {
	    for (int n = 0; n < 2; n++) {
		for (x = 0; x <= 50; x++) {
		    y = x % 20 / 10 * -3; //used to animate height changes in the raccoon
		    //draw the back leg
		    c.setColor(gray);
		    xPos = new int[]{
			cX + 10 + x, cX + 20 + x - x % 20 / 10 * 7, cX + 25 + x - x % 20 / 10 * 7, cX + 35 + x
		    };
		    yPos = new int[]{
			cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the front leg
		    xPos = new int[]{
			cX + 65 + x, cX + 55 + x + x % 20 / 10 * 7, cX + 50 + x + x % 20 / 10 * 7, cX + 40 + x
		    };
		    yPos = new int[]{
			cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the body
		    c.setColor(gray);
		    c.fillOval(cX + 5 + x, cY + y, 50, 50);
		    xPos = new int[]{
			cX + 40 + x, cX + 70 + x, cX + 70 + x, cX + 35 + x
		    };
		    yPos = new int[]{
			cY + y, cY + 20 + y, cY + 51 + y, cY + 51 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the face
		    c.setColor(gray);
		    c.fillOval(cX + 60 + x, cY + 40 + y, 20, 10);
		    c.fillRoundRect(cX + 55 + x, cY + 20 + y, 20, 30, 20, 20);
		    //draw the nose
		    c.setColor(darkGray);
		    c.fillOval(cX + 78 + x, cY + 43 + y, 3, 5);
		    //draw the ear
		    c.setColor(gray);
		    c.fillRoundRect(cX + 65 + x, cY + 15 + y, 5, 10, 10, 10);
		    //draw the eye patch
		    c.setColor(white);
		    c.fillArc(cX + 58 + x, cY + 28 + y, 14, 44, 0, 180);
		    c.setColor(darkGray);
		    c.fillArc(cX + 60 + x, cY + 30 + y, 10, 40, 0, 180);
		    //draw the eye
		    c.setColor(black);
		    c.fillOval(cX + 63 + x, cY + 40 + y, 4, 4);
		    //draw the tail
		    c.setColor(darkGray);
		    c.fillRoundRect(cX + x, cY + 15 + y, 10, 26, 10, 10);
		    c.setColor(white);
		    c.fillRect(cX + x, cY + 20 + y, 10, 5);
		    c.fillRect(cX + x, cY + 30 + y, 10, 5);
		    //used to delay the animation
		    try {
			Thread.sleep(30);
		    } catch (Exception e) {
		    }

		    //erase the raccoon
		    c.setColor(grassGreen);
		    c.fillRect(cX + x, cY + y, 82, 60);
		}
		cX += x;
		for (x = 0; x >= -50; x--) {
		    y = x % 20 / 10 * -3; //used to animate height changes in the raccoon
		    //draw the back leg
		    c.setColor(gray);
		    xPos = new int[]{
			cX + 71 + x, cX + 61 + x - x % 20 / 10 * 7, cX + 56 + x - x % 20 / 10 * 7, cX + 46 + x
		    };
		    yPos = new int[]{
			cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the front leg
		    xPos = new int[]{
			cX + 16 + x, cX + 26 + x + x % 20 / 10 * 7, cX + 31 + x + x % 20 / 10 * 7, cX + 41 + x
		    };
		    yPos = new int[]{
			cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the body
		    c.setColor(gray);
		    c.fillOval(cX + 26 + x, cY + y, 50, 50);
		    xPos = new int[]{
			cX + 41 + x, cX + 11 + x, cX + 11 + x, cX + 46 + x
		    };
		    yPos = new int[]{
			cY + y, cY + 20 + y, cY + 51 + y, cY + 51 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the face
		    c.setColor(gray);
		    c.fillOval(cX + 1 + x, cY + 40 + y, 20, 10);
		    c.fillRoundRect(cX + 6 + x, cY + 20 + y, 20, 30, 20, 20);
		    //draw the nose
		    c.setColor(darkGray);
		    c.fillOval(cX + x, cY + 43 + y, 3, 5);
		    //draw the ear
		    c.setColor(gray);
		    c.fillRoundRect(cX + 11 + x, cY + 15 + y, 5, 10, 10, 10);
		    //draw the eye patch
		    c.setColor(white);
		    c.fillArc(cX + 9 + x, cY + 28 + y, 14, 44, 0, 180);
		    c.setColor(darkGray);
		    c.fillArc(cX + 11 + x, cY + 30 + y, 10, 40, 0, 180);
		    //draw the eye
		    c.setColor(black);
		    c.fillOval(cX + 14 + x, cY + 40 + y, 4, 4);
		    //draw the tail
		    c.setColor(darkGray);
		    c.fillRoundRect(cX + 71 + x, cY + 15 + y, 10, 26, 10, 10);
		    c.setColor(white);
		    c.fillRect(cX + 71 + x, cY + 20 + y, 10, 5);
		    c.fillRect(cX + 71 + x, cY + 30 + y, 10, 5);
		    //used to delay the animation
		    try {
			Thread.sleep(30);
		    } catch (Exception e) {
		    }

		    //erase the raccoon
		    c.setColor(grassGreen);
		    c.fillRect(cX + x, cY + y, 82, 60);
		}
		cX += x;
	    }
	}

	x = 0;
	synchronized (c) {
	    //draw the back leg
	    c.setColor(gray);
	    xPos = new int[]{
		cX + 10 + x, cX + 20 + x - x % 20 / 10 * 7, cX + 25 + x - x % 20 / 10 * 7, cX + 35 + x
	    };
	    yPos = new int[]{
		cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
	    };
	    c.fillPolygon(xPos, yPos, 4);
	    //draw the front leg
	    xPos = new int[]{
		cX + 65 + x, cX + 55 + x + x % 20 / 10 * 7, cX + 50 + x + x % 20 / 10 * 7, cX + 40 + x
	    };
	    yPos = new int[]{
		cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
	    };
	    c.fillPolygon(xPos, yPos, 4);
	    //draw the body
	    c.setColor(gray);
	    c.fillOval(cX + 5 + x, cY + y, 50, 50);
	    xPos = new int[]{
		cX + 40 + x, cX + 70 + x, cX + 70 + x, cX + 35 + x
	    };
	    yPos = new int[]{
		cY + y, cY + 20 + y, cY + 51 + y, cY + 51 + y
	    };
	    c.fillPolygon(xPos, yPos, 4);
	    //draw the face
	    c.setColor(gray);
	    c.fillOval(cX + 60 + x, cY + 40 + y, 20, 10);
	    c.fillRoundRect(cX + 55 + x, cY + 20 + y, 20, 30, 20, 20);
	    //draw the nose
	    c.setColor(darkGray);
	    c.fillOval(cX + 78 + x, cY + 43 + y, 3, 5);
	    //draw the ear
	    c.setColor(gray);
	    c.fillRoundRect(cX + 65 + x, cY + 15 + y, 5, 10, 10, 10);
	    //draw the eye patch
	    c.setColor(white);
	    c.fillArc(cX + 58 + x, cY + 28 + y, 14, 44, 0, 180);
	    c.setColor(darkGray);
	    c.fillArc(cX + 60 + x, cY + 30 + y, 10, 40, 0, 180);
	    //draw the eye
	    c.setColor(black);
	    c.fillOval(cX + 63 + x, cY + 40 + y, 4, 4);
	    //draw the tail
	    c.setColor(darkGray);
	    c.fillRoundRect(cX + x, cY + 15 + y, 10, 26, 10, 10);
	    c.setColor(white);
	    c.fillRect(cX + x, cY + 20 + y, 10, 5);
	    c.fillRect(cX + x, cY + 30 + y, 10, 5);
	}

	//delay when the raccoon starts talking
	try {
	    sleep(5000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 95, cY, 160, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Humans littered my", cX + 100, cY + 15);
	    c.drawString("home with garbage!", cX + 100, cY + 30);
	    //delay how long the speech bubble will stay
	    try {
		sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 95, cY, 160, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("I don't know... I am", cX + 100, cY + 15);
	    c.drawString("going to find a new home.", cX + 100, cY + 30);
	    c.drawString("Goodbye, Mr. Squirrel.", cX + 100, cY + 45);
	    //delay how long the speech bubble will stay
	    try {
		sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //erase the raccoon
	    c.fillRect(cX, cY, 82, 60);
	    //erase the speech bubble
	    c.fillRect(cX + 95, cY, 162, 52);
	}

	//for loop to draw the raccoon walking to the left
	for (x = 0; x >= -300; x--) {
	    y = x % 20 / 10 * -3; //used to animate height changes in the raccoon
	    synchronized (c) {
		//draw the back leg
		c.setColor(gray);
		xPos = new int[]{
		    cX + 71 + x, cX + 61 + x - x % 20 / 10 * 7, cX + 56 + x - x % 20 / 10 * 7, cX + 46 + x
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the front leg
		xPos = new int[]{
		    cX + 16 + x, cX + 26 + x + x % 20 / 10 * 7, cX + 31 + x + x % 20 / 10 * 7, cX + 41 + x
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 60 + y, cY + 60 + y, cY + 40 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the body
		c.setColor(gray);
		c.fillOval(cX + 26 + x, cY + y, 50, 50);
		xPos = new int[]{
		    cX + 41 + x, cX + 11 + x, cX + 11 + x, cX + 46 + x
		};
		yPos = new int[]{
		    cY + y, cY + 20 + y, cY + 51 + y, cY + 51 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the face
		c.setColor(gray);
		c.fillOval(cX + 1 + x, cY + 40 + y, 20, 10);
		c.fillRoundRect(cX + 6 + x, cY + 20 + y, 20, 30, 20, 20);
		//draw the nose
		c.setColor(darkGray);
		c.fillOval(cX + x, cY + 43 + y, 3, 5);
		//draw the ear
		c.setColor(gray);
		c.fillRoundRect(cX + 11 + x, cY + 15 + y, 5, 10, 10, 10);
		//draw the eye patch
		c.setColor(white);
		c.fillArc(cX + 9 + x, cY + 28 + y, 14, 44, 0, 180);
		c.setColor(darkGray);
		c.fillArc(cX + 11 + x, cY + 30 + y, 10, 40, 0, 180);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 14 + x, cY + 40 + y, 4, 4);
		//draw the tail
		c.setColor(darkGray);
		c.fillRoundRect(cX + 71 + x, cY + 15 + y, 10, 26, 10, 10);
		c.setColor(white);
		c.fillRect(cX + 71 + x, cY + 20 + y, 10, 5);
		c.fillRect(cX + 71 + x, cY + 30 + y, 10, 5);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(25);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//erase the raccoon
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY + y, 82, 60);
	    }
	}
    }

    public void run() {
	raccoon();
    }
}
