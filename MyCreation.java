/*
Name: Nicole Han
Teacher: Ms. Krasteva
Date: October 28, 2019
This class displays a short animation about urban sprawl and it's affect
on the environment. MyCreation.java will run the other classes. The overloaded
constructor is demonstrated in Rabbit.java.
*/

import hsa.Console;
import java.awt.*;

public class MyCreation {
    Console c; //Console for output
    
    //creates a new window and gives it a title
    public MyCreation() {
	c = new Console("Urban Sprawl");
    }
    
    //adds the Intro to MyCreation
    public void intro() {
	Intro i = new Intro(c);
    }
    
    //adds the Outro to MyCreation
    public void outro() {
	Outro o = new Outro(c);
    }
    
    //adds the first background to MyCreation
    //overloaded method calls same instance of background multiple times
    Background1 b1; //allows for calling in overloaded methods
    public void background1() {
	b1 = new Background1(c);
	background1(true);
    }
    public void background1(boolean second) {
	b1.draw();
    }
    
    //adds the second background to MyCreation
    public void background2() {
	Background2 b2 = new Background2(c);
    }
    
    //adds the third background to MyCreation
    public void background3() {
	Background3 b3 = new Background3(c);
    }
    
    //adds the fourth background to MyCreation
    public void background4() {
	Background4 b4 = new Background4(c);
    }
    
    //adds the fifth background to MyCreation
    public void background5() {
	Background5 b5 = new Background5(c);
    }
    
    //adds the sixth background to MyCreation
    public void background6() {
	Background6 b6 = new Background6(c);
    }
    
    //adds the seventh background to MyCreation
    public void background7() {
	Background7 b7 = new Background7(c);
    }
    
    //adds the eigth background to MyCreation
    public void background8() {
	Background8 b8 = new Background8(c);
    }
    
    //adds the ninth background to MyCreation
    public void background9() {
	Background9 b9 = new Background9(c);
    }
    
    //adds the YoungSquirrel thread to MyCreation
    //overloaded method calls same instance of the YoungSquirrel class multiple times, so squirrel can run in multiple backgrounds/scenes
    YoungSquirrel ys; //allows for calling in overloaded methods
    public void youngSquirrel() {
	//creates YoungSquirrel thread
	ys = new YoungSquirrel(c);
	youngSquirrel(true);
    }
    public void youngSquirrel(boolean next) {
	//starts YoungSquirrel thread
	ys.run();
    }
    
    //adds ThiefSquirrel thread to MyCreation
    public void thiefSquirrel() {
	//creates ThiefSquirrel thread
	ThiefSquirrel ts = new ThiefSquirrel(c);
	//starts ThiefSquirrel thread
	ts.start();
    }
    
    //adds MomSquirrel thread to MyCreation
    public void momSquirrel() {
	//creates MomSquirrel thread
	MomSquirrel ms = new MomSquirrel(c);
	//starts MomSquirrel thread
	ms.start();
    }
    
    //adds Deer thread to MyCreation
    public void deer() {
	//creates Deer thread
	Deer d = new Deer(c);
	//starts Deer thread
	d.start();
    }
    
    //adds Raccoon thread to MyCreation
    public void raccoon() {
	//creates Raccoon thread
	Raccoon r = new Raccoon(c);
	//starts Raccoon thread
	r.start();
    }
    
    //adds Porcupine thread to MyCreation
    public void porcupine() {
	//creates Porcupine thread
	Porcupine p = new Porcupine(c);
	//starts Porcupine thread
	p.start();
    }
    
    //adds Opossum thread to MyCreation
    public void opossum() {
	//creates Opossum thread
	Opossum o = new Opossum(c);
	//starts Opossum thread
	o.start();
    }
    
    //adds Rabbit thread to MyCreation
    public void rabbit() {
	//creates Rabbit thread
	Rabbit r1 = new Rabbit(c);
	//starts the first Rabbit thread
	r1.start();
	Rabbit r2 = new Rabbit(c,new Color(153,138,126),20);
	//starts the second Rabbit thread
	r2.start();
	Rabbit r3 = new Rabbit(c,new Color(255,255,255),new Color(122,106,91),25);
	//starts the third Rabbit thread
	r3.start();
    }
    
    public static void main(String[] args) {
	MyCreation mc = new MyCreation();
	//introduction
	mc.intro();
	//animate scene #1
	mc.background1();
	mc.thiefSquirrel();
	mc.youngSquirrel();
	//animate scene #2
	mc.background2();
	mc.youngSquirrel(true);
	//animate scene #3
	mc.background3();
	mc.youngSquirrel(true);
	//animate scene #4
	mc.background1(true);
	mc.momSquirrel();
	mc.youngSquirrel(true);
	//animate scene #5
	mc.background4();
	mc.deer();
	mc.youngSquirrel(true);
	//animate scene #6
	mc.background5();
	mc.raccoon();
	mc.youngSquirrel(true);
	//animate scene #7
	mc.background6();
	mc.porcupine();
	mc.youngSquirrel(true);
	//animate scene #8
	mc.background7();
	mc.opossum();
	mc.youngSquirrel(true);
	//animate scene #9
	mc.background8();
	mc.rabbit();
	mc.youngSquirrel(true);
	//animate scene #10
	mc.background1(true);
	mc.youngSquirrel(true);
	//animate scene #11
	mc.background9();
	mc.youngSquirrel(true);
	//outro
	mc.outro();
    }
}
