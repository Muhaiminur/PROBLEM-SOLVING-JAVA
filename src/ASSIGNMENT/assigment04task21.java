package ASSIGNMENT;
/*Task21) Assume that we have the following array.
int[] a = new int[] {10, 30, 20, 50, 40};
Find the largest number and print it along with its location.
Output:
Largest number is 50
Largest number was found at location 3*/
public class assigment04task21
{
  public static void main(String[]args)
  {
    int[] marks = new int[] {10, 30, 20, 50, 40};
    int max=marks[0];
    int maxloc=0;
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
    System.out.println("Largest number is "+marks[maxloc]);
    System.out.println("Largest number was found at location "+maxloc);
  }
}