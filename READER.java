import java.io.*;
class Test {
 public static void main(String args[])throws IOException{
  FileReader frd=new FileReader("HBCS.txt");
  int k=0;
  while(k!=-1) {
   k=frd.read();
   System.out.print((char)k);
  }
 }
}