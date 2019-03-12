package LAB01;
/*Draw the flowchart of a program that reads two numbers from the user and prints �first� if the first number is greater than the second number.*/
import java.util.Scanner;
public class Lab01task4{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num2=abir.nextInt();
    if(num1>num2){
      System.out.println("first");
    }
  }
}