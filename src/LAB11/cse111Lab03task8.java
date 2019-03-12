package LAB11;
/*8. Modify your solution of number 7. Take 10 numbers within 0 to 9. When you print output, 
 * users will see only the numbers that appeared at least twice and less than 4 times.
e.g. Imagine the user entered 4,3,2,5,2,3,2,0,2,3 then the output is 3, 2.
*/
import java.util.Scanner;
public class cse111Lab03task8{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int c=0;
    while(c<a.length){
      System.out.println("please enter a number between 0 to 9");
      int x=abir.nextInt();
      a[x]=a[x]+1;
      c++;
    }
    int[]b=new int[10];
    int d=0;
    while(d<a.length){
      b[d]=d;
      if(a[d]==2){
        System.out.println(b[d]);
      }else if(a[d]==3){
        System.out.println(b[d]);
      }else{
      }
      d++;
  }
}
}