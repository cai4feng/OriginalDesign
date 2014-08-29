int x=250;
int y=250;
int z=150;
int a=150;
void setup()
{
 size(500,500);
 frameRate(10);
}
void draw()
{ 
	
	fill((int)(Math.random()*225),(int)(Math.random()*225),(int)(Math.random()*225));
	noStroke();
  	ellipse(x,y,z,a);
  	ellipse(250,100,100,100);
  	ellipse(250,400,100,100);
  	ellipse(100,100,100,100);
  
  	ellipse(400,100,100,100);
    
}

void mousePressed()
{ background((int)(Math.random()*225),(int)(Math.random()*225),(int)(Math.random()*225));}