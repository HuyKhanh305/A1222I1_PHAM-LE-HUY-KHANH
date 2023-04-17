package ss10_DSA_danh_sach.thuchanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;


public class MyList<E> {
   private int size = 0;
    private Object [] elements;

    public MyList() {
        int DEFAULT_CAPACITY = 10;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size );
        }
        return (E) elements[i];
    }
}
