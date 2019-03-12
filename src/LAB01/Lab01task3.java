package LAB01;
/*Draw the flowchart of a program that reads the radius of a circle and prints its circumference and area.*/
import java.util.Scanner;
public class Lab01task3{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("ENTER YOUR NUMBER");
    int num=abir.nextInt();
    double cir=2*Math.PI*num;
    double area=Math.PI*num*num;
    System.out.println("apnar circumference ="+cir);
    System.out.println("apnar area ="+area);
  }
}