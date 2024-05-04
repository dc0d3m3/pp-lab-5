import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Wiesław Paleta", 58);
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());

            // Dodawanie dwóch liczb i wypisywanie wyniku
            int sum = MathUtils.add(5, 3);
            System.out.println("Sum of 5 and 3 is: " + sum);

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Welcome to the system, " + person.getName() + ". The sum is: " + sum);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
