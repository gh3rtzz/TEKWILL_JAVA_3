package lecture_nr_3;

public class Main {

    public static void main(String[] args) {

        String text = "Hello World!";

        System.out.println(text);

        // +

        String first = "Hello ";
        String second = "World!";

        System.out.println(first);

        first += second;

        System.out.println(first);

        first += " Adding this to the end of the variable with the name first";

        System.out.println(first);

        System.out.println(first + second + "asdasda" + first + "asdasd");

        String test1 = "Hello";

        String test2 = "\n World!";

        System.out.println(test1 + test2);

        String concatTest = "123123" + 13;

        System.out.println(concatTest);


        //IF

        int dayOfWeek = 6;

        if (dayOfWeek > 0 && dayOfWeek < 8) {
            if (dayOfWeek > 5) {
                System.out.println("It's Weekend!");
            } else {
                System.out.println("It's a working day");
            }
        } else {
            System.out.println("Wrong day!");
        }

        switch (dayOfWeek){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day!");
        }

        if(dayOfWeek == 6){
            System.out.println("It's Saturday!");
            System.out.println("It's Sunday!");
        } else if(dayOfWeek == 7){
            System.out.println("It's Sunday!");
        }

        int nrOfTimes = 0;

        //Print out the text hello loop 10 times

        while(nrOfTimes != 6){

            System.out.println("Hello loop! Number of times: " + nrOfTimes);
            nrOfTimes += 2;
        }

        //Break

        int nrOfTimes2 = 0;

        while(nrOfTimes2 != 10){
            System.out.println("Hello from the second loop!");

            if(nrOfTimes2 == 5) {
                break;
            }
            nrOfTimes2++;
        }

        nrOfTimes2 = 10;

        while(nrOfTimes2 != 0){
            nrOfTimes2--;
            if(nrOfTimes2 == 5){
                continue;
            }

            System.out.println("Hello from the third loop | nrOfTimes2: " + nrOfTimes2);
        }


        //do while example

        int i = -2;

        do {
            System.out.println("Printing i: " + i);
            i++;
        } while (i < 0);

        //While example

        int x = 0;

        while(x < 0){
            System.out.println("Printing x: " + x);
            x++;
        }

        //for loop print hello world 10 times

        for(int z = 0; z != 10; z++){
            System.out.println("Hello World! from for loop | z: " + z);
        }

        int z = 0;
        while(z != 10){
            System.out.println("Hello World! from while loop | z:" + z);
            z++;
        }
    }
}
