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

public class desenho_computacao_grafica extends PApplet {

  /*
  
  Pedro Henrique, RA: 1510033232
  
  */
  
public void setup(){
  
  background(0xffffffff);
  
 
}


public void draw(){
  
  fill(201);
  strokeWeight(2);
  circle(215, 200, 50);
  circle(215, 200, 15);
  circle(360, 200, 50);
  circle(360, 200, 15);
 
  line(190,200,170,200);
  line(170,200,145,190);
  line(170,200,145,190);
  line(145,190,145,165);
  line(145,165,155,150);
  line(155,150,180,140);
  line(180,140,230,140);
  line(230,140,300,120);
  line(300,120,350,120);
  line(350,120,380,135);
  triangle(371,138,325,127,325,152);
  triangle(246,141,313,126,313,150);
  line(391,132,380,135);
  line(391,132,385,143);
  line(385,143,390,150);
  line(385,143,395,160);
  line(395,160,400,185);
  line(400,185,397,203);
  line(397,203,387,204);
  line(335,203,242,203);

  fill(102);
  rect(40, 235, 70, 10);
  rect(160, 235, 70, 10);
  rect(280, 235, 70, 10);
  rect(400, 235, 70, 10);
  line(0,100,500,100);
  line(0,340,500,340);
  

}
  public void settings() {  size(500,450); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "desenho_computacao_grafica" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
