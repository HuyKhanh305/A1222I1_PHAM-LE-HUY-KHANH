package ss10_DSA_danh_sach.baitap.trien_khai_Arraylist_theo_thu_vien_java;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity){
        elements = new Object[capacity];
     }

     public void add(int index, E element){
//        if (size == elements.length){
//        }
     }

     public E remove(int index){
        return (E) elements[index];
     }

     public int size(){
        return size;
     }

     public E clone(){
         return (E) elements;
     }

     public boolean contains(E o){
        if (o == elements){
            return false;
        }
        return true;
     }

     public int indexOf(E o){
        return  elements.length;
     }

     public boolean add(E e){
        return true;
     }

     public void ensureCapacity(int minCapacity){

     }
}
