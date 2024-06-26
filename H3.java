import java.util.*;
class Test {
 public static void main(String args[]) {
  TreeSet hset=new TreeSet();
  hset.add(70);
  hset.add(20);
  hset.add(80);
  hset.add(40);
  hset.add(50);
  hset.add(10);
  System.out.println(hset);
  hset.remove();
  System.out.println(hset);
 }
}