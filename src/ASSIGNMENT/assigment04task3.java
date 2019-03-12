package ASSIGNMENT;
/*Task3 ) combine flowcharts and javacodes of Task2 with finding 
average into 1 flowchart and 1 javacode*/
//finding maximum and minimum,average
import java.util.Scanner;
public class assigment04task3
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
    int sum=0;
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
      sum=sum+a[d];
      d++;
    }
    System.out.println("apnar max ="+max);
    System.out.println("apnar minimum ="+min);
    System.out.println("apnar average ="+sum/a.length);
  }
}