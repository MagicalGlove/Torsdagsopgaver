int x = (int) random(1, 15);
int y = (int) random(1, 15);
int z = (int) random(1, 15);

if (x+y+z == 30 && x != 10 && x != 22 && x != 30 && y != 10 && y != 20 && y != 30 && z != 10 && z != 20 && z != 30){
  println ("Success");
}
else {
  println("Failure!");
}

println("x = " +x, "y = " +y, "z = " +z);
  println(x+y+z);
