package ASSIGNMENT;
/*Task 26) Find median among some numbers. 
Ask user how many numbers and input those numbers.

Definition of Median:
For example, if a < b < c, then the median of the list {a, b, c} is b, 
and, if a < b < c < d, then the median
 of the list {a, b, c, d} is the mean of b and c; 
i.e., it is (b + c)/2.

Hint:
Sort numbers
if there are odd number of numbers, say 9, then 
the median is the middle number, at 5th position

if there are even number of numbers, say 10, then 
the median is average of two middle numbers, (5th+6th)/2

Sample Input 1:
5
10 50 40 20 30
Sample Output 1:
30
Sample Input 2:
6
10 50 40 20 30 60
Sample Output 2:
35*/
import java.util.Scanner;
public class assigment04task26
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER a number");
    int n=abir.nextInt();
    int[]a=new int[n];
    int c=0;
    while(c<n)
    {
      System.out.println("enter a number please");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<a.length-1)
    {
    int min=a[d];
    int minloc=d;
    int backup=0;
    int e=d+1;
    while(e<a.length)
    {
      if(min>a[e])
      {
        min=a[e];
        minloc=e;
      }
      e++;
    }
    backup=a[d];
    a[d]=a[minloc];
    a[minloc]=backup;
    d++;
    }
    int mid=0;
    int mid1=0;
    if(n%2==0)
    {
      mid=n/2;
      mid1=(n/2)+1;
      System.out.println((a[mid-1]+a[mid1-1])/2);
    }
    else
    {
      mid=(n+1)/2;
      System.out.println(a[mid-1]);
    }
  }
}