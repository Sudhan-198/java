import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      String c = "";
      int l1=a.length();
      int l2=b.length();
      int i=0;
      int j=0;
      for(int k=0;k<Math.max(l1,l2);k++){
        if(i<l1 && j<l2){
          c+=a.charAt(i);
          c+=b.charAt(j);
          i++;
          j++;
        }
        else if(i<l1){
          c+=a.charAt(i);
          i++;
        }
        else if(j<l2){
          c+=b.charAt(j);
          j++;
        }
      }
      System.out.println(c);
  }
}