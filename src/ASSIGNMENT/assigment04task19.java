package ASSIGNMENT;
/*Task19) Assume that we have the following array contains 
marks of 5 students.
int[] marks = new int[] {10, 30, 20, 50, 40};
Find the max, min, average mark.
Output:
Highest mark is 50
Lowest mark is 10
Average mark is 30*/
public class assigment04task19
{
  public static void main(String[]args)
  {
    int[] marks = new int[] {10, 30, 20, 50, 40};
    int max=marks[0];
    int maxloc=0;
    int min=max;
    int minloc=0;
    int sum=0;
    int c=0;
    while(c<marks.length)
    {
      if(max<marks[c])
      {
        max=marks[c];
        maxloc=c;
      }
      else
      {
        if(min>marks[c])
        {
          min=marks[c];
          minloc=c;
        }
      }
      sum=sum+marks[c];
      c++;
    }
    System.out.println("highest mark is "+marks[maxloc]);
    System.out.println("lowest mark is "+marks[minloc]);
    System.out.println("average mark is "+sum/marks.length);
  }
}