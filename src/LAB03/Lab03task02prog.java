package LAB03;
/*1. Write a java program that reads one floating point from the user, and prints it back to show which floating point was entered by the user.*/
import java.util.Scanner;
public class Lab03task02prog{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    float x;
    x=abir.nextInt();
    System.out.println("apnar number"+" "+x);
  }
}