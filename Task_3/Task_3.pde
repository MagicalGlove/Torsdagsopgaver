boolean redLight = true;
int r = 255;
int g = 255;
int b = 255;
int bg = 255;
int diam = 140;
int grey = 75;
int farve = 1;


void setup (){
size(400, 600);
background(bg);

}

void draw(){
  fill(50);
  rectMode(CENTER);
  rect(width/2, height/2, 200, 500);
  
  //red
  if (farve == 1){
    fill(r,0,0);
    circle(width/2, height/4, diam);
    fill(grey);
    circle(width/2, height/2, diam);
    circle(width/2, height/4*3, diam);
    
  }
  
  //red/gul
  if (farve == 2){
    fill(r, 0, 0);
    circle(width/2, height/4, diam);
 
   fill(r,g, 0);
   circle(width/2, height/2, diam);
   
   fill(grey);
   circle(width/2, height/4*3,diam);
  }
  
  //grøn
  if (farve ==3){
    fill(grey);
    circle(width/2, height/4, diam);
    
    fill(grey);
    circle(width/2, height/2, diam);
    
  fill(0,g,0);
  circle(width/2, height/4*3,diam);
  }
  
  //gul
   if (farve == 4){
  fill(r,g,0);
  circle(width/2, height/2, diam);
  
  fill(grey);
   circle(width/2, height/4*3,diam);
   
   fill(grey);
   circle(width/2, height/4, diam);
  }
  
  farve++;
  
  if(farve > 4){
    farve = 1;
   
  }
   delay(1000);
}
