class Thread1 extends Thread {
 public void run() {
  Thread t2=new Thread2();
  t2.start();
   System.out.println("Second Thread State"+t2.getState());
 }
}
class Thread2 extends Thread {
 public void run() {
  Thread t3=new Thread3();
  t3.start();
  System.out.println("Third Thread State"+t3.getState());
 }
}
class Thread3 extends Thread {}
class Test {
 public static void main(String args[]) {
  Thread t1=new Thread1();
  t1.start();
  System.out.println("First Thread State"+t1.getState());
 }
}