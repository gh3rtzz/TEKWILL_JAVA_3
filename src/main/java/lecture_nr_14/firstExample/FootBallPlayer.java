package lecture_nr_14.firstExample;

public class FootBallPlayer implements Player, CanConductTraining{

    private String name;
    private String surname;

    public FootBallPlayer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
