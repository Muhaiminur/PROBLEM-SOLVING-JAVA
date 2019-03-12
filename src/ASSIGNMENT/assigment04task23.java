package ASSIGNMENT;
/*Task23) Assume that we have the following array.
int[] a = new int[] {50, 30, 20, 10, 40};
Modify Task22.

Find largest number among all numbers between 2nd and 
last number (30, 20, 10, 40).
Swap the 2nd number with this largest number. 
Thus you just put 2nd largest in 2nd position.*/
public class assigment04task23
{
  public static void main(String[]args)
  {
    int[] marks = new int[] {50, 30, 20, 10, 40};
    int max=marks[1];
    int maxloc=1;
    int backup=0;
    int c=1;
    while(c<marks.length)
    {
      if(max<marks[c])
      {
        max=marks[c];
        maxloc=c;
      }
      
      c++;
    }
    backup=marks[1];
    marks[1]=marks[maxloc];
    marks[maxloc]=backup;
    int d=0;
    while(d<marks.length)
    {
      System.out.print(marks[d]+",");
      d++;
    }
    System.out.println();
  }
}