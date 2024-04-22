package lecture_nr_14.firstExample;

import java.io.Serializable;

public class BasketBallPlayer implements Player, CanConductTraining {

    private String name;

    public BasketBallPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
