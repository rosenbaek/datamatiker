boolean lightGreen = false;
boolean lightYellow = false;
color redOn = color(255, 0, 0, 255);
color yellowOn = color(240, 218, 42, 255);
color greenOn = color(126, 245, 34, 255);
color redOff = color(255, 0, 0, 100);
color yellowOff = color(240, 218, 42, 100);
color greenOff = color(126, 245, 34, 100);
int x = 0;
int background = 100;
int fill = 0;


void setup() {
  size(700, 700);
  frameRate(1);
}




void draw() {
  int w = width/2;
  int h = height/2;

  println(w);

  background(background);

  fill(fill);
  rectMode(CENTER);
  rect(w, h, 200, 600, 15);
  if (x > 18)
  {
    x = 0;
  }

  // FLOW - TRAFFIC LIGHT LOOP
  if (x < 4)
  {
    fill(greenOff);
    ellipseMode(CENTER);
    ellipse(w, (h+200), 180, 180);
    //Red Light
    fill(redOn);
    ellipseMode(CENTER);
    ellipse(w, (h-200), 180, 180);
    // Yellow Light
    fill(yellowOff);
    ellipseMode(CENTER);
    ellipse(w, (h), 180, 180);
  } else if (x > 3 && x < 6)
  {
    fill(greenOff);
    ellipseMode(CENTER);
    ellipse(w, (h+200), 180, 180);
    //Red Light
    fill(redOn);
    ellipseMode(CENTER);
    ellipse(w, (h-200), 180, 180);
    // Yellow Light
    fill(yellowOn);
    ellipseMode(CENTER);
    ellipse(w, (h), 180, 180);
  } else if (x > 5 && x < 14)
  {
    fill(greenOn);
    ellipseMode(CENTER);
    ellipse(w, (h+200), 180, 180);
    //Red Light
    fill(redOff);
    ellipseMode(CENTER);
    ellipse(w, (h-200), 180, 180);
    // Yellow Light
    fill(yellowOff);
    ellipseMode(CENTER);
    ellipse(w, (h), 180, 180);
  } else if (x > 13 && x < 16)
  {
    fill(greenOff);
    ellipseMode(CENTER);
    ellipse(w, (h+200), 180, 180);
    //Red Light
    fill(redOff);
    ellipseMode(CENTER);
    ellipse(w, (h-200), 180, 180);
    // Yellow Light
    fill(yellowOn);
    ellipseMode(CENTER);
    ellipse(w, (h), 180, 180);
  } else if (x > 15 && x < 18)
  {
    fill(greenOff);
    ellipseMode(CENTER);
    ellipse(w, (h+200), 180, 180);
    //Red Light
    fill(redOn);
    ellipseMode(CENTER);
    ellipse(w, (h-200), 180, 180);
    // Yellow Light
    fill(yellowOff);
    ellipseMode(CENTER);
    ellipse(w, (h), 180, 180);
  }     


  x++;
}

void keyPressed() {
  if (keyCode == ENTER) {
    lightGreen = !lightGreen;
    lightYellow = !lightYellow;
  } else if (key == 'r') {
  } else if (key == 'g') {
  } else if (key == 'y') {
    lightYellow = !lightYellow;
  }
}

void green() {
}
