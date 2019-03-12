package LAB05;
/*Task 9:
Write a java program that prints the following sequences of values using loops:
c) 18, 27, 36, 45, 54, 63
*/
import java.util.Scanner;
public class Lab05task9csetB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=18;
    while(c<6){
      System.out.println(num);
      num=num+9;
      c++;
    }
  }
}