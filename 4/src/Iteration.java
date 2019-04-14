import java.time.LocalDateTime;
import java.util.List;

public class Iteration {
    private LocalDateTime deadline;
    private List<Task> taskList;
    private int projectId;

    public Iteration(LocalDateTime deadline, List<Task> taskList, int projectId) {
        this.deadline = deadline;
        this.taskList = taskList;
        this.projectId = projectId;
    }

    public void addTask(Task task){
        this.taskList.add(task);
    }

    @Override
    public String toString() {
        return "Iteration{" +
                "deadline=" + deadline +
                ", taskList=" + taskList.toString() +
                ", projectId=" + projectId +
                '}';
    }
}
