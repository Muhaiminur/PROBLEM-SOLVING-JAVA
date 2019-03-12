/*9. Modify your solution of number 3. Ask user if the user wants to sort 
a) only numbers at odd positions
Or, b) only numbers at even positions
Or, c) all numbers (means numbers at all positions)
And then sort only the numbers that the user wanted to be sorted as if all other numbers do not exist.
When printing, print all numbers.
*/
import java.util.Scanner;
public class cse111Lab03task9{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int []a=new int[10];
    int c=0;
    while(c<a.length){
      a[c]=abir.nextInt();
      c++;
    }
    System.out.println("Enter betwen the 3 option below");
    System.out.println("a) only numbers at odd positions");
    System.out.println("b) only numbers at even positions");
    System.out.println("c) all numbers (means numbers at all positions)");
    String x=abir.nextLine();
    String x1="a";
    String x2="b";
    String x3="c";
    if(x.equals(x1)){
      int[]b=new int[5];
      int count=0;
      int d=0;
      while(d<a.length){
        if(d%2==0){
          b[count]=a[d];
          count++;
          }
        d++;
        }
      int e=0;
      while(e<b.length){
        int max=e;
        int maxloc=e;
        int f=e;
        while(f<b.length){
          if(b[f]>max){
            max=b[f];
            maxloc=f;
            }
          f++;
          }
        int backup=b[e];
        b[e]=b[maxloc];
        b[maxloc]=backup;
        e++;
        }
      int count1=0;
      int f=0;
      while(f<a.length){
        if(f%2==0){
          a[f]=b[count1];
          count1++;
        }
        f++;
      }
      System.out.println("apnar odd sort");
      int g=0;
      while(g<a.length){
        System.out.print(a[g]+" ");
        g++;
      }
    }
    if(x.equals(x2)){
      int[]b=new int[5];
      int count=0;
      int d=0;
      while(d<a.length){
        if(d%2!=0){
          b[count]=a[d];
          count++;
          }
        d++;
        }
      int e=0;
      while(e<b.length){
        int max=e;
        int maxloc=e;
        int f=e;
        while(f<b.length){
          if(b[f]>max){
            max=b[f];
            maxloc=f;
            }
          f++;
          }
        int backup=b[e];
        b[e]=b[maxloc];
        b[maxloc]=backup;
        e++;
        }
      int count1=0;
      int f=0;
      while(f<a.length){
        if(f%2!=0){
          a[f]=b[count1];
          count1++;
        }
        f++;
      }
      System.out.println("apnar even sort");
      int g=0;
      while(g<a.length){
        System.out.print(a[g]+" ");
        g++;
      }
    }
    if(x.equals(x3)){
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
      System.out.println("apnar all sort");
      int f=0;
      while(f<a.length){
        System.out.print(a[f]+" ");
        f++;
        }
    }
    System.out.println();
  }
}