package ss7_abstract_class_interface.thuchanh.lop_animal_va_interface_edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();

        for (Animal value: animal) {
            System.out.println(value.makeSound());
            if (value instanceof Chicken){
                System.out.println(((Chicken)value).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit value: fruits) {
            System.out.println(value.howToEat());
        }
    }
}
