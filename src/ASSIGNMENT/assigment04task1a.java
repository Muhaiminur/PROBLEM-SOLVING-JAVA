package ASSIGNMENT;
/*Task1) For 5 numbers, Draw flowcharts and write java codes 
separately for following finding Maximum, Minimum, and 
Average. That is 3 flowcharts and 3 java codes.*/
//Minimum
import java.util.Scanner;
public class assigment04task1a
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
    int min=a[d];
    //int minloc=d;(for location print)
    while(d<a.length)
    {
      if(min>a[d])
      {
        min=a[d];
        //minloc=d;
        //int minloc=d;(not valid why)
      }
      d++;
    }
    System.out.println(min);
    //System.out.println(a[minloc]);(noresultwhy)
  }
}