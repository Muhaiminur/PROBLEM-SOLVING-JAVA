package LAB08;
/*Task 8:
Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicates. This means that if a number has been entered already, the program will not accept it as input again and instead ask the user to enter a different number. 
*/
import java.util.Scanner;
public class CSE110Lab8task8{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      int n=abir.nextInt();
      int d=0;
      while(d<a.length){
        if(n==a[d]){
          System.out.println("give another number?");
          n=abir.nextInt();
        }
      d++;
      }
      c++;
      a[c]=n;
    }
  }
}