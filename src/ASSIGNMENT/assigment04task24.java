package ASSIGNMENT;
/*Task24) Combine ideas from Task 22 and 23. 
Ask the user for a number n, and then find nth highest number 

Hint: 
Repeat the idea (from task 22,23) n times. 
Then you will find nth highest number in nth position in array.
Read  https://groups.google.com/d/msg/bucse110summer2013/nntG5cn4h30/FCPv0EhSwW0J */
import java.util.Scanner;
public class assigment04task24
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER a number");
    int n=abir.nextInt();
    int[] marks = new int[] {50, 30, 20, 10, 40};
    int d=0;
    while(d<marks.length)
      {
    int max=marks[d];
    int maxloc=d;
    int backup=0;
    int c=d+1;
    while(c<marks.length)
    {
      if(max<marks[c])
      {
        max=marks[c];
        maxloc=c;
      }
      c++;
    }
    backup=marks[d];
    marks[d]=marks[maxloc];
    marks[maxloc]=backup;
    d++;
    }
    System.out.print(marks[n]+",");
  }
}