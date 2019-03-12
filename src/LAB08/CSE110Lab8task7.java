package LAB08;
/*Task 7:
Write a java program that reads 10 numbers from the user. After reading each number, print all the numbers that have been entered so far.
*/
import java.util.Scanner;
public class CSE110Lab8task7{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      a[c]=abir.nextInt();
      System.out.println("You have enterd so far...");
      int d=0;
      while(d<=c){
        System.out.print(a[d]+" ");
        d++;
      }
      c++;
    }
  }
}