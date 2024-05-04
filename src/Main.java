import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Wiesław Paleta", 58);
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Welcome to the system, " + person.getName());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}