import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Enter the array size:");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int[] a = new int[x];
      System.out.println("Enter the array elements:");
      for (int i=0;i<x ;i++ ){
        a[i]=sc.nextInt();
      }
      int i=1;
      while(i<x-1){
        if(a[i]>a[i-1] || a[i]>a[i+1]){
          if(a[i]>a[i-1] & a[i]>a[i+1]){
            if(a[i-1]>a[i+1]){
              int temp = a[i+1];
              a[i+1] = a[i];
              a[i] = temp;
            }
            else{
              int temp = a[i-1];
              a[i-1] = a[i];
              a[i] = temp;
            }
          }
          else if(a[i]>a[i-1]){
            int temp = a[i-1];
            a[i-1] = a[i];
            a[i] = temp;
          }
          else{
            int temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
          }
        }
        else{
          i+=2;
        }
      }
      for (int j=0;j<x ;j++ ){
        System.out.println(a[j]);
      }
    }
}