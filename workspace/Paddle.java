import java.awt.*;
//Leila Singer
//12/6/24
//Initates paddle variable in order to make it correctly work overall.
public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
private int y;
private int height;
private int width;
private int Xvelocity;
	//constructor(s):
public Paddle (int x,int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}
	//methods:

	public  int getY(){
		return y;}

	public int getX(){
		return x;

	}

	public int getHeight(){
		return height;

	}

	public int getWidth(){
		return width;
	}
	
	public void setWidth(int width){
		this.width=width;
	}
	public void setHeight(int height){
		this.height=height;

	}


	public void setX(int x){
		this.x=x;
	}

	public void setY(int y){
		this.y=y;
	}
	
	
	
	public int getVelocity(){
		return Xvelocity;
	}
	public void setVelocity(int Xvelocity){
this.Xvelocity=Xvelocity;
	}
	
	//precondition: variable g must be properly declared
	//postcondition: sets paddle color to white, sets the shape to oval
	public void draw (Graphics g){
  g.setColor(Color.white);
  g.fillOval(x, y, width, height);
}
//precondition: velocity and Xvelocity are set correctly
//postcondition: adds velocity to x value
public void addVelocity (int velocity){
	Xvelocity = velocity;
}
//precondition: x value and xvelocity work correctly
//postcondition: moves x value by x velocity
public void move(){
	x+=Xvelocity;

}
		


	
}
