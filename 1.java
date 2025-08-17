import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String res = "";
      for(String i : s.split(" ")){
        res = i+(res.isEmpty() ? "" : " ")+res;
      }
      System.out.println(res);
  }
}