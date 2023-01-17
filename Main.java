import java.io.File;
import java.util.*;
public class Main {
    public static void printData(Iterable<Person>iterable){
        iterable.forEach((person) -> System.out.println(person.toString()) );
    }

    public static void main(String[] args) {
        //File file = new File(toReadInfo.txt);

        List<Person> persons = new ArrayList<>();
        persons.add(new Student("Ringo", "Starr", 2));
        persons.add(new Student("Paul", "McCartney", 3));
        persons.add(new Employee("John", "Lennon", "IDk", 27045.78));
        persons.add(new Employee("George", "Harrison", "qwerty", 50000));

        Collections.sort(persons);
        printData(persons);
    }
}