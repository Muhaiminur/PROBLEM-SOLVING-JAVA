package ASSIGNMENT;
/*Task20) Assume that we have the following array contains marks.
int[] marks = new int[] {10, 30, 20, 50, 40};
Find how many students are better than average.
Output:
2 students are better than average.
They received following marks
50
40

Hint: First calculate average marks. Then loop through the marks
array and count how many marks are greater than average.
Print this count. Then again, loop through the marks and count
how many elements were greater than average marks.*/
public class assigment04task20
{
  public static void main(String[]args)
  {
    int[] marks = new int[] {10, 30, 20, 50, 40};
    int sum=0;
    int c=0;
    while(c<marks.length)
    {
      sum=sum+marks[c];
      c++;
    }
    int ave=sum/marks.length;
    System.out.println("average mark is "+ave);
    int count=0;
    int d=0;
    while(d<marks.length)
    {
      if(ave<marks[d])
      {
        //System.out.println(marks[d]);
        count=count+1;
      }
      d++;
    }
    System.out.println(count+" students are better than average.");
    int e=0;
    while(e<marks.length)
    {
      if(ave<marks[e])
      {
        System.out.println(marks[e]);
      }
      e++;
    }
  }
}