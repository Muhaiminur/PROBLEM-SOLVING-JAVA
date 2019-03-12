package LAB12;
import java.io.*;
import java.util.*;
public class cse111Lab10task5main{
  void takeInput() throws NumberFormatException,IOException{
    String line = "";
    int max = 0;
    StringTokenizer tokenizer = null;
    int i;
    int j;
    int f=0;
    BufferedReader abir=new BufferedReader(new InputStreamReader(System.in));
    while(((line =abir.readLine())!= null)){
      f=0;
      tokenizer = new StringTokenizer(line);
      i = Integer.parseInt(tokenizer.nextToken());
      j = Integer.parseInt(tokenizer.nextToken());
      int temp;
      if(i>j){
        f=1;
        temp=i;
        i = j;
        j = temp;
      }
      max=process(i, j);
      if(f==0)
        System.out.println(i + " " + j + " " + max);
      else
        System.out.println(j + " " + i + " " + max);
      }// end while
    }// end takeInput
  int process(int i,int j){
    int len, max = 0;
    for(int k=i;k<=j;k++){len=find(k);if(len>max)
      max = len;
    }
    return max;
  }// end process
  int find(int k){
    int len=0;
    while(k!=1){
      len++;
      if(k%2==1)
        k=3*k+1;
      else
        k=k>>1;
    }// end while
    return len+1;
  }// end of find
  void error(String msg){
    System.out.println(msg);
  }
}