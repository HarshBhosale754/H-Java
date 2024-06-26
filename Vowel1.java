class Test{
 public static void main(String[] args) {		
  String z = "Java Language Is Early To Learn";
  String regex = "[aeiouAEIOU]";
  String z1 = z.replaceAll(regex,""); 
  System.out.print(z1); 
 }
}
