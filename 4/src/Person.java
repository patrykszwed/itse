import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private boolean isTeamLeader;
    private List<Task> taskList;
    private List<Team> teamList;
    private String PESEL;


    public Person(String firstName, String lastName, boolean isTeamLeader, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isTeamLeader = isTeamLeader;
        this.PESEL = PESEL;
    }

    public void addTask(Task task){
        this.taskList.add(task);
    }

    public void addTeam(Team team){
        this.teamList.add(team);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isTeamLeader=" + isTeamLeader +
                ", taskList=" + taskList +
                ", teamList=" + teamList +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }

    public boolean isTeamLeader() {
        return isTeamLeader;
    }
}
