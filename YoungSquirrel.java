/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a squirrel in multiple scenes/backgrounds.
 */

import hsa.Console;
import java.awt.*;

public class YoungSquirrel implements Runnable {

    private Console c;
    int screen = 1; //variable to store which screen/background the squirrel is currently on
    //colour variables, declared globally to be used in multiple methods
    Color leafGreen = new Color(169, 214, 126);
    Color skyBlue = new Color(182, 231, 245);
    Color treeBrown = new Color(112, 80, 75);
    Color grayBrown = new Color(152, 132, 114);
    Color darkGrayBrown = new Color(112, 91, 72);
    Color black = new Color(0, 0, 0);
    Color grassGreen = new Color(127, 184, 71);
    Color white = new Color(255, 255, 255);

    int[] xPos, yPos; //variables used to store x-coordinates for polygons
    int cX = 86; //variable to store the current top-left x-coordinate of the squirrel
    int cY = 220; //variable to store the current top-left y-coordinate of the squirrel
    int x = 0, y = 0; //variables used in for loops moving the squirrel around

    public YoungSquirrel(Console con) {
	c = con;
    }

    public void run() {
	//if-else structure to determine how to draw the squirrel based on the background
	if (screen == 1) {
	    youngSquirrel1();
	} else if (screen == 2) {
	    youngSquirrel2();
	} else if (screen == 3) {
	    youngSquirrel3();
	} else if (screen == 4) {
	    youngSquirrel4();
	} else if (screen == 5) {
	    youngSquirrel5();
	} else if (screen == 6) {
	    youngSquirrel6();
	} else if (screen == 7) {
	    youngSquirrel7();
	} else if (screen == 8) {
	    youngSquirrel8();
	} else if (screen == 9) {
	    youngSquirrel9();
	} else if (screen == 10) {
	    youngSquirrel10();
	} else {
	    youngSquirrel11();
	}
	screen++;
    }

    //squirrel chasing thief
    public void youngSquirrel1() {
	Font f1 = new Font("Arial", Font.PLAIN, 12);
	c.setFont(f1);

	//draws squirrel bobbing up and down
	for (int n = 0; n <= 70; n++) {
	    y = n % 20 / 10 * -3;
	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(skyBlue);
		c.fillRect(cX, cY + (n - 1) % 4 / 2 * -3, 49, 50);
		c.setColor(treeBrown);
		c.fillRect(cX, cY + 45, 49, 7);
	    }

	    synchronized (c) {
		//draw the tail
		c.setColor(darkGrayBrown);
		xPos = new int[]{cX + 34 + x, cX + 37 + x, cX + 32 + x, cX + 36 + x, cX + 47 + x, cX + 49 + x, cX + 44 + x, cX + 42 + x, cX + 49 + x, cX + 36 + x, cX + 24 + x};
		yPos = new int[]{cY + 35 + y, cY + 27 + y, cY + 18 + y, cY + 10 + y, cY + 10 + y, cY + 20 + y, cY + 20 + y, cY + 15 + y, cY + 30 + y, cY + 46 + y, cY + 47 + y};
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the body
		c.fillRoundRect(cX + 4 + x, cY + 10 + y, 20, 20, 15, 15);
		//draw the face
		c.fillRoundRect(cX + 14 + x, cY + 20 + y, 20, 30, 20, 20);
		c.fillOval(cX + x, cY + 18 + y, 10, 10);
		//draw the ear
		c.fillRect(cX + 9 + x, cY + 32 + y, 5, 5);
		xPos = new int[]{cX + 14 + x, cX + 24 + x, cX + 9 + x, cX + 9 + x};
		yPos = new int[]{cY + 40 + y, cY + 50 + y, cY + 50 + y, cY + 45 + y};
		//draw the ear
		c.fillRoundRect(cX + 14 + x, cY + 7 + y, 5, 7, 3, 3);
		c.setColor(grayBrown);
		//draw the foot
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the eye
		c.fillOval(cX + 9 + x, cY + 18 + y, 4, 3);
	    }
	    //used to delay the animation
	    try {
		Thread.sleep(20);
	    } catch (Exception e) {
	    }

	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX - 70, cY - 100, 100, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("I'm so excited", cX - 65, cY - 85);
	    c.drawString("to see my", cX - 65, cY - 70);
	    c.drawString("friends today!", cX - 65, cY - 55);
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //used to erase the speech bubble
	    c.setColor(leafGreen);
	    c.fillRect(cX - 70, cY - 100, 102, 52);
	}

	//used to 7 when the squirrel will talk
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	//draws the speech bubble
	synchronized (c) {
	    c.setColor(white);
	    c.fillRoundRect(cX + 30, cY - 20, 100, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("Hey! That's ours!", cX + 35, cY - 5);
	}

	//used to 7 when the squirrel will start moving
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	//used to erase the speech bubble
	synchronized (c) {
	    c.setColor(skyBlue);
	    c.fillRect(cX, cY, 60, 45);
	    c.fillRect(cX + 30, cY - 20, 102, 22);
	    c.setColor(treeBrown);
	    c.fillRect(cX, cY + 45, 61, 6);
	}

	//loop to draw the squirrel walking to the left
	for (x = 0; x >= -55; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(skyBlue);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 60, 45);
		c.setColor(treeBrown);
		c.fillRect(cX + x, cY + 45, 60, 3);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, Math.max(0, 70 - (86 + x) + 1), 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX = 37;

	//loop to draw the squirrel climbing down the tree
	for (y = 0; y <= 205; y++) {
	    synchronized (c) {
		c.setColor(grayBrown);
		//draw the head of the squirrel
		c.fillOval(cX + 3, cY + 35 + y, 25, 25);
		c.fillOval(cX + 10, cY + 58 + y, 10, 5);
		//draw the body of the squirrel
		c.fillRoundRect(cX + 5, cY + 10 + y, 20, 30, 10, 10);
		c.setColor(darkGrayBrown);
		//draw the tail of the squirrel
		c.fillRoundRect(cX + 7, cY + y, 16, 20, 10, 10);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(treeBrown);
		c.fillRect(cX, cY + y, 30, 65);
		c.setColor(grassGreen);
		c.fillRect(cX, 425, 30, Math.max(0, 285 + y - 425 + 1));
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX = 26;
	cY = 435;

	//loop to draw the squirrel walking to the right
	for (x = 0; x <= 610; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel running
    public void youngSquirrel2() {
	//update the current top-left coordinate of the squirrel
	cX = -124;
	cY = 435;

	//loop to draw the squirrel walking to the right
	for (x = 0; x <= 474; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing right
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints used to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
	    //array of ints used to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints used to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
	    //array of ints used to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints used to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
	    //array of ints used to store the x-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    //used to 7 how long the squirrel will stand still for
	    try {
		Thread.sleep(50);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 80, cY, 115, 22, 5, 5);
	    c.setColor(black);
	    c.drawString("Where did he go?", cX + 90, cY + 15);
	    //used to 7 how long the speech bubble will stay
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //used to erase the squirrel
	    c.fillRect(cX, cY, 70, 45);
	    //used to erase the speech bubble
	    c.fillRect(cX + 80, cY, 117, 24);
	}

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    //used to 7 how long the squirrel will stand still for
	    try {
		Thread.sleep(2000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //used to erase the squirrel
	    c.setColor(grassGreen);
	    c.fillRect(cX, cY, 70, 45);
	}

	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints used to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
	    //array of ints used to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints used to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
	    //array of ints used to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints used to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
	    //array of ints used to store the x-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    //used to 7 how long the squirrel will stand still
	    try {
		Thread.sleep(2000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 80, cY, 155, 22, 5, 5);
	    c.setColor(black);
	    c.drawString("Maybe he went this way...", cX + 90, cY + 15);
	    //used to 7 how long the speech bubble will stay
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //used to erase the squirrel
	    c.fillRect(cX, cY, 70, 45);
	    //used to erase the speech bubble
	    c.fillRect(cX + 80, cY, 157, 24);
	}

	//loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel discovering the new city
    public void youngSquirrel3() {
	//update the current top-left coordinate of the squirrel
	cX = -124;
	cY = 435;
	x = 0;

	//loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//draw the squirrel standing still facing right
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    c.fillPolygon(xPos, yPos, 11);
	    //face
	    c.setColor(grayBrown);
	    c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    c.fillPolygon(xPos, yPos, 4);
	    xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    //used to 7 how long the squirrel will stand still for
	    try {
		Thread.sleep(1000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //used to erase the squirrel
	    c.setColor(grassGreen);
	    c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	}

	//update the current top-left coordinate of the squirrel
	cX = 196;

	//draw the squirrel standing still facing away
	synchronized (c) {
	    c.setColor(grayBrown);
	    c.fillRoundRect(cX, cY + 3, 26, 26, 15, 15);
	    c.fillRoundRect(cX + 2, cY + 16, 22, 28, 10, 10);
	    c.fillRoundRect(cX + 2, cY, 6, 9, 4, 4);
	    c.fillRoundRect(cX + 19, cY, 6, 9, 4, 4);
	    c.setColor(darkGrayBrown);
	    c.fillRoundRect(cX + 5, cY + 23, 16, 20, 10, 10);
	}

	//used to 7 how long the squirrel will stand still for before text shows up
	try {
	    Thread.sleep(2000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 35, cY, 90, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("What is this...?", cX + 40, cY + 15);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 35, cY, 110, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("What is going on?", cX + 40, cY + 15);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //draws the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 35, cY, 165, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("I have to tell mom about this!", cX + 40, cY + 15);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //used to erase the squirrel
	    c.fillRect(cX, cY, 27, 45);
	    //used to erase the speech bubble
	    c.fillRect(cX + 35, cY, 167, 22);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x >= -300; x--) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 60, 45);
	    }
	}
    }

    //squirrel talking with its mom
    public void youngSquirrel4() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 435;
	
	//erase the nut in the background
	c.setColor(grassGreen);
	c.fillRect(178,465,20,14);

	//for loop to draw the squirrel walking to the left
	synchronized (c) {
	    for (x = 0; x >= -400; x--) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);

		//used to delay the animation
		try {
		    Thread.sleep(7);
		} catch (Exception e) {
		}

		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 60, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 65, cY - 8, 220, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("Mom! I saw the strangest thing today!", cX + 70, cY + 7);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 65, cY - 8, 230, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("There were these... large cube things", cX + 70, cY + 7);
	    c.drawString("near the edge of the forest! I don't know", cX + 70, cY + 22);
	    c.drawString("what they were. It was kind of scary.", cX + 70, cY + 37);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(7000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //cover the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 65, cY - 8, 232, 52);
	}

	//used to create a section of time with no speech bubble
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 65, cY - 8, 50, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("Okay!", cX + 70, cY + 7);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(3000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //cover the squirrel
	    c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    //cover the speech bubble
	    c.fillRect(cX + 65, cY - 8, 52, 22);
	}

	//for loop to draw the squirrel walking to the right
	for (int x = 0; x <= 550; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel talking to a deer
    public void youngSquirrel5() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 435;
	x = 0;

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -350; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 220, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("Hello Mr. Deer! What are you doing?", cX + 80, cY + 15);
	    //7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 222, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 200, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("What...? Then who will come", cX + 80, cY + 15);
	    c.drawString("berry-picking with me?", cX + 80, cY + 30);
	    //7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 252, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 20, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("):", cX + 80, cY + 15);
	    //7 how long the speech bubble will stay for
	    try {
		Thread.sleep(3000);
	    } catch (Exception e) {
	    }
	}

	//erase the speech bubble
	c.setColor(grassGreen);
	c.fillRect(cX + 75, cY, 22, 22);
	//draw the speech bubble
	c.setColor(white);
	c.fillRoundRect(cX + 75, cY, 160, 35, 5, 5);
	c.setColor(black);
	c.drawString("Maybe I will go visit", cX + 80, cY + 15);
	c.drawString("Mr. Raccoon then.", cX + 80, cY + 30);
	//7 how long the speech bubble will stay for
	try {
	    Thread.sleep(3000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 162, 37);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel talking to a raccoon
    public void youngSquirrel6() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 445;

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -300; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Hello Mr. Raccoon!", cX + 80, cY + 15);
	    c.drawString("What is all of this?", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 232, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 170, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("It is so dirty here.", cX + 80, cY + 15);
	    c.drawString("Where are you going to live?", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 252, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 100, 20, 5, 5);
	    c.setColor(black);
	    c.drawString("Bye bye... ) ;", cX + 80, cY + 15);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 22, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 160, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Hopefully Ms. Porcupine", cX + 80, cY + 15);
	    c.drawString("isn't leaving...", cX + 80, cY + 30);
	}

	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(4000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 162, 37);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel talking with a porcupine
    public void youngSquirrel7() {
	//used to update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 445;

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -280; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to cover the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 180, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Hello Ms. Porcupine! What", cX + 80, cY + 15);
	    c.drawString("has happened to your pond?", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 182, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 160, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("But then... where will", cX + 80, cY + 15);
	    c.drawString("you get your water?", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 162, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 160, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Bye Ms. Porcupine...", cX + 80, cY + 15);
	    c.drawString("What is happening?", cX + 80, cY + 30);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(1000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 162, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 180, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Well, Mr. Opossum", cX + 80, cY + 15);
	    c.drawString("definitely wont be leaving,", cX + 80, cY + 30);
	    c.drawString("he loves his tree.", cX + 80, cY + 45);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(6000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 182, 52);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel talking with an opossum
    public void youngSquirrel8() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 445;

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -250; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Mr. Opossum! Where", cX + 80, cY + 15);
	    c.drawString("has your tree gone?", cX + 80, cY + 30);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(5000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 232, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("So... you have to", cX + 80, cY + 15);
	    c.drawString("find a new tree?", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 132, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Alright, I'll be waiting", cX + 80, cY + 15);
	    c.drawString("for your visits...", cX + 80, cY + 30);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(8000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 22, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 160, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("If the rabbit family leaves,", cX + 80, cY + 15);
	    c.drawString("everyone will be gone!", cX + 80, cY + 30);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 162, 37);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel talking with rabbits
    public void youngSquirrel9() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 445;

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -220; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Hey guys! Wait...", cX + 80, cY + 15);
	    c.drawString("are you okay?", cX + 80, cY + 30);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(4000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 232, 22);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 35, 5, 5);
	    c.setColor(black);
	    c.drawString("Oh no! Why are", cX + 80, cY + 15);
	    c.drawString("you coughing?", cX + 80, cY + 30);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(7000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 75, cY, 132, 37);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 75, cY, 130, 25, 5, 5);
	    c.setColor(black);
	    c.drawString("Everyone is leaving...", cX + 80, cY + 15);
	}
	//used to 7 how long the speech bubble will stay for
	try {
	    Thread.sleep(4000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //used to erase the squirrel
	    c.fillRect(cX + 75, cY, 162, 37);
	    //used to erase the speech bubble
	    c.fillRect(cX + 75, cY, 22, 22);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //draw the squirrel going home
    public void youngSquirrel10() {
	//update the current top-left coordinate of the squirrel
	cX = 650;
	cY = 445;
	
	//erase the nut in the background
	c.setColor(grassGreen);
	c.fillRect(178,465,20,14);

	//for loop to draw the squirrel walking to the left
	for (x = 0; x >= -300; x -= 1) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
		//array of ints to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
		//array of ints to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
		//array of ints to store the y-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//draw the squirrel standing still facing left
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 44 + x, cX + 47 + x, cX + 41 + x, cX + 46 + x, cX + 57 + x, cX + 59 + x, cX + 54 + x, cX + 52 + x, cX + 59 + x, cX + 46 + x, cX + 34 + x};
	    //array of ints to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 4 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 14 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 16 + x + x % 20 / 10 * 7, cX + 22 + x + x % 20 / 10 * 7, cX + 24 + x, cX + 14 + x};
	    //array of ints to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 34 + x, cX + 44 + x, cX + 42 + x - x % 20 / 10 * 7, cX + 36 + x - x % 20 / 10 * 7};
	    //array of ints to store the y-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 9 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	synchronized (c) {
	    //draw speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 70, cY - 10, 150, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Mom! All my friends...", cX + 80, cY + 5);
	    c.drawString("Mom still isn't back?", cX + 80, cY + 20);
	    c.drawString("...I'll go check on her.", cX + 80, cY + 35);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 70, cY - 10, 152, 52);
	}

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 300; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}
    }

    //squirrel finding his mother
    public void youngSquirrel11() {
	//update the current top-left coordinate of the squirrel
	cX = -50;
	cY = 445;

	//for loop to draw the squirrel walking to the right
	for (x = 0; x <= 230; x++) {
	    synchronized (c) {
		c.setColor(darkGrayBrown);
		//array of ints used to store the x-positions of the squirrel's tail
		xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
		//array of ints used to store the y-positions of the squirrel's tail
		yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
		//draw the squirrel's tail
		c.fillPolygon(xPos, yPos, 11);
		c.setColor(grayBrown);
		//draw the squirrel's face
		c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
		c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
		c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
		//draw the squirrel's body
		c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
		//array of ints used to store the x-positions of the squirrel's front leg
		xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
		//array of ints used to store the y-positions of the squirrel's front leg
		yPos = new int[]{
		    cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3
		};
		//draw the squirrel's front leg
		c.fillPolygon(xPos, yPos, 4);
		//array of ints used to store the x-positions of the squirrel's back leg
		xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
		//array of ints used to store the x-positions of the squirrel's back leg
		yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
		//draw the squirrel's back leg
		c.fillPolygon(xPos, yPos, 4);
		c.setColor(black);
		//draw the squirrel's eye
		c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	    }

	    //used to delay the animation
	    try {
		Thread.sleep(7);
	    } catch (Exception e) {
	    }

	    synchronized (c) {
		//used to erase the squirrel
		c.setColor(grassGreen);
		c.fillRect(cX + x, cY - x % 20 / 10 * 3, 70, 45);
	    }
	}

	//update the current top-left coordinate of the squirrel
	cX += x;
	x = 0;

	//draw the squirrel standing still facing right
	synchronized (c) {
	    c.setColor(darkGrayBrown);
	    //array of ints used to store the x-positions of the squirrel's tail
	    xPos = new int[]{cX + 16 + x, cX + 13 + x, cX + 18 + x, cX + 13 + x, cX + 3 + x, cX + 1 + x, cX + 6 + x, cX + 8 + x, cX + 1 + x, cX + 13 + x, cX + 26 + x};
	    //array of ints used to store the y-positions of the squirrel's tail
	    yPos = new int[]{cY + 25 - x % 20 / 10 * 3, cY + 17 - x % 20 / 10 * 3, cY + 8 - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 10 - x % 20 / 10 * 3, cY + 4 - x % 20 / 10 * 3, cY + 20 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3, cY + 37 - x % 20 / 10 * 3};
	    //draw the squirrel's tail
	    c.fillPolygon(xPos, yPos, 11);
	    c.setColor(grayBrown);
	    //draw the squirrel's face
	    c.fillRoundRect(cX + 39 + x, cY + 10 - x % 20 / 10 * 3, 20, 20, 15, 15);
	    c.fillRoundRect(cX + 44 + x, cY + 7 - x % 20 / 10 * 3, 5, 7, 3, 3);
	    c.fillOval(cX + 55 + x, cY + 18 - x % 20 / 10 * 3, 10, 10);
	    //draw the squirrel's body
	    c.fillRoundRect(cX + 14 + x, cY + 20 - x % 20 / 10 * 3, 30, 20, 15, 15);
	    //array of ints used to store the x-positions of the squirrel's front leg
	    xPos = new int[]{cX + 44 + x + x % 20 / 10 * 7, cX + 38 + x + x % 20 / 10 * 7, cX + 36 + x, cX + 46 + x};
	    //array of ints used to store the y-positions of the squirrel's front leg
	    yPos = new int[]{cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3};
	    //draw the squirrel's front leg
	    c.fillPolygon(xPos, yPos, 4);
	    //array of ints used to store the x-positions of the squirrel's back leg
	    xPos = new int[]{cX + 26 + x, cX + 16 + x, cX + 18 + x - x % 20 / 10 * 7, cX + 24 + x - x % 20 / 10 * 7};
	    //array of ints used to store the x-positions of the squirrel's back leg
	    yPos = new int[]{cY + 40 - x % 20 / 10 * 3, cY + 35 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3, cY + 45 - x % 20 / 10 * 3};
	    //draw the squirrel's back leg
	    c.fillPolygon(xPos, yPos, 4);
	    c.setColor(black);
	    //draw the squirrel's eye
	    c.fillOval(cX + 51 + x, cY + 18 - x % 20 / 10 * 3, 4, 3);
	}

	//update which font to use for the text
	Font f1 = new Font("Arial", Font.PLAIN, 12);
	c.setFont(f1);

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX - 165, cY - 10, 160, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Mom? Mom?? MOM!!!", cX - 160, cY + 5);
	    c.drawString("Wake up!! Mom? Why aren't", cX - 160, cY + 20);
	    c.drawString("you waking up? Mom!!", cX - 160, cY + 35);
	    //used to 7 how long the speech bubble will stay for
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}
    }
}
