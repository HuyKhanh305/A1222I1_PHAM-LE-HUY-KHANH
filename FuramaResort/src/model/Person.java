package model;

public abstract class Person {
    private int id;
    private String name;
    private String gender;
    private int identityCard;
    private long phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String gender, int identityCard, long phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
