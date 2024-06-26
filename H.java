class Test {
 public static void main(String[] args) {
  for (int i = 8; i &gt;= 0; i--) {
   int alphabet = 65;
   for (int j = 0; j &lt;= i; j++) {
    System.out.print((char) (alphabet + j) + " ");
   }
   System.out.println();
  }
  for (int i = 0; i&lt;= 8; i++) {
   int alphabet = 65;
   for (int j = 0; j &lt;= i; j++) {
    System.out.print((char) (alphabet + j) + " ");
   }
   System.out.println();
  }
 }
}
