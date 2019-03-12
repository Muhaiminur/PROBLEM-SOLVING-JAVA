package ASSIGNMENT;
/*Task18) Ask user for a range. Count how many numbers are prime number
and how many numbers are perfect numbers between that range.
For example, between 2 and 6 there are 3 prime numbers (2, 3, 5) 
and 1 perfect number (6).

Sample Input:
2 6
Sample Output:
Between 2 and 6,
Found 3 prime numbers
Found 1 perfect number.*/
import java.util.Scanner;
public class assigment04task18
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    System.out.println("enter a number");
    int y=abir.nextInt();
    int primecount=0;
    int perfectcount=0;
    while(x<=y)
    {
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
    if(count<=1)
    {
      primecount=primecount+1;
    }
    if(sum==x)
    {
      perfectcount=perfectcount+1;
    }
    x++;
    }
    System.out.println("found "+primecount+" prime numbers");
    System.out.println("found "+perfectcount+" perfect numbers");
  }
}