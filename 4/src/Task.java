public class Task {
    private String title;
    private String content;
    private int plannedHours;
    private int realHours;
    private String state;
    private int id;
    private int iterationId;
    private int ownerPESEL;

    public Task(String title, String content, int plannedHours, int realHours, String state, int id, int iterationId) {
        this.title = title;
        this.content = content;
        this.plannedHours = plannedHours;
        this.realHours = realHours;
        this.state = state;
        this.id = id;
        this.iterationId = iterationId;
    }

    public Task(String title, String content, int plannedHours, int realHours, String state, int id, int iterationId, int ownerPESEL) {
        this.title = title;
        this.content = content;
        this.plannedHours = plannedHours;
        this.realHours = realHours;
        this.state = state;
        this.id = id;
        this.iterationId = iterationId;
        this.ownerPESEL = ownerPESEL;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", plannedHours=" + plannedHours +
                ", realHours=" + realHours +
                ", state='" + state + '\'' +
                ", id=" + id +
                ", iterationId=" + iterationId +
                ", ownerPESEL=" + ownerPESEL +
                '}';
    }
}
