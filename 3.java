import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      if(!(a+b).equals(b+a)){
        System.out.println("---");
      }
      else{
        int l1 = a.length();
        int l2 = b.length();
        int l = gcd(l1,l2);
        System.out.println(a.substring(0,l));
      }
  }
  static int gcd(int x,int y){
    return y==0 ? x : gcd(y,x%y);
  }
}