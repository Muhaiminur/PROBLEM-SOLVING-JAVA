package LAB12;
/*Problem 3) Odious Number
http://mathworld.wolfram.com/OdiousNumber.html

In odious number is a nonnegative number that has an odd number of 1s in its binary expansion. 
The first few odious numbers are therefore 1, 2, 4, 7, 8, 11, 13, 14, 16, 19, ... (Sloane's A000069). Numbers that are not odious are said to be evil numbers.

Determine if a given number is Odious or Evil number.
*/
import java.util.Scanner;
public class cse111Lab10task3a{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter a number");
    int x=abir.nextInt();
    int y=x;
    int[]a=new int[10];
    int count=0;
    int c=0;
    while(x!=0){
      a[c]=x%2;
      if(a[c]%2!=0){
        count++;
      }
      x=x/2;
      c++;
    }
    if(count%2==0){
      System.out.println(x+" is a Evil number");
    }else{
      System.out.println(x+" is a odious number");
    }
  }
}