package LAB03;
/*Task 3:
Draw the flowchart of a program that reads an integer, and prints the integer if it is a multiple of either 2 or 5 but not both.
For example, 2, 4, 5, 6, 8, 12, 14, 15, 16, 18, 22 �
*/
import java.util.Scanner;
public class Lab03Task03flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    int x=abir.nextInt();
    if(x%2==0){
      System.out.println(x);
    }else{
      if(x%5==0){
        System.out.println(x);
      }
    }
  }
}