public class Main {
  public static void main(String[] args) {
    Person pekka = new Person("Helga", 31, 12, 2009);
    Person martin = new Person("Janika", 1, 1, 2010);
    Person me = new Person("Me", 12, 3, 1988);

    System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
    System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
    System.out.println( me.getName() + " age " + me.age() + " years");
  }
}
