package ss10_DSA_danh_sach.baitap.trien_khai_Arraylist_theo_thu_vien_java;

import java.lang.Integer;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listTest = new MyArrayList<>();
        listTest.add(0, 3);
        listTest.add(1, 5);
        listTest.add(2, 6);
        listTest.add(3, 8);

        System.out.println(listTest.add(7));

        System.out.println(listTest.contains(2));
        System.out.println(listTest.contains(5));

        listTest.ensureCapacity(5);

        int index = listTest.indexOf(5);
        System.out.println("Index is: " + index);

        System.out.println("Mang ban dau: ");
        for (int i = 0; i < listTest.size(); i++) {
            System.out.print(listTest.get(i) + " ");
        }


        int delete = listTest.remove(2);
        System.out.println("\n"+"Xoa phan tu: "+ delete);
        System.out.println("Mang da xoa: ");
        for (int i = 0; i < listTest.size(); i++) {
            System.out.print(listTest.get(i)+" ");
        }

//        listTest.clear();
//        System.out.print("\n"+ listTest.size());

        System.out.println("\n"+"Mang clone: ");
        MyArrayList<Integer> testClone = (MyArrayList<Integer>) listTest.clone();
        for (int i = 0; i < testClone.size(); i++) {
            System.out.print(testClone.get(i)+" ");
        }
    }
}
