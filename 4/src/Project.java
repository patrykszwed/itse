import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private LocalDateTime deadline;
    private int id;
    private int teamId;
    private List<Iteration> iterations;

    public Project(String name, LocalDateTime deadline, int id, int teamId, Iteration iteration) {
        this.name = name;
        this.deadline = deadline;
        this.id = id;
        this.teamId = teamId;
        this.iterations = new ArrayList<>();
        this.iterations.add(iteration);
    }

    public void addIteration(Iteration iteration){
        this.iterations.add(iteration);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", deadline=" + deadline +
                ", id=" + id +
                ", teamId=" + teamId +
                ", iterations=" + iterations.toString() +
                '}';
    }
}
