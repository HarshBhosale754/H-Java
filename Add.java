import java.util.*;
class Test{
 public static void main(String []args){
 int num,i;
 flag=0;
 Scanner sc=new Scanner(System.in);
 num=sc.nextInt();
 for(i=2;i<num/2;i++){
  if(num%i==0){
System.out.println("Not a prime number");
flag=1;
break;
 }
}
if(flag==0)
System.out.println("rime number");
 }
}