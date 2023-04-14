package ss7_abstract_class_interface.thuchanh.lop_animal_va_interface_edible;

public abstract class Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Can be sliced";
    }
}
