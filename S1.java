import java.util.*;
class Test {
 public static void main(String args[]) {
  Stack stk=new Stack();
  stk.push(10);
  stk.push(20);
  stk.push(30);
  stk.push(40);
  stk.push(50);
  System.out.println(stk);
  stk.pop();
  System.out.println(stk);
  stk.pop();
  System.out.println(stk);
  stk.pop();
  System.out.println(stk);
  stk.pop();
  System.out.println(stk);
  stk.pop();
  System.out.println(stk);
 }
}