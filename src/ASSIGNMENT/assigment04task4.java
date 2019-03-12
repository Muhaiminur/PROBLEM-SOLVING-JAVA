package ASSIGNMENT;
/*Task4) Draw flowchart and Write a Java program which adds all 
numbers that are multiples of both 7 and 9 up to 600.*/
import java.util.Scanner;
public class assigment04task4
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    int sum=0;
    while(c<600)
    {
      if(num%7==0)
      {
        if(num%9==0)
        {
          System.out.println(num);
          sum=sum+num;
        }
      }
      num=num+1;
      c=c+1;
    }
    System.out.println(sum);
  }
}