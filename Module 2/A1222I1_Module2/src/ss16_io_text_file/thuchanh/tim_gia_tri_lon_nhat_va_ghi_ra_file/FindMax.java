package ss16_io_text_file.thuchanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

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
