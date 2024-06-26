class Test {
 public static void main(String args []) {
  int arr[]={1,222,31,4};
  try {
   System.out.println(arr[5]);
  }
  catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("Index 5 out of bounds for length 4");
  }
  finally {
   System.out.println("Exception Successfully Handled");
  } 
 }
}