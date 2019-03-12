package LAB11;
/*10. Modify your solution of number 8. Take as many numbers within 0 to 9 as needed so that you can print 2 such number 
 * that appeared at least twice and less than 4 times.
e.g. Imagine the user entered 4,3,2,5,2,3,2,0,2,3 then the output is 3, 2.
*/
import java.util.Scanner;
public class cse111Lab03task10{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a=new int[10];
    int count=0;
    int c=0;
    while(c>=0){
      System.out.println("please enter a number between 0 to 9");
      int x=abir.nextInt();
      a[x]=a[x]+1;
      int d=0;
      while(d<a.length){
        if(a[d]==2||a[d]==3){
          count++;
          break;
        }
        d++;
      }
      if(count==2)
        break;
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