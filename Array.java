import java.util.*;
class Test {
 public static void main(String args[]) {
 Vector arr1=new Vector();
 ArrayList arr2=new ArrayList();
 LinkedList arr3=new LinkedList();
 arr1.add(10);
 arr3.add(123);
 arr3.add(12);
 arr1.add("Vikram");
 arr2.add(true);
 System.out.println(arr1);
 arr2.add(12.78);
 System.out.println(arr2);
 System.out.println(arr3);
 }
}