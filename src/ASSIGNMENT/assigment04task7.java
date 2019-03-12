package ASSIGNMENT;
/*Draw flowchart and Write a Java program which takes a 
number and tells how many digits are in that number. 
Example: if user gives 9876, you should print 4.
Hint: keep dividing by ten and count how many times the 
could  be divided.
9876 by 10, is 987, count that got 1 digit
987 by 10, is 98, count that got 1 digit (total 2)
98 by 10, is 9, count that got 1 digit (total 3)
9 by 10, is 0, count that got 1 digit (total 4)
done!*/
import java.util.Scanner;
public class assigment04task7
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int count=0;
    while(x>0)
    {
      x=x/10;
      count=count+1;
    }
    System.out.println("your digits are ="+count);
  }
}