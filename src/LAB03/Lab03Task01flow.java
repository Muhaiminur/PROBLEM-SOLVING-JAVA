package LAB03;
/*Task 1:
Draw the flowchart of a program that reads an integer, and if the number is even and greater than 10, 
prints �An even number greater than 10�. If the number is even but lesser than 10,
print �An even number not greater than 10�. If the number is greater than 10 but odd, print �An odd number greater than 10�. 
If the number is odd and also less than 10, print �An odd number less than 10�.
*/
import java.util.Scanner;
public class Lab03Task01flow{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("please enter a number");
    int x=abir.nextInt();
    if(x%2==0){
      if(x>10){
       System.out.println("An even number greater than 10");
      }else{
        System.out.println("An even number not greater than 10");
      }
    }else{
      if(x>10){
       System.out.println("An odd number greater than 10");
      }else{
        System.out.println("An odd number not greater than 10");
      }
    }
  }
}