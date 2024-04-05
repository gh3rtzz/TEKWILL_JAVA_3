package lecture_nr_6.encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        CreditCard creditCard = new CreditCard("4444111188882222", "Alexey Soloviov", 123);

        employee.name = "asd";
        employee.surname = "asd";

        System.out.println(employee.name);
        System.out.println(employee.surname);

//        creditCard.setCardNumber("888");

        System.out.println(creditCard.getCardNumber());

        System.out.println(creditCard.getCardHolder());


    }
}
