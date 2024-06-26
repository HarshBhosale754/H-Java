import java.util.*;
class Test {
public static void main(String args[]){
 int x=9;
 int y=8;
 y=x+y-(x=y);
 System.out.println("x="+x);
 System.out.println("y="+y);
 }
}