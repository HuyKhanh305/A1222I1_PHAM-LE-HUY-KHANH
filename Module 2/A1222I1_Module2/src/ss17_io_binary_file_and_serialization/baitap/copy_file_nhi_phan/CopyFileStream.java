package ss17_io_binary_file_and_serialization.baitap.copy_file_nhi_phan;

import java.io.*;

public class CopyFileStream {

    public static final String FILE_SOURCE = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss17_io_binary_file_and_serialization\\baitap\\copy_file_nhi_phan\\sourceFile.txt";
    public static final String FILE_TARGET = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss17_io_binary_file_and_serialization\\baitap\\copy_file_nhi_phan\\targetFile.txt";

    public static void copyFile(String sourcePath, String targetPath) throws IOException {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(targetPath);
            int lineLength;
            byte[] buff = new byte[1024];
            while ((lineLength = fis.read(buff)) > 0){
                fos.write(buff,0,lineLength);
            }
            fis.close();
            fos.close();
    }

    public static void main(String[] args) throws IOException {
        try {
            copyFile(FILE_SOURCE,FILE_TARGET);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
