/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a deer talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class Deer extends Thread {

    private Console c;

    public Deer(Console con) {
	c = con;
    }

    public void deer() {
	Color grassGreen = new Color(127, 184, 71);
	Color treeBrown = new Color(112, 80, 75);
	Color bushDarkGreen = new Color(67, 102, 33);
	Color orangeBrown = new Color(184, 133, 89);
	Color darkOrangeBrown = new Color(163, 114, 71);
	Color lightPink = new Color(214, 198, 203);
	Color black = new Color(0, 0, 0);
	Color white = new Color(255, 255, 255);
	Color skyBlue = new Color(182, 231, 245);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int x = 0, y = 0; //variables used in for loops to move the deer around
	int cX = 70, cY = 325; //variables to store the current top-left coordinate of the deer

	//for loop to draw the deer walking to the left
	for (x = 0; x >= -30; x--) {
	    y = -x % 30 / 15 * 7; //used to animate height changes in the deer
	    synchronized (c) {
		//draw the tail
		c.setColor(white);
		c.fillRect(cX + 129 + x, cY + 55 - x % 30 / 15 * 7, 15, 10);
		c.fillOval(cX + 137 + x, cY + 55 - x % 30 / 15 * 7, 10, 20);
		c.setColor(darkOrangeBrown);
		//draw the body
		c.fillRoundRect(cX + 37 + x, cY + 55 + y, 100, 45, 20, 20);
		xPos = new int[]{
		    cX + 57 + x, cX + 72 + x, cX + 37 + x, cX + 32 + x
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 60 + y, cY + 65 + y, cY + 40 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the back legs
		xPos = new int[]{
		    cX + 137 + x, cX + 107 + x, cX + 127 + x - x % 30 / 15 * 20, cX + 137 + x - x % 30 / 15 * 20, cX + 127 + x - x % 30 / 15 * 15
		};
		yPos = new int[]{
		    cY + 85 + y, cY + 90 + y, cY + 155 + y, cY + 155 + y, cY + 110 + y
		};
		c.fillPolygon(xPos, yPos, 5);
		//draw the front legs
		xPos = new int[]{
		    cX + 37 + x, cX + 67 + x, cX + 62 + x + x % 30 / 15 * 20, cX + 62 + x + x % 30 / 15 * 20, cX + 52 + x + x % 30 / 15 * 20, cX + 52 + x + x % 30 / 15 * 20
		};
		yPos = new int[]{
		    cY + 85 + y, cY + 90 + y, cY + 110 + y, cY + 155 + y, cY + 155 + y, cY + 110 + y
		};
		c.fillPolygon(xPos, yPos, 6);
		//draw the ear
		xPos = new int[]{
		    cX + 47 + x, cX + 57 + x, cX + 57 + x, cX + 42 + x, cX + 37 + x
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 15 + y, cY + y, cY + 10 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 5);
		c.setColor(orangeBrown);
		//draw the head
		c.fillRoundRect(cX + 17 + x, cY + 20 + y, 40, 30, 20, 20);
		xPos = new int[]{
		    cX + 22 + x, cX + 2 + x, cX + 2 + x, cX + 27 + x
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 35 + y, cY + 50 + y, cY + 50 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the nose
		c.fillOval(cX + x, cY + 36 + y, 7, 10);
		//draw the eye
		c.fillOval(cX + 34 + x, cY + 27 + y, 8, 6);
	    }

	    //used to delay the animation
	    try {
		sleep(15);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the deer
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY + y, 160, 155);
		c.setColor(bushDarkGreen);
		c.fillRect(cX + x, cY + y, 160, 425 - cY - y);
		c.setColor(treeBrown);
		c.fillRect(30, cY + y, Math.max(0, Math.min(40, 100 - cX - x)), 425 - cY - y);
	    }
	}

	//draw the deer standing still facing right
	synchronized (c) {
	    //draw the tail
	    c.setColor(white);
	    c.fillRect(cX + 3 + x, cY + 55, 15, 10);
	    c.fillOval(cX + x, cY + 55, 10, 20);

	    c.setColor(darkOrangeBrown);
	    //draw the body
	    c.fillRoundRect(cX + 10 + x, cY + 55, 100, 45, 20, 20);
	    xPos = new int[]{
		cX + 90 + x, cX + 75 + x, cX + 110 + x, cX + 115 + x
	    };
	    yPos = new int[]{
		cY + 40, cY + 60, cY + 65, cY + 40
	    };
	    c.fillPolygon(xPos, yPos, 4);

	    //draw the legs
	    xPos = new int[]{
		cX + 10 + x, cX + 40 + x, cX + 10 + x, cX + x, cX + 15 + x
	    };
	    yPos = new int[]{
		cY + 85, cY + 90, cY + 155, cY + 155, cY + 110
	    };
	    c.fillPolygon(xPos, yPos, 5);
	    xPos = new int[]{
		cX + 110 + x, cX + 80 + x, cX + 85 + x, cX + 85 + x, cX + 95 + x, cX + 95 + x
	    };
	    yPos = new int[]{
		cY + 85, cY + 90, cY + 110, cY + 155, cY + 155, cY + 110
	    };
	    c.fillPolygon(xPos, yPos, 6);

	    //draw the ear
	    xPos = new int[]{
		cX + 100 + x, cX + 90 + x, cX + 90 + x, cX + 105 + x, cX + 110 + x
	    };
	    yPos = new int[]{
		cY + 25, cY + 15, cY, cY + 10, cY + 20
	    };
	    c.fillPolygon(xPos, yPos, 5);

	    c.setColor(orangeBrown);
	    //draw the head
	    c.fillRoundRect(cX + 90 + x, cY + 20, 40, 30, 20, 20);
	    xPos = new int[]{
		cX + 125 + x, cX + 145 + x, cX + 145 + x, cX + 120 + x
	    };
	    yPos = new int[]{
		cY + 25, cY + 35, cY + 50, cY + 50
	    };
	    c.fillPolygon(xPos, yPos, 4);

	    c.setColor(black);
	    //draw the nose
	    c.fillOval(cX + 140 + x, cY + 36, 7, 10);
	    //draw the eye
	    c.fillOval(cX + 105 + x, cY + 27, 8, 6);
	}

	//delay when the deer starts talking
	try {
	    sleep(5000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //shift text box slightly to the left and up
	    cX -= 20;
	    cY -= 40;
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 180, cY - 30, 210, 70, 5, 5);
	    c.setColor(black);
	    c.drawString("I am moving... It has become too", cX + 190, cY - 15);
	    c.drawString("difficult for me to reach my water", cX + 190, cY);
	    c.drawString("source because a road was built", cX + 190, cY + 15);
	    c.drawString("between my home and the pond.", cX + 190, cY + 30);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(6000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(skyBlue);
	    c.fillRect(cX + 180, cY - 30, 212, 72);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 180, cY - 30, 220, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("I am sorry! I hope to see you again.", cX + 190, cY - 15);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(skyBlue);
	    c.fillRect(cX + 180, cY - 30, 222, 22);
	    //realign coordinates
	    cX -= 20;
	    cY += 40;
	    //erase the deer
	    c.setColor(grassGreen);
	    c.fillRect(cX, cY + 100, 147, 55);
	    c.setColor(bushDarkGreen);
	    c.fillRect(cX, cY, 147, 100);
	    c.setColor(treeBrown);
	    c.fillRect(30, cY, 40, 100);
	}

	//for loop to draw the deer walking to the left
	for (x = 0; x >= -300; x--) {
	    y = -x % 30 / 15 * 7; //used to animate height changes in the deer
	    synchronized (c) {
		//draw the tail
		c.setColor(white);
		c.fillRect(cX + 129 + x, cY + 55 - x % 30 / 15 * 7, 15, 10);
		c.fillOval(cX + 137 + x, cY + 55 - x % 30 / 15 * 7, 10, 20);
		c.setColor(darkOrangeBrown);
		//draw the body
		c.fillRoundRect(cX + 37 + x, cY + 55 + y, 100, 45, 20, 20);
		xPos = new int[]{
		    cX + 57 + x, cX + 72 + x, cX + 37 + x, cX + 32 + x
		};
		yPos = new int[]{
		    cY + 40 + y, cY + 60 + y, cY + 65 + y, cY + 40 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the back legs
		xPos = new int[]{
		    cX + 137 + x, cX + 107 + x, cX + 127 + x - x % 30 / 15 * 20, cX + 137 + x - x % 30 / 15 * 20, cX + 127 + x - x % 30 / 15 * 15
		};
		yPos = new int[]{
		    cY + 85 + y, cY + 90 + y, cY + 155 + y, cY + 155 + y, cY + 110 + y
		};
		c.fillPolygon(xPos, yPos, 5);
		//draw the front legs
		xPos = new int[]{
		    cX + 37 + x, cX + 67 + x, cX + 62 + x + x % 30 / 15 * 20, cX + 62 + x + x % 30 / 15 * 20, cX + 52 + x + x % 30 / 15 * 20, cX + 52 + x + x % 30 / 15 * 20
		};
		yPos = new int[]{
		    cY + 85 + y, cY + 90 + y, cY + 110 + y, cY + 155 + y, cY + 155 + y, cY + 110 + y
		};
		c.fillPolygon(xPos, yPos, 6);
		//draw the ear
		xPos = new int[]{
		    cX + 47 + x, cX + 57 + x, cX + 57 + x, cX + 42 + x, cX + 37 + x
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 15 + y, cY + y, cY + 10 + y, cY + 20 + y
		};
		c.fillPolygon(xPos, yPos, 5);
		c.setColor(orangeBrown);
		//draw the head
		c.fillRoundRect(cX + 17 + x, cY + 20 + y, 40, 30, 20, 20);
		xPos = new int[]{
		    cX + 22 + x, cX + 2 + x, cX + 2 + x, cX + 27 + x
		};
		yPos = new int[]{
		    cY + 25 + y, cY + 35 + y, cY + 50 + y, cY + 50 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the nose
		c.fillOval(cX + x, cY + 36 + y, 7, 10);
		//draw the eye
		c.fillOval(cX + 34 + x, cY + 27 + y, 8, 6);
	    }

	    //used to delay the animation
	    try {
		sleep(15);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the deer
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY + y, 160, 155);
		c.setColor(bushDarkGreen);
		c.fillRect(cX + x, cY + y, 160, 425 - cY - y);
		c.setColor(treeBrown);
		c.fillRect(30, cY + y, Math.max(0, Math.min(40, 70 - cX - x)), 425 - cY - y);
	    }
	}
    }

    public void run() {
	deer();
    }
}
