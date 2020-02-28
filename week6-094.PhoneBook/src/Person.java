public class Person {
    private String name;
    private String phoneNumber;

    // constructor
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getters

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.phoneNumber;
    }

    // methods

    public void changeNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }

    // toString

    public String toString() {
        return this.name + "  number: " + this.phoneNumber;
    }
}
