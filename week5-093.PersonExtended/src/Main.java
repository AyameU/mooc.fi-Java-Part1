public class Main {
  public static void main(String[] args) {
    // write test code here
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person steve = new Person("Thomas", 1, 3, 1955);
    Person me = new Person("Me", 12, 3, 1988);

    System.out.println( steve.getName() + " age " + steve.age() + " years");
    System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    System.out.println( me.getName() + " age " + me.age() + " years");
  }
}
