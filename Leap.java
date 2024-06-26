import java.util.*;
class Test {
 public static void main(String args[]) {
  int year=2004;
  String x,y,z;
  Scanner sc=new Scanner(System.in);
  x=(year % 400 == 0)?"is a leap year":"is not a leap year";
  y=(year % 4 == 0)?"is a leap year":"is not a leap year";
  z=(year % 100 == 0)? x:y;
  System.out.println(z);
 }
}