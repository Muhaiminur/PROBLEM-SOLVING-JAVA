package ASSIGNMENT;
/*Task1) For 5 numbers, Draw flowcharts and write java codes 
separately for following finding Maximum, Minimum, and 
Average. That is 3 flowcharts and 3 java codes.*/
//finding Maximum
import java.util.Scanner;
public class assigment04task1b
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
    while(d<a.length)
    {
      if(max<a[d])
      {
        max=a[d];
      }
      d++;
    }
    System.out.println(max);
  }
}