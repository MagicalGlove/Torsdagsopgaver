//Tab that forms the dice

class Die {
  color eyeColor; // Colour of the die itself
  color dieColor; // Colour of the eyes in the dice
  int eyes; // The amount of eyes each die has
  int roll; // Rolls the dies
  int x; // Placement of the dices on the x-axis
  int y; // Placement of the dices on the y-axis
  int size = width/10; // The size of the dices
  int draw; // The variable which shows the dices
  int smoothCorners; // Makes the courners more soothing to look at
  int eyeSize; //Size of the eyes on the die


  public Die(color eyeColor, color dieColor) { // Construcktor
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }

  // Gives each die a random set of eyes
  public void roll() {  
    eyes = (int) random(1, 7);
  }

  public void draw(int x, int y, int size, int smoothCorners) {
    eyeSize = 8;
    this.x = x;
    this.y = y;
    rectMode(CENTER);
    fill(dieColor);
    rect(x, y, size, size, smoothCorners);
    fill(eyeColor);
    if (eyes == 1) {
      circle(x, y, eyeSize);
    } else if (eyes == 2) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 3) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x, y, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 4) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 5) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
    } else if (eyes == 6) {
      circle(x+size*0.25, y+size*0.25, eyeSize);
      circle(x-size*0.25, y-size*0.25, eyeSize);
      circle(x-size*0.25, y+size*0.25, eyeSize);
      circle(x+size*0.25, y-size*0.25, eyeSize);
      circle(x+size*0.25, y, eyeSize);
      circle(x-size*0.25, y, eyeSize);
    }
  }
}
