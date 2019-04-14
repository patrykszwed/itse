import java.util.List;

public class Team {
    private String name;
    private int id;
    private int projectId;
    private List<Person> people;

    public Team(String name, int id, int projectId, List<Person> people) {
        boolean isTeamLeader = false;
        for(Person person : people){
            if(isTeamLeader && person.isTeamLeader()){
                System.out.println("There can be only 1 team leader in a team!");
                System.exit(0);
            } if(person.isTeamLeader()){
                isTeamLeader = true;
            }
        }
        if(people.size() < 3 || people.size() > 5){
            System.out.println("Team has to consist of from 3 to 5 members.");
            System.exit(0);
        }
        this.name = name;
        this.id = id;
        this.projectId = projectId;
        this.people = people;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", projectId=" + projectId +
                ", people=" + people +
                '}';
    }
}
