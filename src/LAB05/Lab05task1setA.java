package LAB05;
/*Task 1:
Write a java program that reads five numbers as input from the user, and prints whether the numbers are odd or even
*/
import java.util.Scanner;
public class Lab05task1setA{
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
    if(num1%2==0){
      System.out.println("EVEN");
    }else{
      System.out.println("odd");
    }
    if(num2%2==0){
      System.out.println("EVEN");
    }else{
      System.out.println("odd");
    }
    if(num3%2==0){
      System.out.println("EVEN");
    }else{
      System.out.println("odd");
    }
    if(num4%2==0){
      System.out.println("EVEN");
    }else{
      System.out.println("odd");
    }
    if(num5%2==0){
      System.out.println("EVEN");
    }else{
      System.out.println("odd");
    }
  }
}