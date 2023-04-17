package ss10_DSA_danh_sach.thuchanh.trien_khai_lop_linkedlist_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(6);
        list.addFirst(11);
        list.addFirst(10);

        list.add(5,7);
        list.add(6,8);
        list.printList();
//        System.out.println(list.get(5));
    }
}
