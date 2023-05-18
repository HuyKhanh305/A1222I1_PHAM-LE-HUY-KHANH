package ss16_io_text_file.baitap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String SOURCE_FILE = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss16_io_text_file\\baitap\\copy_file_text\\SourceFile.txt";
    public static final String TARGET_FILE = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss16_io_text_file\\baitap\\copy_file_text\\TargetFile.txt";

    public static List<String> readFile(String source){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(source);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(source);
            BufferedReader buff = new BufferedReader(fileReader);
            String line;
            while ((line = buff.readLine()) != null){
                list.add(line);
            }
            buff.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (Exception e){
            System.out.println("File bi loi hoac bi trung file");
        }
        System.out.println("Da copy thanh cong "+list);
        return list;
    }

    public static void writeFile(String target, List<String> list){
        try {
            FileWriter fileWriter = new FileWriter(target,true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            int count = 0;
            for (String text: list) {
                buff.write(text);
                buff.newLine();
                count += text.length();
            }
            buff.close();
            System.out.println("So ky tu trong file la "+count);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String sourceFile = String.valueOf(new File(SOURCE_FILE));
        File targetFile = new File(TARGET_FILE);
        List<String> list = readFile(sourceFile);
        writeFile(String.valueOf(targetFile),list);
    }
}
