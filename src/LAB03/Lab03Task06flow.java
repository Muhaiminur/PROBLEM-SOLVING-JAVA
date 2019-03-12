package LAB03;
/*Task 6:
Draw the flowchart of a program that reads an integer, and prints the integer if it is NOT a multiple of 2 OR NOT a multiple of 5.*/
import java.util.Scanner;
public class Lab03Task06flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    int x=abir.nextInt();
    if(x%2!=0){
      System.out.println(x);
    }
    if(x%5==0){
      System.out.println(x);
    }
  }
}