import java.util.*;
class Test{  
 public static void main(String args[]) {    
  int n1=0,n2=1,n3,k;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  k=sc.nextInt();    
  System.out.print(n1+" "+n2);       
  for(int i=2;i<k;i++) {    
   n3=n1+n2;    
   System.out.print(" "+n3);    
   n1=n2;    
   n2=n3;    
  }      
 }                               
}  