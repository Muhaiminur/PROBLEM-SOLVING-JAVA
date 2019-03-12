package ASSIGNMENT;
/*Task14) Draw flowchart and write java code of a program that
takes a number and counts how many times that number can be 
divided by all numbers up to that number (Those numbers are 
also known as factors)
If the user gives 8, tries to divide 8 by each of 1 to 8
and count how many times it could be divided.
For example: 
If user enters 8,
try to divide 8 by 1, its divisible (increase count to 1)
try to divide 8 by 2, its divisible (increase count to 2)
try to divide 8 by 3, its NOT divisible
try to divide 8 by 4, its divisible (increase count to 3)
try to divide 8 by 5, its NOT divisible
try to divide 8 by 6, its NOT divisible
try to divide 8 by 7, its NOT divisible
try to divide 8 by 8, its divisible (increase count to 4)
Now print the count which is 4 in this case.*/
import java.util.Scanner;
public class assigment04task14
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int count=0;
    int c=1;
    while(c<=x)
    {
      if(x%c==0)
      {
        count=count+1;
      }
      c++;
    }
    System.out.println(count);
  }
}