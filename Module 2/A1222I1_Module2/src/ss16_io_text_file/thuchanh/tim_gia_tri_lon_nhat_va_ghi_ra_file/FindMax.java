package ss17_io_binary_file_and_serialization.baitap.copy_file_nhi_phan;

import ss16_io_text_file.thuchanh.tinh_tong_cac_so_trong_file_text.ReadFileExample;

import java.util.List;

public class FindMax {
    public static int findMaxValue(List<Integer> list){
        int max = list.get(0);
        for (Integer value : list) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        List<Integer> numbers = readWriteFile.readFile();
        int maxValue = findMaxValue(numbers);
        readWriteFile.writeFile(maxValue);
    }
}
