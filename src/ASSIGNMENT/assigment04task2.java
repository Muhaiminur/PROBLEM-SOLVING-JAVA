package ASSIGNMENT;
/*Task2 ) combine flowcharts and javacodes of finding maximum and 
minimum from Task1 into 1 flowchart and 1 javacode. Hint: 
write same steps from both flowchart only once. If any line 
or any condition (along with yes/no part) is different, then 
write the different parts one after another.*/
//finding maximum and minimum
import java.util.Scanner;
public class assigment04task2
{
  public static void main(String[]args)
  {
    Scanner abir=new Scanner(System.in);
    int[]a=new int[5];
    int c=0;
    while(c<a.length)
    {
      System.out.println("number tavai");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    int max=a[d];
    int min=max;
    while(d<a.length)
    {
      if(max<a[d])
      {
        max=a[d];
      }
      else
      {
        if(min>a[d])
        {
          min=a[d];
        }
      }
      d++;
    }
    System.out.println("apnar max ="+max);
    System.out.println("apnar minimum ="+min);
  }
}