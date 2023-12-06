class Person {
    String name;
    public Person(String name) {
        name = name;
    }
    public Person(Person original) {
        name = original.name;
    }
    public String getName() {
        return name;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Person person1 = new Person("Your Name");
        System.out.println("Original Name: " + person1.getName());
        Person person2 = new Person(person1);
        System.out.println("Copied Name: " + person2.getName());
    }
}
