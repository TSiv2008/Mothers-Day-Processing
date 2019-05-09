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

public class Mothers_Day extends PApplet {

public void setup() {
  //True setup.
  
  background(0,0,255);
  noStroke();
  //The scene.
  fill(0,255,0);
  rect(0,300,400,100);
  fill(255,255,0);
  ellipse(0,0,125,125);
  //The flowers. #1
  fill(0,200,0);
  rect(90,235,25,125);
  fill(255,255,255);
  ellipse(100,235,70,70);
  fill(255,255,0);
  ellipse(100,235,30,30);
  //The flowers. #2
  fill(0,200,0);
  rect(270,235,25,125);
  fill(255,255,255);
  ellipse(280,235,70,70);
  fill(255,255,0);
  ellipse(280,235,30,30);
};
public void draw() {
  fill(random(1,255),random(1,255),random(1,255));
  textSize(70);
  textAlign(CENTER,CENTER);
  text("I LOVE YOU",0,5,400,250);
};
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Mothers_Day" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
