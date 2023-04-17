package ss10_DSA_danh_sach.baitap.trien_khai_Arraylist_theo_thu_vien_java;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    static int DEFAULT_CAPACITY = 10;
    //    private Object[] elements;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        DEFAULT_CAPACITY = capacity;
    }

    public void add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E arr = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return arr;
    }

    public int size() {
        return size;
    }

    public Object clone()  {
        MyArrayList<E> newElements = new MyArrayList<>();
        newElements.elements = Arrays.copyOf(elements,size);
        newElements.size = size;
        return newElements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > size || minCapacity < size){
            System.out.println("Out of capacity");
        } else{
            System.out.println("Non-Capacity");
        }
    }

    public E get(int i){
        return elements[i];
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
