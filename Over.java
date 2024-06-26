class Addition {
 void sum(int x,int y) {
  int sum=x+y;
  System.out.println("Sum:"+sum);
 }
 void sum(int x,int y,int z) {
  int sum=x+y+z;
  System.out.println("Sum:"+sum);
 }
 void sum(int x,double y) {
  double sum=x+y;
  System.out.println("Sum:"+sum);
 }
 void sum(double x,int y) {
  double sum=x+y;
  System.out.println("Sum:"+sum);
 }
}
class Test {
 public static void main(String args[]) {
  Addition obj=new Addition();
  obj.sum(2,3);
  obj.sum(2,3,5);
  obj.sum(2,3.6);
  obj.sum(2.4,3);  
 }
}