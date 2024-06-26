import java.util.*;
class Test {
 public static void main(String args[]) {
  int arr[]={4,7,2,4,2,1,4,5,7};
  int n=arr.length;
  Scanner sc=new Scanner(System.in);
  int el=sc.nextInt();
  int k=0;
  for(int i=0;i<n;i++) {
   if(arr[i]==el)
    k++;
   }
   System.out.println("Occurenc" +k);
  }
 }
