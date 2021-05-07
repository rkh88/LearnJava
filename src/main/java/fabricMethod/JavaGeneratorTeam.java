package fabricMethod;

public class JavaGeneratorTeam  implements   ITTeamGenerator{
    @Override
    public Programmer createProgrammer() {
        return new JavaProgrammer();
    }

    @Override
    public TeamLead createTeamLead() {
        return new JavaTeamLead();
    }
}
