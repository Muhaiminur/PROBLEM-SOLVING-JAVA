package LAB08;
/*Task 5:
Write a java program that reads 10 numbers from the user. Then read another number from the user, and print �yes� if this number exists among the first 10. Print �no� otherwise.
*/
import java.util.Scanner;
public class CSE110Lab8task5a{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("NUMBER TA KOI?");
      a[c]=abir.nextInt();
      c++;
    }
    System.out.println("ENTER YOUR ANOTHER NUMBER");
    int n=abir.nextInt();
    int found=0;
    int d=0;
    while(d<10){
      if(a[d]==n){
        found++;
      }
      d=d+1;
    }
    if(found>0){
      System.out.println("yes");
    }else{
      System.out.println("No");
    }
  }
}