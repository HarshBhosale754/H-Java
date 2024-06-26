import java.io.*;
class Test {

 public static void main(String args[])throws IOException {
  FileOutputStream fos=new FileOutputStream("Harsh1.txt");
  String z="Data is Write";
  byte[]b=z.getBytes();
    fos.write(b);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    fos.close();
   }
}
