package LAB08;
/*Task 4:
Write a java program that reads 20 numbers from the user, and then prints only the even numbers in reverse order.
*/
import java.util.Scanner;
public class CSE110Lab8task4{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=9;
    while(d>=0){
      if(a[d]%2==0){
      System.out.println(a[d]);
      }
      d--;
    }
  }
}