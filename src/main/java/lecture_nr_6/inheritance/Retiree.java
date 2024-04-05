package lecture_nr_6.inheritance;

public class Retiree extends Human{

    public String hobby;

    public Retiree(String name, String surname, int age, String hobby) {
        super(name, surname, age);
        this.hobby = hobby;
    }
}
