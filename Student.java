class Student{
 void display(){
  System.out.println("This is ordinary method");
 }
 Student(){
  System.out.println("Constructor Method Called...");
 }
}
class Test{
 public static void main(String args[]){
  Student obj=new Student();
  obj.display();
 }
}