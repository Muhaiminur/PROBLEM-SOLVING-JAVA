package LAB05;
/*Task 9:
Write a java program that prints the following sequences of values using loops:
a) 24, 18, 12, 6, 0, -6
*/
import java.util.Scanner;
public class Lab05task9asetB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=24;
    while(c<6){
      System.out.println(num);
      num=num-6;
      c++;
    }
  }
}