package ss16_io_text_file.thuchanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {

    public static final String FILE_NUMBER = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss17_io_binary_file_and_serialization\\baitap\\copy_file_nhi_phan\\number.txt";
    public static final String FILE_RESULT = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss17_io_binary_file_and_serialization\\baitap\\copy_file_nhi_phan\\result.txt";

    public List<Integer> readFile(){
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(FILE_NUMBER);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader buff = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buff.readLine()) != null){
                list.add(Integer.parseInt(line));
            }
            buff.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("File bi loi");
        }
        return list;
    }

    public void writeFile(int max){
        File resultFile = new File(FILE_RESULT);
        try {
            FileWriter fileWriter = new FileWriter(resultFile,true);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            buff.write("Gia tri lon nhat: " + max);
            buff.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
