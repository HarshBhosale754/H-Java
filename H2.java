import java.util.*;
class Test {
 public static void main(String args[]) {
  LinkedHashSet hset=new LinkedHashSet();
  hset.add(10);
  hset.add(20);
  hset.add(30);
  hset.add(40);
  hset.add(50);
  hset.add(20);
  System.out.println(hset);
 }
}