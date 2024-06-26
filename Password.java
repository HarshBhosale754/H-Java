import java.util.*;
class Test {
 public static void main(String args[]) { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Please Enter Your Password ");
  String password=sc.nextInt(); 
    try {
   if(password.length()>7)
    throw new Exception();
   else
    System.out.println("You are Logged in");
  }
  catch(Exception e) {
   System.out.println("Password Length Should not Exceed 7");
  }
 }
}
