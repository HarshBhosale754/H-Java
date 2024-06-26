import java.util.*;
class Test {
 public static void main(String args[]) {
  int arr[]={1,2,3,4,5};
  int el;
  Scanner sc=new Scanner(System.in);
  int el=sc.nextInt();
  for(int i=0;i<5;i++) {
   arr[i]=sc.nextInt();
  }
  for(int i=0;i<5;i++) {
   if(el==arr[i]) {
    System.out.println("Position="+(i+1));
    break;
   }
   else {   
    System.out.println("Element Not found");
   }
  }
 }
}