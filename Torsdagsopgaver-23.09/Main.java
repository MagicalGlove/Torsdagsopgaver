//1.a Create a file and name it Main.java, include a main method.
public class Main { //Our class called "Main"


  public static void main(String[] args) {
   emptyLine();
   stringReciever("Print me");
   Person("Michael", 19);

//1.b Write a function that prints an empty line and call it from main();
 }
 public static void emptyLine (){ //Method called emtpyLine
System.out.println();
  }
//1.c Write a function that receives a string as a parameter and prints it. call this function from main()
  public static void stringReciever (String recieveMe) { //Mehtod called stringReciever
    System.out.println(recieveMe);
  }
//1.d Write a function that receives a string called "name" and an integer called "age" and call it
//from main with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
public static void Person (String name, int age) {

  System.out.println("Hi, my name is "+name+ " and my age is "+age+ " years old");
 }
}
