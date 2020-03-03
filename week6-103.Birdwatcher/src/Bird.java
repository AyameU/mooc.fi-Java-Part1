public class Bird {
    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Latin Name: " + latinName);
    }

    public String toString() {
        return name + ", " + latinName;
    }
}
