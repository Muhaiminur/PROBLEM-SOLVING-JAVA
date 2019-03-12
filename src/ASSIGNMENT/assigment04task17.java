package ASSIGNMENT;
/*Task17) Modify Task15, calculate sum of factors less than 
the number itself. If the sum equals to the number, then 
print that the number is a perfect number.
Example: User enters n = 6. Factors of 6 are 1, 2, 3.
Sum of those factors 1+2+3=6 which is same as the number 6(n).
So, print that 6 is a perfect number.
Example2: If user enters 8. Factors of 8 are 1, 2, 4.
1+2+4=7 (NOT equal to 8).
So, print that 8 is NOT a perfect number.*/
import java.util.Scanner;
public class assigment04task17
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
    if(sum==x)
    {
      System.out.println(x+"is a perfect number");
    }
    else
    {
      System.out.println(x+"is not a perfect number");
    }
    
    System.out.println();
  }
}