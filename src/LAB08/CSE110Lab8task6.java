package LAB08;
/*Task 6:
Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. Then print the number of times each number has been entered by the user.
*/
import java.util.Scanner;
public class CSE110Lab8task6{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[15];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<10){
      int e=0;
      int x=0;
      while(e<a.length){
        if(a[e]==d){
          x=x+1;
        }
        e++;
      }
      System.out.println(d+"ACHE"+x+"bar");
      d++;
    }
  }
}