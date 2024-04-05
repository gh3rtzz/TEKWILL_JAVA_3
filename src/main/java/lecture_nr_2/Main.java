package lecture_nr_2;

public class Main {

    public static void main(String[] args) {

        //sout
        System.out.println("Hello World!");
        System.out.println("This is the second println instruction");

        int first = 3;

        char second = 'A';

        boolean third = true;

        float fourth = 3.123f;

        System.out.println(first);

        first = 4;

        System.out.println(first);

        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        int x = 1;
        int y = 2;

        System.out.println("----------------");
        int sum = x + y;
        System.out.println(sum);
        sum = x - y;
        System.out.println(sum);
        sum = x / y;
        System.out.println(sum);
        sum = x * y;
        System.out.println(sum);
        sum = x % y;
        System.out.println(sum);

        double fl1 = 5.1231f;
        float fl2 = 2.239f;

        double result = fl1 / fl2;

        System.out.println(fl1 + fl2);
        System.out.println(fl1 / fl2);

        int l = 3;

        System.out.println(++l);

        System.out.println(l);

        int skobki = 1 + 2 * 3 + 2;

        System.out.println(skobki);

        char firstChar = 47 + 2;
        char secondChar = '/';

        secondChar++;

        System.out.println("------------------");
        System.out.println(firstChar);
        System.out.println(secondChar);

    }
}
