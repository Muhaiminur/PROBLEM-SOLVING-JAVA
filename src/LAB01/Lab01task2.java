package LAB01;
/*Draw the flowchart of a program that reads two numbers from the user, and prints their sum, product and difference.*/
import java.util.Scanner;
public class Lab01task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR First NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR Second NUMBER");
    int num2=abir.nextInt();
    int sum=num1+num2;
    int product=num1*num2;
    int dif=num1-num2;
    System.out.println("apnar sum ="+sum);
    System.out.println("apnar product ="+product);
    System.out.println("apnar differences ="+dif);
  }
}