package model;

public class Customer extends Person{
    private String customerType;
    //* customerType = new String[]{"Diamond", "Gold", "Silver","Member"};
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String gender, String identityCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, gender, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
