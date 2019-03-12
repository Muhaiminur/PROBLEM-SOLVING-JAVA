package ASSIGNMENT;
/*Task9) Draw flowchart and Write a Java program which takes a 
number and prints the digits from unit place, then tenth, then hundredth, etc.
Example: if user gives 32768, then print 8, 6, 7, 2, 3
Hint: Taking remainder/modulus of division by 10. 
After printing the remainder, drop the last digit by 
dividing by 10. Then start over.

32,768 % 10 = 8
32,768 / 10 = 3, 276

3, 276 % 10 = 6
3, 276 / 10 = 327

327 % 10 = 7
327 / 10 = 32

32 % 10 = 2
32 / 10 = 3

3 % 10 = 3
3 / 10 = 0*/
import java.util.Scanner;
public class assigment04task9
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int a=0;
    while(x>0)
    {
      a=x%10;
      System.out.print(a+" ");
      x=x/10;
    }
    System.out.println();
  }
}