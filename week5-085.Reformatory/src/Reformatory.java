public class Reformatory {
    private int totalWeightsMeasured = 0;

    public int weight(Person person) {
        totalWeightsMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return totalWeightsMeasured;
    }

}
