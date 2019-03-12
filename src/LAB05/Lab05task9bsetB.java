package LAB05;
/*Task 9:
Write a java program that prints the following sequences of values using loops:
b) -10, -5, 0, 5, 10, 15, 20
*/
import java.util.Scanner;
public class Lab05task9bsetB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=-10;
    while(c<7){
      System.out.println(num);
      num=num+5;
      c++;
    }
  }
}