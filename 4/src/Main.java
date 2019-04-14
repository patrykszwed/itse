import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Task> tasks = new ArrayList<>();

        Person person1 = new Person("Jan", "Kowalski", false, "1");
        Person person2 = new Person("Piotr", "Nowak", true, "2");
        Person person3 = new Person("Andrzej", "Kowalczyk", false, "3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Team team1 = new Team("Team 1", 1, 1, people);

        Task task1 = new Task("Main page", "First version of a main page", 140, 160, "Done", 1, 1, 2);
        Task task2 = new Task("Admin page", "First version of an admin page", 120, 115, "Done", 2, 1, 3);

        tasks.add(task1);
        tasks.add(task2);

        Iteration iteration = new Iteration(LocalDateTime.of(2019, 5, 14, 0, 0), tasks, 1);
        Project project = new Project("Project 1", LocalDateTime.of(2020, 5, 31, 0, 0), 1, 1, iteration);

        System.out.println(project.toString());
     }
}
