package ASSIGNMENT;
/*Task22) Assume that we have the following array.
int[] a = new int[] {10, 30, 20, 50, 40};
Modify Task21. Swap the first number with largest number.
Your output should be 50, 30, 20, 10, 40

Hint:
Find largestNumber and largestNumberLocation.
backup = a[0];
a[0]=largestNumber;
a[largestNumberLocation]=backup;*/
public class assigment04task22
{
  public static void main(String[]args)
  {
    int[] marks = new int[] {10, 30, 20, 50, 40};
    int max=marks[0];
    int maxloc=0;
    int backup=0;
    int c=0;
    while(c<marks.length)
    {
      if(max<marks[c])
      {
        max=marks[c];
        maxloc=c;
      }
      
      c++;
    }
    backup=marks[0];
    marks[0]=marks[maxloc];
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