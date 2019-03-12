package LAB01;
/*Draw the flowchart of a program that reads two numbers, subtracts the smaller number from the larger one, and prints the result.*/
import java.util.Scanner;
public class Lab01task7{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num1=abir.nextInt();
    System.out.println("ENTER YOUR NUMBER");
    int num2=abir.nextInt();
    if(num1>num2){
      int sub=num1-num2;
      System.out.println(sub);
    }else{
      int sub=num2-num1;
      System.out.println(sub);
    }
  }
}