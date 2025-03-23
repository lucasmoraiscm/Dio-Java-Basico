public class Main {
    public static void main(String[] args) {
        var person = new Person("João", 20);
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.getInfo());

        var newPerson = new Person("Maria");
        System.out.println(newPerson.getInfo());
    }
}
