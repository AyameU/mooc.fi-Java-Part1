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

    public String searchNumber(String name) {
        String number = "";
        for(Person p : phonebook) {
            if(p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number is not known";
    }
}
