public class Bird {
    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int observation() {
        return this.observation++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + this.observation + " observations";
    }
}
