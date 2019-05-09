void setup() {
  //True setup.
  size(400,400);
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
void draw() {
  fill(random(1,255),random(1,255),random(1,255));
  textSize(70);
  textAlign(CENTER,CENTER);
  text("I LOVE YOU",0,5,400,250);
};
