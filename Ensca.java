class Student {
 private int rollno=307;
 String name="Harsh";
 void getRollno() {
  System.out.println(this.rollno);
 }
 void setRollno() {
  this.rollno=333;
 }
}
class Test {
 public static void main(String args[]) {
  Student obj=new Student();
  obj.getRollno();
  obj.setRollno();
  obj.getRollno();
 }
}
  

 

  