package LAB05;
/*Task 12:
Write a Java program which adds all numbers that are multiples of either 7 or 9 but not both, up to 600.
ther 7 or 9 up to 600. Ensure that numbers like 63 are added only once in the sum.
*/
import java.util.Scanner;
public class Lab05task12setB{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    int num=0;
    int sum=0;
    while(c<600){
      if(num%7==0){
        sum=sum+num;
      }else{
        if(num%9==0){
          sum=sum+num;
        }
      }
      num=num+1;
      c=c+1;
    }
    System.out.println(sum);
  }
}