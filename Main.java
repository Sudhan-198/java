import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int[] candy = new int[n];
      ArrayList<Boolean> sol = new ArrayList<>();
      for(int i=0;i<n;i++){
        candy[i] = sc.nextInt();
      }
      System.out.println(Arrays.toString(candy));
      int ex = sc.nextInt();
      int m = max(candy);
      for(int i=0;i<n;i++){
        if(m<=candy[i]+ex){
          sol.add(true);
        }
        else{
          sol.add(false);
        }
      }
      System.out.println(sol);
  }
  static int max(int[] a){
    int m=0;
    for(int k=0;k<a.length;k++){
      if(a[k]>m){
        m=a[k];
      }
    }
    return m;
  }
}