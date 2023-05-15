package ss16_io_text_file.thuchanh.tinh_tong_cac_so_trong_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FIle_PATH = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\A1222I1_Module2\\src\\ss16_io_text_file\\thuchanh\\tinh_tong_cac_so_trong_file_text\\countryname.csv";

    public static List<Country> readCountry() throws IOException {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = new FileReader(FIle_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String temp[];
        Country country;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];

            country = new Country(id,code,name);
            countryList.add(country);
        }
        buff.close();
        return countryList;
    }

//    public static void writeCountry(Country country) throws IOException {
//        FileWriter fileWriter = new FileWriter(FIle_PATH,true);
//        BufferedWriter buff = new BufferedWriter(fileWriter);
//        buff.write(country.getId()+","+ country.getCode()+","+country.getName()+ "\n");
//        buff.close();
//    }

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readCountry();
        for (Country countries: countryList) {
            System.out.println(countries);
        }

    }
}

