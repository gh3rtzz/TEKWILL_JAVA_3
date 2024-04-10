package lecture_nr_9;

public final class FinalClass{

    int x;
    int y;

    public void something(){
        System.out.println("Something");
    }

    public FinalClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Test{

    public static void main(String[] args) {

        FinalClass finalClass = new FinalClass(3, 3);
        finalClass.x = 3;
    }
}
