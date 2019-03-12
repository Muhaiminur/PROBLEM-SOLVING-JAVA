package ASSIGNMENT;
/*Task13) Draw flowchart and write java code of a program that
takes a number and prints all numbers up to that number.
If the user gives 8, print 1 to 8.*/
import java.util.Scanner;
public class assigment04task13
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int product=1;
    int c=1;
    while(c<=x)
    {
     System.out.print(c);
      c++;
    }
    System.out.println();
  }
}
