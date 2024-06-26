class Test{
 public static void main(String args[]){
  String z="This is Java Programming Class";
  String[] z1=z.split(" ");
  int n=z1.length;  
  for(int i=n-1;i>=0;i--){
   System.out.print(z1[i]+" ");
  }
 }
}
   