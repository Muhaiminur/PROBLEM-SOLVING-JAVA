package LAB01;
/*Draw the flowchart of a program that reads a number, and prints �The number is even� or �The number is odd�, 
 depending on whether the number is even or odd. (Hint: use the modulus operator)*/
import java.util.Scanner;
public class Lab01task8{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    if(num1%2==0){
      System.out.println("The number is even");
    }else{
      System.out.println("The number is odd");
    }
  }
}