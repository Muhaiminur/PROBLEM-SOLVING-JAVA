package LAB11;
/*6. Write a Java program that will calculate the value of y if the expression of y is as follows (n is the input):
   y = 1^2 - 2^2 + 3^2 - 4^2 + 5^2 ............ + n2
*/
import java.util.Scanner;
public class cse111Lab03task6{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("enter your num?");
    int x=abir.nextInt();
    double v1=0;
    double  v2=0;
    double sum1=0;
    double sum2=0;
    int c=1;
    while(c<=x){
      if(c%2!=0){
        v1=Math.pow(c,2);
        sum1=sum1+v1;
      }
      else{
        v2=Math.pow(c,2);
        sum2=sum2+v2;
      }
      c++;
    }
    double v=sum1-sum2;
    System.out.println(v);
  }
}