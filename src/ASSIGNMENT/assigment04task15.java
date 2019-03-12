package ASSIGNMENT;
/*Task15) If a number is NOT divisible any number other than 1
and itself, then it is called prime number. 
For example, 13 is a prime number because it is NOT
divisible by any number other than 1 and 13 (itself).
Take one number from the user and tell if it is prime number or not.
Hint: Use the technique from Task14 and count factors of the 
input. Factors are those numbers between 1 and n that can 
divide the number, n. If there are more than two factors (1 
and n), then the number, n is not prime because it was 
divisible by other numbers.*/
import java.util.Scanner;
public class assigment04task15
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int count=0;
    int c=2;
    while(c<x)
    {
      if(x%c==0)
      {
        count=count+1;
      }
      c++;
    }
    if(count==0)
    {
      System.out.println("vai ata prime number");
    }
    System.out.println();
  }
}