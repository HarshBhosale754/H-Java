class Animal {
 void show() {
  System.out.println("I am an Animal");
 }
}
 
class Tiger extends Animal {
 void show() {
  System.out.println("I am an Tiger");
 }
}

class Elephant extends Tiger {
 void show() {
  System.out.println("I am an Elephant");
 }
}

class Test { 
 public static void main(String args[]) {
  Tiger obj=new Tiger();
  obj.show();
   Elephant obj1=new Elephant();
   obj1.show();
 }
}
