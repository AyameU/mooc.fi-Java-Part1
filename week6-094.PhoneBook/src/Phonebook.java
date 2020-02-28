import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }

    public void add(String name, String phoneNumber) {
        Person person = new Person(name, phoneNumber);
        this.phonebook.add(person);
    }

    public void printAll() {
        for(Person p : phonebook) {
            System.out.println(p);
        }
    }
}
