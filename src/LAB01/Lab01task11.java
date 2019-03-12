package LAB01;
/*Draw the flowchart of a program that reads five numbers from the user,
 and prints their average. [Do NOT use loops]*/
import java.util.Scanner;
public class Lab01task11{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num2=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num3=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num4=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num5=abir.nextInt();
    double ave=(num1+num2+num3+num4+num5)/5;
    System.out.println("apnar average "+ave);
  }
}