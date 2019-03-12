package LAB05;
/*sk 2:
Write a java program that reads five numbers from the user, and prints their average.
*/
import java.util.Scanner;
public class Lab05task2setA{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter anumber");
    int num1=abir.nextInt();
    System.out.println("enter anumber");
    int num2=abir.nextInt();
    System.out.println("enter anumber");
    int num3=abir.nextInt();
    System.out.println("enter anumber");
    int num4=abir.nextInt();
    System.out.println("enter anumber");
    int num5=abir.nextInt();
    int sum=num1+num2+num3+num4+num5;
    System.out.println("apnar average "+sum/5);
  }
}