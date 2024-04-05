package lecture_nr_7.polymorphism;

public class B extends A{

    @Override
    public void print() {
        super.print();
        System.out.println("WARNING! This method has been overriden in class B");
    }

    public void callBothPrints(){
        super.print(); // Going to call print in class A
        print(); // Going to call print in class B
    }
}
