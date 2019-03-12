package LAB03;
/*Draw the flowchart of a program that reads two floating numbers from the user, and prints their sum, product and difference.*/
import java.util.Scanner;
public class Lab03task04prog{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    float num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    float num2=abir.nextInt();
    float sum=num1+num2;
    float product=num1*num2;
    float dif=num1-num2;
    System.out.println("apnar sum "+sum);
    System.out.println("apnar product "+product);
    System.out.println("apnar differences "+dif);
  }
}