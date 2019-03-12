package problem.solving;
public class Findmaxmin{
  public static void main(String[]args){
    int[]a={-1,5,9,3,5,-7,2};
    int d=0;
    int max=a[d];
    int min=max;
    while(d<a.length){
      if(max<a[d]){
        max=a[d];
      }else{
        if(min>a[d]){
          min=a[d];
        }
      }
      d++;
    }
    System.out.println("apnar max ="+max);//9
    System.out.println("apnar minimum ="+min);//-7
  }
}