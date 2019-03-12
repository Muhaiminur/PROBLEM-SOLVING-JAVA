package LAB03;
/*3. Write a java program that reads two integers from the user, and prints their sum, product and difference.*/
import java.util.Scanner;
public class Lab03task03prog{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num2=abir.nextInt();
    int sum=num1+num2;
    int product=num1*num2;
    int dif=num1-num2;
    System.out.println("apnar sum "+sum);
    System.out.println("apnar product "+product);
    System.out.println("apnar differences "+dif);
  }
}