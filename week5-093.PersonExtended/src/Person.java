import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        int day = Calendar.getInstance().get(Calendar.DATE);;
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(day, month, year);
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);

        int day = Calendar.getInstance().get(Calendar.DATE);;
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDate = new MyDate(day, month, year);

        return this.birthday.differenceInYears(currentDate);
    }
    
    public boolean olderThan(Person compared) {

        if(age() > compared.age()) {
            return true;
        }
        if(age() == compared.age()) {

            /* Checking compared.birthday specifically because we only need the dates
            not all of the info in the object. */
            if(this.birthday.earlier(compared.birthday)) {
                return true;
            }
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
