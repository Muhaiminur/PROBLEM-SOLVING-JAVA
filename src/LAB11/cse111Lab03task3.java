package LAB11;
/*3. Write a Java program that would input ten numbers form the user and print the ten numbers sorted in descending order.*/
import java.util.Scanner;
public class cse111Lab03task3{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int []a=new int[10];
    int c=0;
    while(c<a.length){
      a[c]=abir.nextInt();
      c++;
    }
    int d=0;
    while(d<a.length){
      int max=d;
      int maxloc=d;
      int e=d;
      while(e<a.length){
        if(a[e]>max){
          max=a[e];
          maxloc=e;
        }
        e++;
      }
      int backup=a[d];
      a[d]=a[maxloc];
      a[maxloc]=backup;
      d++;
    }
    int f=0;
    while(f<a.length){
      System.out.println(a[f]);
      f++;
    }
  }
}