class Test{
 public static void main(String[] args) {		
  String z = "Java Language Is Early To Learn";
  String z1 = "";
  z1 = z.replaceAll("[aeiouAEIOU]", ""); 
  System.out.print(" "+z1); 
 }
}
