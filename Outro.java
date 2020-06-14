
import hsa.Console;
import java.awt.*;

public class Outro {

    private Console c;

    public Outro(Console con) {
	c = con;
	draw();
    }

    public void draw() {
	Color black = new Color(0, 0, 0);
	Color white = new Color(255, 255, 255);
	Font f1 = new Font("TimesRoman", Font.BOLD, 35);
	Font f2 = new Font("TimesRoman", Font.PLAIN, 15);
	//slowly fade in the outro
	for (int n = 1; n <= 8; n++) {
	    c.setColor(new Color(0, 0, 0, n * 15));
	    for (int y = 0; y <= 500; y++) {
		c.drawLine(0, y, 640, y);
	    }
	}
	c.setColor(white);
	c.setFont(f1);
	//draw the title
	c.drawString("T H E   E N D", 200, 200);
	c.setFont(f2);
	//draw name
	c.drawString("Nicole Han", 270, 250);
    }
}
