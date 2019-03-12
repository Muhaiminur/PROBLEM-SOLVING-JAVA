package ASSIGNMENT;
/*Task16) Modify Task15, instead of counting factors, 
print sum of factors.*/
import java.util.Scanner;
public class assigment04task16
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int count=0;
    int sum=0;
    int a=0;
    int c=1;
    while(c<x)
    {
      if(x%c==0)
      {
        count=count+1;
        sum=sum+c;
      }
      c++;
    }
    if(count<=2)
    {
      System.out.println("vai ata prime number");
    }
    System.out.println(sum);
    System.out.println();
  }
}