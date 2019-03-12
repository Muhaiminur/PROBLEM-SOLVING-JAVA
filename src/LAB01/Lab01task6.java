package LAB01;
/*Draw the flowchart of a program that reads two numbers from the user. Your program should then print �first is greater� 
 if the first number is greater, �second is greater� 
 if the second number is greater, and �the numbers are equal� otherwise.*/
import java.util.Scanner;
public class Lab01task6{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num2=abir.nextInt();
    if(num1>num2){
      System.out.println("first is greater");
    }else{
      if(num2>num1){
        System.out.println("second is greater");
      }else{
        System.out.println("the numbers are equal");
      }
    }
  }
}