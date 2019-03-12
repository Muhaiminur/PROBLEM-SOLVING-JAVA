package LAB05;
/*Task 5:
Write a java program that reads twenty numbers as input from the user, and prints whether the numbers are odd or even.
*/
import java.util.Scanner;
public class Lab05task5setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    while(c<20){
      System.out.println("number ta vai?");
      num=abir.nextInt();
      if(num%2==0){
        System.out.println("EVEN");
      }else{
        System.out.println("ODD");
      }
      c++;
    }
  }
}