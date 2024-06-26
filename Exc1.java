class Test { 
 public static void main(String args[]) {
  String z=null;
  try {
   System.out.println(z.length());
  }
  catch(NullPointerException e) {
   System.out.println(" Null value are not allowed..");
  }
  finally {
   System.out.println("Exception Successfully Handled");
  } 
 }
}