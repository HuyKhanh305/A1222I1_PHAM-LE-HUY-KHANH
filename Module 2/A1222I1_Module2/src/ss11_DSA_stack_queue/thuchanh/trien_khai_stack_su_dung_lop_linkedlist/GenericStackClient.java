package ss11_DSA_stack_queue.thuchanh.trien_khai_stack_su_dung_lop_linkedlist;

public class GenericStackClient {
    public static void stackOfStrings() {
        MyGenericStack<String> stackStrings = new MyGenericStack<>();
        stackStrings.push("Hello");
        stackStrings.push("Bye");
        stackStrings.push("Bonjour");
        stackStrings.push("Ni-hao");
        System.out.println("Size of stack after push elements: "+stackStrings.size());
        System.out.printf("Elements pop: "+ "%s", stackStrings.pop());
        System.out.println("\n"+"Size of stack after pop elements: "+stackStrings.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> stackInteger = new MyGenericStack<>();
        stackInteger.push(3);
        stackInteger.push(5);
        stackInteger.push(8);
        stackInteger.push(9);
        System.out.println("Size of stack after push elements: "+stackInteger.size());
        System.out.print("Pop element from stack: ");
        while (!stackInteger.isEmpty()){
            System.out.printf("%d", stackInteger.pop());
        }
        System.out.println("\n"+"Size of stack after pop elements: "+stackInteger.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of String:");
        stackOfStrings();
        System.out.println("2. Stack of Integer");
        stackOfIntegers();
    }
}


