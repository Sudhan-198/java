import java.util.*;

class Main{
    public static void main(String[] args) {
      int[] arr={15,9,3,16,7};
      int n=arr.length;
      bubble b= new bubble();
      b.bubblesort(arr,n);
      for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
      }
    }
}

class bubble{
  void bubblesort(int[] arr,int n){
    int temp;
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
}

