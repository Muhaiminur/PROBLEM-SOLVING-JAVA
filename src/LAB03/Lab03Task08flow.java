package LAB03;
/*Task 8:
Draw the flowchart of a program that reads a student�s mark for a single subject, and prints out the corresponding grade for that mark. The mark ranges and corresponding grades are shown in the table below.

Marks Grade
90 and above A
80-89 B
70-79 C
60-69 D
50-59 E
Below 50 F
*/
import java.util.Scanner;
public class Lab03Task08flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("give your marks");
    int num=abir.nextInt();
    if(num>=90){
      System.out.println("A");
    }else{
      if(num>=80){
        System.out.println("B");
      }else{
        if(num>=70){
          System.out.println("C");
        }else{
          if(num>=60){
            System.out.println("D");
          }else{
            if(num>=50){
              System.out.println("E");
            }else{
              System.out.println("F"+"="+" mane better time!!:p");
            }
          }
        }
      }
    }
  }
}