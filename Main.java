// Class definition for Person
class Person {
    // Fields
    String name;
    int age;
    String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method to accept a person object and call displayDetails method
    public void myDetails(Person person) {
        person.displayDetails();
    }
}

// Main class
public class Main {
    // Method to print the current instance
    public void printCurrentInstance(Person person) {
        person.displayDetails();
    }

    public static void main(String[] args) {
        // Creating an object of Person
        Person person = new Person("Edward", 25, "2301842");

        // Creating an instance of Main to call the non-static method
        Main main = new Main();

        // Using the object to call printCurrentInstance method
        main.printCurrentInstance(person);
    }
}
