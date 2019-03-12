package LAB01;
/*Draw the flowchart of a program that reads five numbers as input from the user,
 and prints whether the numbers are odd or even. [Do NOT use loops]*/
import java.util.Scanner;
public class Lab01task13{
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
    if(num1%2==0){//1
      System.out.println("your first number is even");
    }else{
      System.out.println("your first number is odd");
    }
    if(num2%2==0){//2
      System.out.println("your second number is even");
    }else{
      System.out.println("your second number is odd");
    }
    if(num3%2==0){//3
      System.out.println("your third number is even");
    }else{
      System.out.println("your third number is odd");
    }
    if(num4%2==0){//4
      System.out.println("your fourth number is even");
    }else{
      System.out.println("your fourth number is odd");
    }
    if(num5%2==0){//5
      System.out.println("your fibe number is even");
    }else{
      System.out.println("your five number is odd");
    }
  }
}