package lecture_nr_14.secondExample;

import lecture_nr_14.firstExample.Player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Hello", "World!"));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Boolean> booleanList = new ArrayList<>(Arrays.asList(true, false, true, true));

        printList(stringList);
        printList(integerList);
        printList(booleanList);

//        printAllList(stringList); Won't Compile!

        printObject("asd");
        printObject(3);
        printObject(false);

        printListWithWildcard(stringList);
        printListWithWildcard(integerList);
        printListWithWildcard(booleanList);
    }

    public static void printObject(Object inputObject){

        System.out.println(inputObject);
    }

    public static void printAllList(List<Object> inputList){

        for(int index = 0; index != inputList.size(); index++){
            System.out.println(inputList.get(index));
        }
    }

    //Below are methods which are basically the same
    public static void printListWithWildcard(List<?> inputList){

        for (int index = 0; index != inputList.size(); index++){
            System.out.println(inputList.get(index));
        }
    }

    public static <T> void printList(List<T> inputList){

        for(int index = 0; index != inputList.size(); index++){
            System.out.println(inputList.get(index));
        }
    }
}
