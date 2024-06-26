class Test{
 public static void main(String args[]){
  String z="harsh"; 
  int n=z.length();  
  char[] arr=z.toCharArray();
  int start=0;
  int end=n-1;
  char temp;
  while(start<end) {
   temp=arr[end];
   arr[end]=arr[start];
   arr[start]=temp;
    start++;
    end--;
   System.out.println(arr);
  }
 }
}
