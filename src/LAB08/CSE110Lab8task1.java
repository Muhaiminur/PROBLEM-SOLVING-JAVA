package LAB08;
/*Task 1:

(a) Change the following System.out.println() to a System.out.printf() method so that the output is 5.984807753012208

double z;
z = 5+ Math.sin(80*Math.PI/180);
System.out.println(z);
*/
import java.util.Scanner;
public class CSE110Lab8task1{
  public static void main(String[]arg){
    Scanner abir=new Scanner(System.in);
    double z;
    z = 5+ Math.sin(80*Math.PI/180);
    System.out.println(z);
  }
}