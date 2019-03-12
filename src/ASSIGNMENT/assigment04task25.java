package ASSIGNMENT;
/*Task 25) Modify Task 24 to sort / arrange all numbers in the array.
Your output should be 50, 40, 30, 20, 10

Hint: 
Read  https://groups.google.com/d/msg/bucse110summer2013/nntG5cn4h30/FCPv0EhSwW0J */
import java.util.Scanner;
public class assigment04task25
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    int[] marks = new int[] {10, 30, 20, 50, 40};
    int d=0;
    while(d<marks.length-1)
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
    
    int e=0;
    while(e<marks.length)
    {
      System.out.print(marks[e]+",");
      e++;
    }
    System.out.println();
  }
}