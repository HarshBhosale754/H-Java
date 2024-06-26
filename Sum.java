import java.util.*;
class Test {
 public static void main(String args[]) {
  int arr[]=new int[11];
  int i,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter 10 Element");
  for(i=1;i<=10;i++) {
  arr[i]=sc.nextInt();
  sum=arr[i];
  }
  System.out.println(sum);

 }
}