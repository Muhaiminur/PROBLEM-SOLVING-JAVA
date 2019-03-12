package LAB05;
/*Task 9:
Write a java program that prints the following sequences of values using loops:
d) 2, -4, 6, -8, 10, -12
*/
import java.util.Scanner;
public class Lab05task9d{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=2;
    while(c<6){
      if(c%2==0){
        System.out.println(-num);
      }else{
        System.out.println(num);
      }
      c++;
      num=num+2;
    }
  }
}