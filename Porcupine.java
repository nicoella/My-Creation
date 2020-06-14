/*
Name: Nicole Han
Date: October 28, 2019
Teacher: Ms. Krasteva
This class animates a porcupine talking and walking.
 */

import hsa.Console;
import java.awt.*;

public class Porcupine extends Thread {

    private Console c;

    public Porcupine(Console con) {
	c = con;
    }

    public void porcupine() {
	Color black = new Color(0, 0, 0);
	Color grassGreen = new Color(127, 184, 71);
	Color white = new Color(255, 255, 255);
	Color lightYellow = new Color(235, 232, 199, 200);
	Color darkGray = new Color(50, 50, 50);

	int[] xPos, yPos; //variables used to store x-coordinates for polygons
	int cX = 50, cY = 435; //variables to store the current top-left coordinate of the porcupine
	int x = 0, y = 0; //variables used in for loops to move the porcupine around

	synchronized (c) {
	    for (int m = 0; m < 2; m++) {
		for (x = 0; x <= 25; x+=3) {
		    y = x % 16 / 8 * 3; //used to animate height changes in the raccoon
		    //draw the front leg
		    c.setColor(darkGray);
		    xPos = new int[]{
			cX + 61 + x, cX + 51 + x, cX + 46 + x, cX + 41 + x
		    };
		    yPos = new int[]{
			cY + 35 + y, cY + 54 + y, cY + 54 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the back leg
		    xPos = new int[]{
			cX + 41 + x, cX + 31 + x, cX + 26 + x, cX + 16 + x
		    };
		    yPos = new int[]{
			cY + 30 + y, cY + 54 + y, cY + 54 + y, cY + 30 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the body
		    c.setColor(darkGray);
		    c.fillOval(cX + 16 + x, cY + 5 + y, 50, 40);
		    //draw the head
		    c.setColor(darkGray);
		    c.fillOval(cX + 55 + x, cY + 20 + y, 25, 25);
		    c.fillRoundRect(cX + 63 + x, cY + 30 + y, 20, 15, 10, 10);
		    c.fillRect(cX + 81 + x, cY + 35 + y, 5, 8);
		    //draw the ear
		    c.setColor(darkGray);
		    c.fillRoundRect(cX + 66 + x, cY + 15 + y, 5, 10, 3, 3);
		    //draw the eye
		    c.setColor(black);
		    c.fillOval(cX + 71 + x, cY + 30 + y, 5, 5);
		    //draw the quills - coordinates determined with the help of: https://stackoverflow.com/questions/20104611/find-new-coordinates-of-a-point-after-rotation
		    c.setColor(lightYellow);
		    int[] quills;
		    quills = new int[]{
			cX + 57 + x, cY + 7 + y, cX + 52 + x, cY + 8 + y, cX + 25 + x, cY - 7 + y, cX + 50 + x, cY + 4 + y, cX + 46 + x, cY + 6 + y, cX + 16 + x, cY - 2 + y, cX + 43 + x, cY + 2 + y, cX + 40 + x, cY + 6 + y, cX + 8 + x, cY + 6 + y, cX + 37 + x, cY + 3 + y, cX + 34 + x, cY + 7 + y, cX + 3 + x, cY + 16 + y, cX + 30 + x, cY + 5 + y, cX + 28 + x, cY + 10 + y, cX + x, cY + 26 + y, cX + 23 + x, cY + 9 + y, cX + 23 + x, cY + 14 + y, cX + 1 + x, cY + 36 + y, cX + 18 + x, cY + 14 + y, cX + 19 + x, cY + 19 + y, cX + 4 + x, cY + 46 + y, cX + 15 + x, cY + 21 + y, cX + 17 + x, cY + 25 + y, cX + 9 + x, cY + 55 + y
		    };
		    for (int n = 0; n < quills.length; n += 6) {
			xPos = new int[]{
			    quills[n], quills[n + 2], quills[n + 4]
			};
			yPos = new int[]{
			    quills[n + 1], quills[n + 3], quills[n + 5]
			};
			c.fillPolygon(xPos, yPos, 3);
		    }
		    //used to delay the animation
		    try {
			sleep(30);
		    } catch (Exception e) {
		    }

		    synchronized (c) {
			//erase the porcupine
			c.setColor(grassGreen);
			c.fillRect(cX + x, cY - 7 + y, 86, 72);
		    }
		}
		cX += x;

	    }

	    for (x = 0; x >= -25; x-=3) {
		y = x % 16 / 8 * 3; //used to animate height changes in the raccoon
		//draw the front leg
		c.setColor(darkGray);
		xPos = new int[]{
		    cX + 25 + x, cX + 35 + x + x % 16 / 8 * 3, cX + 40 + x + x % 16 / 8 * 3, cX + 45 + x
		};
		yPos = new int[]{
		    cY + 35 + y, cY + 54 + y, cY + 54 + y, cY + 40 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the back leg
		xPos = new int[]{
		    cX + 45 + x, cX + 55 + x - x % 16 / 8 * 3, cX + 60 + x - x % 16 / 8 * 3, cX + 70 + x
		};
		yPos = new int[]{
		    cY + 30 + y, cY + 54 + y, cY + 54 + y, cY + 30 + y
		};
		c.fillPolygon(xPos, yPos, 4);
		//draw the body
		c.setColor(darkGray);
		c.fillOval(cX + 20 + x, cY + 5 + y, 50, 40);
		//draw the head
		c.setColor(darkGray);
		c.fillOval(cX + 6 + x, cY + 20 + y, 25, 25);
		c.fillRoundRect(cX + 3 + x, cY + 30 + y, 20, 15, 10, 10);
		c.fillRect(cX + x, cY + 35 + y, 5, 8);
		//draw the ear
		c.setColor(darkGray);
		c.fillRoundRect(cX + 15 + x, cY + 15 + y, 5, 10, 3, 3);
		//draw the eye
		c.setColor(black);
		c.fillOval(cX + 10 + x, cY + 30 + y, 5, 5);
		//draw the quills - coordinates determined with the help of: https://stackoverflow.com/questions/20104611/find-new-coordinates-of-a-point-after-rotation
		c.setColor(lightYellow);
		int[] quills;
		quills = new int[]{
		    cX + 29 + x, cY + 7 + y, cX + 34 + x, cY + 8 + y, cX + 61 + x, cY - 7 + y, cX + 36 + x, cY + 4 + y, cX + 40 + x, cY + 6 + y, cX + 70 + x, cY - 2 + y, cX + 43 + x, cY + 2 + y, cX + 46 + x, cY + 6 + y, cX + 78 + x, cY + 6 + y, cX + 49 + x, cY + 3 + y, cX + 52 + x, cY + 7 + y, cX + 83 + x, cY + 16 + y, cX + 56 + x, cY + 5 + y, cX + 58 + x, cY + 10 + y, cX + 86 + x, cY + 26 + y, cX + 63 + x, cY + 9 + y, cX + 63 + x, cY + 14 + y, cX + 85 + x, cY + 36 + y, cX + 68 + x, cY + 14 + y, cX + 67 + x, cY + 19 + y, cX + 82 + x, cY + 46 + y, cX + 71 + x, cY + 21 + y, cX + 69 + x, cY + 25 + y, cX + 77 + x, cY + 55 + y
		};
		for (int n = 0; n < quills.length; n += 6) {
		    xPos = new int[]{
			quills[n], quills[n + 2], quills[n + 4]
		    };
		    yPos = new int[]{
			quills[n + 1], quills[n + 3], quills[n + 5]
		    };
		    c.fillPolygon(xPos, yPos, 3);
		}
		//used to delay the animation
		try {
		    sleep(30);
		} catch (Exception e) {
		}

		synchronized (c) {
		    //erase the porcupine
		    c.setColor(grassGreen);
		    c.fillRect(cX + x, cY - 7 + y, 86, 72);
		}

	    }
	    cX += x;

	}

	x = 0;

	synchronized (c) {
	    //draw the front leg
	    c.setColor(darkGray);
	    xPos = new int[]{
		cX + 61 + x, cX + 51 + x, cX + 46 + x, cX + 41 + x
	    };
	    yPos = new int[]{
		cY + 35 + y, cY + 54 + y, cY + 54 + y, cY + 40 + y
	    };
	    c.fillPolygon(xPos, yPos, 4);
	    //draw the back leg
	    xPos = new int[]{
		cX + 41 + x, cX + 31 + x, cX + 26 + x, cX + 16 + x
	    };
	    yPos = new int[]{
		cY + 30 + y, cY + 54 + y, cY + 54 + y, cY + 30 + y
	    };
	    c.fillPolygon(xPos, yPos, 4);
	    //draw the body
	    c.setColor(darkGray);
	    c.fillOval(cX + 16 + x, cY + 5 + y, 50, 40);
	    //draw the head
	    c.setColor(darkGray);
	    c.fillOval(cX + 55 + x, cY + 20 + y, 25, 25);
	    c.fillRoundRect(cX + 63 + x, cY + 30 + y, 20, 15, 10, 10);
	    c.fillRect(cX + 81 + x, cY + 35 + y, 5, 8);
	    //draw the ear
	    c.setColor(darkGray);
	    c.fillRoundRect(cX + 66 + x, cY + 15 + y, 5, 10, 3, 3);
	    //draw the eye
	    c.setColor(black);
	    c.fillOval(cX + 71 + x, cY + 30 + y, 5, 5);
	    //draw the quills - coordinates determined with the help of: https://stackoverflow.com/questions/20104611/find-new-coordinates-of-a-point-after-rotation
	    c.setColor(lightYellow);
	    int[] quills;
	    quills = new int[]{
		cX + 57 + x, cY + 7 + y, cX + 52 + x, cY + 8 + y, cX + 25 + x, cY - 7 + y, cX + 50 + x, cY + 4 + y, cX + 46 + x, cY + 6 + y, cX + 16 + x, cY - 2 + y, cX + 43 + x, cY + 2 + y, cX + 40 + x, cY + 6 + y, cX + 8 + x, cY + 6 + y, cX + 37 + x, cY + 3 + y, cX + 34 + x, cY + 7 + y, cX + 3 + x, cY + 16 + y, cX + 30 + x, cY + 5 + y, cX + 28 + x, cY + 10 + y, cX + x, cY + 26 + y, cX + 23 + x, cY + 9 + y, cX + 23 + x, cY + 14 + y, cX + 1 + x, cY + 36 + y, cX + 18 + x, cY + 14 + y, cX + 19 + x, cY + 19 + y, cX + 4 + x, cY + 46 + y, cX + 15 + x, cY + 21 + y, cX + 17 + x, cY + 25 + y, cX + 9 + x, cY + 55 + y
	    };
	    for (int n = 0; n < quills.length; n += 6) {
		xPos = new int[]{
		    quills[n], quills[n + 2], quills[n + 4]
		};
		yPos = new int[]{
		    quills[n + 1], quills[n + 3], quills[n + 5]
		};
		c.fillPolygon(xPos, yPos, 3);
	    }
	}

	//delay when the porcupine starts talking
	try {
	    sleep(4000);
	} catch (Exception e) {
	}

	synchronized (c) {
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 95, cY + 5, 180, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("Since the city was built", cX + 105, cY + 20);
	    c.drawString("nearby, my pond has become", cX + 105, cY + 35);
	    c.drawString("dirty, smelly and undrinkable.", cX + 105, cY + 50);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(4000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    //erase the speech bubble
	    c.setColor(grassGreen);
	    c.fillRect(cX + 95, cY + 5, 182, 52);
	    //draw the speech bubble
	    c.setColor(white);
	    c.fillRoundRect(cX + 100, cY + 5, 160, 50, 5, 5);
	    c.setColor(black);
	    c.drawString("I have to find a new pond", cX + 105, cY + 20);
	    c.drawString("to live near. I hope you", cX + 105, cY + 35);
	    c.drawString("come to visit! Bye for now.", cX + 105, cY + 50);
	    //delay how long the speech bubble will stay
	    try {
		Thread.sleep(5000);
	    } catch (Exception e) {
	    }
	}

	synchronized (c) {
	    c.setColor(grassGreen);
	    //erase the porcupine
	    c.fillRect(cX + x, cY - 7 + y, 86, 72);
	    //erase the speech bubble
	    c.fillRect(cX + 100, cY + 5, 162, 52);
	}

	synchronized (c) {
	    for (x = 0; x >= -200; x-=3) {
		y = x % 16 / 8 * 3; //used to animate height changes in the raccoon
		synchronized (c) {

		    //draw the front leg
		    c.setColor(darkGray);
		    xPos = new int[]{
			cX + 25 + x, cX + 35 + x + x % 16 / 8 * 3, cX + 40 + x + x % 16 / 8 * 3, cX + 45 + x
		    };
		    yPos = new int[]{
			cY + 35 + y, cY + 54 + y, cY + 54 + y, cY + 40 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the back leg
		    xPos = new int[]{
			cX + 45 + x, cX + 55 + x - x % 16 / 8 * 3, cX + 60 + x - x % 16 / 8 * 3, cX + 70 + x
		    };
		    yPos = new int[]{
			cY + 30 + y, cY + 54 + y, cY + 54 + y, cY + 30 + y
		    };
		    c.fillPolygon(xPos, yPos, 4);
		    //draw the body
		    c.setColor(darkGray);
		    c.fillOval(cX + 20 + x, cY + 5 + y, 50, 40);
		    //draw the head
		    c.setColor(darkGray);
		    c.fillOval(cX + 6 + x, cY + 20 + y, 25, 25);
		    c.fillRoundRect(cX + 3 + x, cY + 30 + y, 20, 15, 10, 10);
		    c.fillRect(cX + x, cY + 35 + y, 5, 8);
		    //draw the ear
		    c.setColor(darkGray);
		    c.fillRoundRect(cX + 15 + x, cY + 15 + y, 5, 10, 3, 3);
		    //draw the eye
		    c.setColor(black);
		    c.fillOval(cX + 10 + x, cY + 30 + y, 5, 5);
		    //draw the quills - coordinates determined with the help of: https://stackoverflow.com/questions/20104611/find-new-coordinates-of-a-point-after-rotation
		    c.setColor(lightYellow);
		    int[] quills;
		    quills = new int[]{
			cX + 29 + x, cY + 7 + y, cX + 34 + x, cY + 8 + y, cX + 61 + x, cY - 7 + y, cX + 36 + x, cY + 4 + y, cX + 40 + x, cY + 6 + y, cX + 70 + x, cY - 2 + y, cX + 43 + x, cY + 2 + y, cX + 46 + x, cY + 6 + y, cX + 78 + x, cY + 6 + y, cX + 49 + x, cY + 3 + y, cX + 52 + x, cY + 7 + y, cX + 83 + x, cY + 16 + y, cX + 56 + x, cY + 5 + y, cX + 58 + x, cY + 10 + y, cX + 86 + x, cY + 26 + y, cX + 63 + x, cY + 9 + y, cX + 63 + x, cY + 14 + y, cX + 85 + x, cY + 36 + y, cX + 68 + x, cY + 14 + y, cX + 67 + x, cY + 19 + y, cX + 82 + x, cY + 46 + y, cX + 71 + x, cY + 21 + y, cX + 69 + x, cY + 25 + y, cX + 77 + x, cY + 55 + y
		    };
		    for (int n = 0; n < quills.length; n += 6) {
			xPos = new int[]{
			    quills[n], quills[n + 2], quills[n + 4]
			};
			yPos = new int[]{
			    quills[n + 1], quills[n + 3], quills[n + 5]
			};
			c.fillPolygon(xPos, yPos, 3);
		    }
		}

		//used to delay the animation
		try {
		    sleep(30);
		} catch (Exception e) {
		}

		synchronized (c) {
		    //erase the porcupine
		    c.setColor(grassGreen);
		    c.fillRect(cX + x, cY - 7 + y, 86, 72);
		}
	    }
	}
    }

    public void run() {
	porcupine();
    }
}
