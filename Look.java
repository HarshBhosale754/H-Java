import java.util.*;
 class Pattern {
  void generatePattern(int z) {
   if(z==1)
    str="1";
   if(z==2)
    str="11";
   String str="11";
   char[]z=str.to.CharArray();
   int count=1;
   for(int i=1;i<z.length;i++) {       
   if(arr[i]=arr[i-1])
    count++;
   }
   for(int j=i-1;j<z.length;j--) {
   if(arr[i]1=arr[i-1]) 
    count=1;
    break;
   }
  }
  System.out.println(count+arr[i-1]+count+arr[i]);
 }
}    
 class Test {
  public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter No of term in series:");
   int n=sc.nextInt();
   Pattern obj=new Pattern();
   obj.generatePattern(n);
  }
 }
  
   