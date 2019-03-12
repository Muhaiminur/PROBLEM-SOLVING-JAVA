package LAB01;
/*Task 12
Draw the flowchart of a program that finds the sum of the first 100 positive numbers.]
Verify your answer by calculating this sum manually. [Do NOT use loops, use the mathematical formula]*/
import java.util.Scanner;
public class Lab01task12{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int count=0;
    int sum=0;
    while(count<100){
      sum=sum+count;
      count++;
    }
    System.out.println(sum);
  }
}