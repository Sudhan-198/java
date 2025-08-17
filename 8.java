import java.util.*;

class company{
  public static void main(String[] args){
    System.out.println("Enter the salary of employee:");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println("Enter the salary of manager:");
    int y = sc.nextInt();
    System.out.println("Enter perfomance mark for employee:");
    int z = sc.nextInt();
  }
}

class salary extends company{
  void emp(int a){
    a=x;
    System.out.println("Salary of employee:"+a);
  }
  void man(int b){
    b=y;
    System.out.println("Salary of manager:"+b);
  }
}

class inc extends salary{
  void emp(int a,int c){
    a=x;
    c=z;
    a = a + ((a/100)*c);
    System.out.println("Salary of employee after increament:"+a);
  }
  void man(int b){
    b=y;
    b = b+(b/10);
    System.out.println("Salary of manager after bonus:"+b);
  }
}