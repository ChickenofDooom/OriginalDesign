import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
  size(400,400);
  background(0,255,255);
  textAlign(CENTER);
  
}
public void draw(){
	neck();
	paper();
	body();
	face();
	
}

public void neck()
{
fill(255,255,0);
rect(185,215,30,40);

}

public void face()
{
fill(255,255,0);
ellipse(200,175,125,125);
fill(255,255,255);
ellipse(170,165,35,35);
ellipse(230,165,35,35);
fill(0,0,0);
ellipse(160,165,10,10);
ellipse(240,165,10,10);
stroke(0,0,0);
fill(255,255,0);
arc(200,190,15,10,PI/2,(3*PI)/2);
fill(255,0,0);
arc(200,200,80,50,0,PI);

}

public void paper(){
fill(255,255,255);
rect(70,250,60,85);
fill(255,0,0);
textSize(25);
text("A+",100,300);
text("Every Lowell Student Ever",200,30);
}

public void body(){
fill(255,255,0);
rect(130,285,50,25);
rect(230,285,25,70);
fill(0,50,255);
ellipse(200,300,100,150);
fill(255,255,0);
ellipse(125,290,15,10);
fill(255,0,0);
text("Move to give him an F",200,350);

}
public void mouseMoved() {
	fill(0,255,0);
	rect(0,0,400,400);
	//necktwo
	fill(255,255,0);
	rect(185,215,30,40);
	
	//papertwo
	fill(255,255,255);
	rect(70,250,60,85);
	fill(255,0,0);
	textSize(25);
	text("F-",100,300);
	

	//bodytwo
	fill(255,255,0);
	rect(130,285,50,25);
	rect(230,285,25,70);
	fill(0,50,255);
	ellipse(200,300,100,150);
	fill(255,255,0);
	ellipse(125,290,15,10);
	
	//facetwo
	fill(255,255,0);
	ellipse(200,175,125,125);
	fill(255,255,255);
	ellipse(170,165,35,35);
	ellipse(230,165,35,35);
	fill(0,0,0);
	ellipse(160,165,10,10);
	ellipse(240,165,10,10);
	stroke(0,0,0);
	fill(255,255,0);
	arc(200,190,15,10,PI/2,(3*PI)/2);
	fill(255,0,0);
	arc(200,220,80,50,PI,2*PI);
	
	text("Every Lowell Student Ever",200,30);
	
}




  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
