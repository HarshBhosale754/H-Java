import java.util.*;
enum Level {
  LOW,
  HIGH,
  MEDIUM;
}
class Test {
 public static void main(String args[]) {
  Level obj=Level.LOW;
  switch(obj) {
   case MEDIUM: 
    System.out.println("This is Medium input");
    break;
   case HIGH: 
    System.out.println("This is High input");
    break;
   case LOW: 
    System.out.println("This is Low input");
    break;
  }
 }
}