class Student {
 private void display() {
  System.out.println("This is Encapsulated Method...");
 }
 void getDisplay() {
  display();
 }
}
class Test {
 public static void main(String args[]) {
  Student obj=new Student();
  obj.getDisplay();
 }
}




