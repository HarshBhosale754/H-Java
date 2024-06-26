import java.io.*;
class Test {

 public static void main(String args[])throws IOException {
  FileWriter fos=new FileWriter("Harsh2.txt");
  String z="Data is Write";
  byte[]b=z.getBytes();
    fos.writer(b);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    fos.close();
   }
}
