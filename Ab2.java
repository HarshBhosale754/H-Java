abstract class Employee {
 abstract void show();
}
class Rahul extends Employee {
 void show() {
  System.out.println("Employee Name:Rahul");
 }
}
class Neha extends Employee {
 void show() {
  System.out.println("Employee Name:Neha");
 }
}
class Test {
 public static void main(String args[]) {
  Rahul obj=new Rahul();
  Neha obj1=new Neha();
  obj.show();
  obj1.show();
 }
}
  