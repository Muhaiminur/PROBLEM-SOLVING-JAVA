package ASSIGNMENT;
/*Task10) Draw flowchart and Write a Java program which takes a 
number and prints the digits from left to right.
Example: if user gives 32768, then print 3, 2, 7, 6, 8
Hint: count how many digits
calculate 10 to the power that (number of digits) minus 1. 
Say, 32768 has 5 digits, 
so you calculate 10 to the power 4 which is 10,000. 
Then divide 32,768 by 10,000 and thus you get 3.
take remainder of 32,768 by 10,000 and thus you get 2,768
Then divide 10,000 by 10 to get 1,000
Then divide 2,768 by 1,000 and thus you get 2.
take remainder of 2,768 by 1,000 and thus you get 768
keep going on until there is no more digits left (zero!).
In short:
Loop 1: First count digits, say 5 in this case for 32,768
Loop 2: Then calculate 10 to the power 4 (5-1), that is 10,000. 
Loop 3: Then repeat following three steps

32,768 / 10,000 = 3
32,768 % 10,000 = 2,768
10,000/10 = 1,000

2,768 / 1,000 = 2
2,768 % 1,000 = 768
1,000/10 = 100

768 / 100 = 7
768 % 100 = 68
100/10 = 10

68 / 10 = 6
68 % 10 = 8
10/10 = 1

8 / 1 = 8
8 % 1 = 0
1/10 = 0*/
import java.util.Scanner;
public class assigment04task10
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int x1=x;
    int count=0;
    while(x>0)
    {
      x=x/10;
      count=count+1;
    }
    System.out.println("your digits are ="+count);
    int product=1;
    int d=0;
    while(d<count-1)
    {
      product=product*10;
      d++;
    }
    System.out.println(product);
    int a=0;
    while(x1>0)
    {
      a=x1/product;
      System.out.print(a+" ");
      x1=x1%product;
      product=product/10;
    }
    System.out.println();
  }
}