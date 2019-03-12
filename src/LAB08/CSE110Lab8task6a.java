package LAB08;
/*Task 6:
Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. Then print the number of times each number has been entered by the user.
*/
import java.util.Scanner;
public class CSE110Lab8task6a{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<15){
      System.out.println("ENTER NUMBER ");
      int n=abir.nextInt();
      a[n]=a[n]+1;
      c++;
    }
    int d=0;
    while(d<10){
      System.out.println(d+"ache"+a[d]+"bar");
      d++;
    }
  }
}