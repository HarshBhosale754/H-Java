import java.lang.*;
import java.util.*;
class Test {
 public static void main(String args[]) {
  int a,b; 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1st No");
  a=sc.nextInt(); 
  System.out.println("Enter 2nd No");
  b=sc.nextInt();
  try {
   if(a==0|b==0)
    throw new Exception();
   else
    System.out.println("Sum: "+(a+b));
  }
  catch(Exception e) {
   System.out.println("Plz enter non zero value..");
  }
  finally {
   System.out.println("Exception Handled..");
  }
 }
}
