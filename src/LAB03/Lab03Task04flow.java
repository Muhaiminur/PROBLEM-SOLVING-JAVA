package LAB03;
/*Task 4:
Draw the flowchart of a program that reads an integer, and prints the integer if it is a multiple of 2 and 5.
For example, 10, 20, 30, 40, 50 �*/
import java.util.Scanner;
public class Lab03Task04flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    int x=abir.nextInt();
    if(x%2==0){
      if(x%5==0){
        System.out.println(x);
      }
    }
  }
}