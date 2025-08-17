import java.util.*;

public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<Integer>();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        int x = sc.nextInt();
        a.add(x);
      }
      for(int i=0;i<n;i++){
        Boolean bef = i==0 || a.get(i-1)==0;
        Boolean aft = i==n-1 || a.get(i+1)==0;
        if(bef && aft && a.get(i)==0){
          a.set(i,1);
        }
      }
      for(int j=0;j<n;j++){
        System.out.printf(a.get(j)+" ");
      }
  }
}