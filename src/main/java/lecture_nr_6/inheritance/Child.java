package lecture_nr_6.inheritance;

public class Child extends Human{

    public String favoriteCartoon;

    public Child(String name, String surname, int age, String favoriteCartoon) {
        super(name, surname, age);
        this.favoriteCartoon = favoriteCartoon;
    }
}
