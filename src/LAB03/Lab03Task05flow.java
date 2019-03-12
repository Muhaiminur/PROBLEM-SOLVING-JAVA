package LAB03;
/*Task 5:
Draw the flowchart of a program that reads an integer, and prints the integer if it is a multiple of NEITHER 2 NOR 5.
For example, 1, 3, 7, 9, 11, 13, 17, 19, 21, 23, 27, 29, 31, 33, 37, 39 �
*/
import java.util.Scanner;
public class Lab03Task05flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    int num=abir.nextInt();
    if(num%2!=0){
      System.out.println(num);
    }else{
      if(num%5!=0){
        System.out.println(num);
      }
    }
  }
}