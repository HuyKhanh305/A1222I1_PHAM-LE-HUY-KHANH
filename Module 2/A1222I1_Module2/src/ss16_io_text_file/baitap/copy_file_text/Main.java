package ss16_io_text_file.baitap.copy_file_text;

import java.io.*;

public class CopyFile {

    static void readFile(File source, File target) throws IOException {
       FileReader fileReader = new FileReader(source);
       FileWriter fileWriter = new FileWriter(target,true);
       BufferedReader buff = new BufferedReader(fileReader);
       
    }

    public static void main(String[] args) {

    }
}
