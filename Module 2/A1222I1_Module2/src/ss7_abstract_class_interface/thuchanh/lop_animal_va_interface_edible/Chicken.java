package ss7_abstract_class_interface.thuchanh.lop_animal_va_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Could be eat raw";
    }

    @Override
    public String makeSound() {
        return "Chicken: chick-chick";
    }
}
