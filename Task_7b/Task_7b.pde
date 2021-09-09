int number = -30;
int multiplier = 1;
if (number<0){multiplier =-1;
number=number*-1;
}
  
  for(int i=number; i>=0; i--){
if(i*multiplier==6){ 
println("six");
}
else if(i==number/2)
{println("HALF!");

}
else {
println(i*multiplier);
}
}
