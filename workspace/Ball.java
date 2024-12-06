import java.awt.*;
//Leila Singer
//12/6/24
//Initiates ball for the overall code in order to make it properly work
public class Ball {
	//your code here!
	//don't forget you need instance variables:
	
private int ypos;
private int xpos;
private int size;
private int Xvelocity;
private int Yvelocity;

	
	//constructor(s):
	public Ball(int x, int y, int size) {
		this.xpos=x;
		this.ypos=y;
		this.size = size;
		Xvelocity = 1;
		Yvelocity = 1;
	}
	//getters and setters
	 public  int getYpos(){
		return ypos;
	 }
	public int getXpos(){
		return xpos;
	}
	public int getSize(){
		return size;
	}
	public void setY (int ypos){
		this.ypos = ypos;
	}
	public void setX (int xpos){
		this.xpos = xpos;
	}
	public void setSize (int size){
		this.size = size;
	}
	public void setXVelocity(int Xvelocity){
		this.Xvelocity=Xvelocity;
	}
	public void setYVelocity(int YVelocity){
		this.Yvelocity = YVelocity;
	}
	//precondition: Xvelocity is set correctly
	//postcondition: reverses x value when it hits a block
	public void reverseX(){
		Xvelocity *=-1;
	}
	//precondition: Yvelocity is set correctly
	//postcondition: reverses y value when it hits a block
	public void reverseY(){
		Yvelocity*=-1;
	}
//precondition: variable g is properly declared
//postcondition: Ball is set to the color white, and made into an oval
public void draw (Graphics g){
  g.setColor(Color.white);
  g.fillOval(xpos, ypos, size, size);
}
//precondition: xpos, ypos, xvelocity, and yvelocity all work correctly
//postcondition: Moves the ball
public void move (){
	xpos+=Xvelocity;
	ypos+=Yvelocity;
}

// .draw
// .move






}




