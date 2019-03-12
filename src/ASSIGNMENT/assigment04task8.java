package ASSIGNMENT;
/*Task8) Draw flowchart and Write a Java program which takes a 
number and prints the value of 10 to the power that number.
You need to use loop because variable in the power isn't allowed.
For example: if user gives 3, print 1000.
Hint: Keep multiplying 1 by 10, again and again, 3 (or n) times
like sum=sum+n, you need to write, product = product x 10
1 x 10 = 10
10 x 10 = 100
100 x 10 = 1000
1000 x 10 = 10000*/
import java.util.Scanner;
public class assigment04task8
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int product=1;
    int c=0;
    while(c<x)
    {
      product=product*10;
      c++;
    }
    System.out.println(product);
  }
}


