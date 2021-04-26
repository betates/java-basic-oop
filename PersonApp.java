package main;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Rofiq", "Surabaya");

        System.out.println(person.Name);
        System.out.println(person.Address);
        System.out.println(person.Country);

        Person person1 = new Person("Andre");
        System.out.println(person1.Name);

        Person person2;
        person2 = new Person();
        person2.Name = "Devi";
        System.out.println(person2.Name);

        person.SayHello("Budi");
    }
}
