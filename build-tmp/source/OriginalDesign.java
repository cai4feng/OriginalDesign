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

int x=250;
int y=250;
int z=150;
int a=150;
public void setup()
{
 size(500,500);
 frameRate(10);
}
public void draw()
{ 
	
	fill((int)(Math.random()*225),(int)(Math.random()*225),(int)(Math.random()*225));
	noStroke();
  	ellipse(x,y,z,a);
  	ellipse(250,100,100,100);
  	ellipse(250,400,100,100);
  	ellipse(100,100,100,100);
  
  	ellipse(400,100,100,100);
    
}

public void mousePressed()
{ background((int)(Math.random()*225),(int)(Math.random()*225),(int)(Math.random()*225));}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
