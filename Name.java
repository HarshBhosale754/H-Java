class Student{
 int rollno;
 String name;
 Student(int rollno,String name){
  this.rollno=rollno;
  this.name=name;
 }
}
class Test{
 public static void main(String args[]){
  Student obj1=new Student(101,"Ravi");
  Student obj2=new Student(102,"Pawan");
  Student obj3=new Student(103,"Rohan");
  Student obj4=new Student(104,"Vikram");
  Student obj5=new Student(105,"Vikrant");
  Student obj6=new Student(106,"Harsh");
  System.out.println("Roll No:"+obj1.rollno);
  System.out.println("Name is:"+obj1.name);
  System.out.println("Roll No:"+obj2.rollno);
  System.out.println("Name is:"+obj2.name);
  System.out.println("Roll No:"+obj3.rollno);
  System.out.println("Name is:"+obj3.name);
  System.out.println("Roll No:"+obj4.rollno);
  System.out.println("Name is:"+obj4.name);
  System.out.println("Roll No:"+obj5.rollno);
  System.out.println("Name is:"+obj5.name);
  System.out.println("Roll No:"+obj6.rollno);
  System.out.println("Name is:"+obj6.name);
 }
}
