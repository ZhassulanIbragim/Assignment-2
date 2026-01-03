import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000.00);

        Student s1 = new Student("Ringo", "Starr", 2.3);
        Student s2 = new Student("Paul", "McCartney", 3.5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                p.toString() + " earns " +
                String.format("%.2f", p.getPaymentAmount()) + " tenge"
            );
        }
    }
}
