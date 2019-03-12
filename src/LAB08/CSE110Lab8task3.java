package LAB08;
/*Task 3:
Write a java program that reads 10 numbers from the user, and then prints them in the reverse order.
*/
import java.util.Scanner;
public class CSE110Lab8task3{
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
      System.out.println(a[d]);
      d--;
    }
  }
}