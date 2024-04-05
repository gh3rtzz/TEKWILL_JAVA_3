package lecture_nr_7.polymorphism;

public class C extends B{

    @Override
    public void print() {
        System.out.println("Printing from method print in class C");
    }

    public void test(){

        print();
        super.print();
    }
}
