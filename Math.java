import java.util.*;
class Addition {
 int sum(int x,int y) {
  int z=x+y;
  return z;
 }
}

class Substraction {
 int sub(int x,int y) {
  int z=x-y;
  return z;
 }
}
 
class Multiplication {
 int mult(int x,int y) {
 int z=x*y;
 return z;
 }
}

class Division {
 int div(int x,int y) {
 int z=x/y;
 return z;
 }as
}

class Test {
 public static void main(String []args) {
  int x,y,z;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter First Number:");
  x=sc.nextInt();
  System.out.println("Enter Second Number:");
  y=sc.nextInt();
  Addition obj=new Addition();
  int r=obj.sum(x,y);
  System.out.println("Sum="+r);

  Substraction obj1=new Substraction();
  int r1=obj1.sub(x,y);
  System.out.println("Sub="+r1);

  Multiplication obj2=new Multiplication();
  int r2=obj2.mult(x,y);
  System.out.println("Mult="+r2);

  Division obj3=new Division();
  int r3=obj3.div(x,y);
  System.out.println("Div="+r3); 
 }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     