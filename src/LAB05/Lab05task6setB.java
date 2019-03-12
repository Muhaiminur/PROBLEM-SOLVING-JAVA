package LAB05;
/*Task 6:
Write a java program that reads twenty numbers from the user, and prints their average.
*/
import java.util.Scanner;
public class Lab05task6setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    int sum=0;
    while(c<20)
    {
      System.out.println("number");
      num=abir.nextInt();
      sum=num+sum;
      c=c+1;
    }
    int ave=sum/c;
    System.out.println(ave);
  }
}