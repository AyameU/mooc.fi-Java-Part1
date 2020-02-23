
import java.util.ArrayList;

public class Menu {

    // object variables
    private ArrayList<String> meals;

    // constructor
    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // method
    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    // method
    public void printMeals() {
        for(String m : this.meals) {
            System.out.println(m);
        }
    }

    // method
    public void clearMenu() {
        meals.clear();
    }
}
