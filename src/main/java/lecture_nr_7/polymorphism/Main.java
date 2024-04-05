package lecture_nr_7.polymorphism;

public class Main {

    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        calculation.returnSum(3);
        calculation.returnSum("asda");
        calculation.returnSum(33d, 33d);
        calculation.returnSum(3, 3);

        Printer printer = new Printer();

        printer.print(1);
        printer.print('A');
        printer.print("Hello motto!");
        printer.print(false);

        A a = new A();
        A a1 = new A();
        B b = new B();

        a.print();
        b.print();

        System.out.println("------------");
        A[] aArray = new A[]{
                a, b, a1
        };

        for (int index = 0; index != aArray.length; index++){
            aArray[index].print();
        }

        System.out.println("----------------");

        b.callBothPrints();
    }
}
