/*Task 9:
Write a java program that reads 10 numbers from the user. Write the program in such a way so that 
if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
If the user enters 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, then the output should be 10, 30, 50, 70, 90, 20, 40, 60, 80, 100.
If the user enters 2, 5, 6, 9, 12, 13, 14, 15, 16, 17 then the output should be 2, 6, 12, 14, 16, 5, 9, 13, 15, 17.
*/
package LAB08;
import java.util.Scanner;
public class CSE110Lab8task9{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<a.length){
      System.out.print(a[d]+",");
      d=d+2;
    }
    int e=1;
    while(e<a.length){
      System.out.print(a[e]+",");
      e=e+2;
    }
  }
}