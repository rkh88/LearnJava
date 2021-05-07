package fabricMethod;

public class Project {

    private Programmer programmer;

    private  TeamLead teamLead;

    public Project(ITTeamGenerator generator){
        this.programmer = generator.createProgrammer();
        this.teamLead = generator.createTeamLead();
    }
    public void doProject(){
            programmer.wrieode();
            teamLead.manageProject();
    }
}
