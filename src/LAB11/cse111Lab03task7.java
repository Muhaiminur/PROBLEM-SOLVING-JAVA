package LAB11;
/*7. Modify your solution for the question number 4. Take 11 numbers such that any numbers can
exist at maximum four times. That means any number can be entered multiple times but when the
use enters same numbers for 5th time, it should reject and ask for any other number but that
number.
e.g. Imagine the user entered 3,2,5,7,2,3,2,0,9,2,3. If the user tries to enter 2 again, it must not
allow it because 2 is already there, 4 times.*/
import java.util.Scanner;
public class cse111Lab03task7{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<11)
    {
      System.out.println("please");
      int x=abir.nextInt();
      a[x]=a[x]+1;
      int d=0;
      while(d<a.length)
      {
        
        if(a[d]>4)
        {
          System.out.println("enter again");
          x=abir.nextInt();
        }
        d++;
      }
      c++;
    }
  }
}