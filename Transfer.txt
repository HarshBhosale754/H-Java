import java.io.*;
class Test {
 public static void main(String args[])throws FileNotFoundException,IOException {
  FileInputStream fin=new FileInputStream("Harsh1.txt");
  FileOutputStream fos=new FileOutputStream("Harsh.txt");
  int k=0;
  while(k!=-1) {
   k=fin.read();
   fos.write((int)k);
  }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
  fos.close();
  System.out.println("Transfer file Successfully");
 }
}
  