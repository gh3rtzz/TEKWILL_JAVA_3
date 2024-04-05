package lecture_nr_6.inheritance;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Alexey", "Soloviov", 20);

        Employee employee = new Employee("Dmitri", "Ciobanu", 30, 5);
        Child child = new Child("Semion", "Lobanov", 5, "Tom & Jerry");
        Retiree retiree = new Retiree("Pavel", "Matricala", 63, "Golf");

        Developer developer = new Developer("Artiom", "Surname1", 40, 15, "C#");
        Accountant accountant = new Accountant("Vasya", "Pupkin", 30, 10, "Trading");


        Human humanAccount1 = new Accountant("Vasya", "Pupkin", 30, 10, "Trading");
        Employee employeeAccount1 = new Accountant("Vasya", "Pupkin", 30, 10, "Trading");

        if(humanAccount1 instanceof Accountant tempObject){

            System.out.println("I got here!");
            System.out.println(tempObject.specialization);
        }

        Human[] humanArray = new Human[] {
                human, employee, child, retiree, developer, accountant, human, employee, humanAccount1, employeeAccount1
        };

        //Need to print out every humans name, surname and age

        for(int index = 0; index != humanArray.length; index++){
            System.out.println(humanArray[index].name + " " + humanArray[index].surname + " " + humanArray[index].age);
        }

        Employee[] employeesArray = new Employee[]{
                employee, employeeAccount1, developer, accountant
        };

        System.out.println("-----------------------");
        //Need to print everyone's name and years of experience

        for(int index = 0; index != employeesArray.length; index++){
            System.out.println(employeesArray[index].name + " " + employeesArray[index].yearsOfExperience);
        }


    }
}
