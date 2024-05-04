import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy osób
        Person[] people = new Person[5];
        int b = 10;  // Stała wartość do obliczeń

        try {
            // Tworzenie instancji Person i przypisywanie do tablicy
            people[0] = new Person("Wiesław Paleta", 58);
            people[1] = new Person("John Rambo", 75);
            people[2] = new Person("Jim Beam", 18);
            people[3] = new Person("Forrest Gump", 22);
            people[4] = new Person("Jack Sparrow", 35);

            Messenger emailMessenger = new EmailMessenger();

            // Przetwarzanie i wyświetlanie wiadomości dla każdej osoby
            for (Person person : people) {
                int ageSum = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage("Hello " + person.getName() + "! Your age plus " + b + " is " + ageSum + ".");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}