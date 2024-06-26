import java.util.*;
class Test {
 public static void main(String args[]) {
  int x,y;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1st no:");
  x=sc.nextInt();
  System.out.println("Enter 2nd no:");
  y=sc.nextInt();
  try {
   System.out.println("x/y="+(x/y));
  }
  catch(ArithmeticException e) {
   System.out.println("Second No cannot be Zero");
  }
  finally {
   System.out.println("Exception Successfully Handled");
  } 
 }
}
 