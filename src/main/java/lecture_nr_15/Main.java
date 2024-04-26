package lecture_nr_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        printEntireList(stringList);

        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        mergeTwoLists(floatList, floatList);

        Map<String, String> map = new HashMap<>();
        copyMaps(map, map);
    }

    //Read-only
    public static void printEntireList(List<?> inputList){

        for (Object element :
                inputList) {
            System.out.println(element);
        }
    }

    //Need to take the first element from a list and put it inside another list
    public static <T> void addFirstElementToList(List<T> firstList, List<T> secondList){

        firstList.add(secondList.get(0));
    }

    //Need to take a list and sum all elements from it
    public static void sumAllElementsFromList(List<? extends Number> inputList){

        double sum = 0d;

        for (Number element :
                inputList) {
            sum += element.doubleValue();
        }
    }

    // Need to copy all numbers from one list to the other one
    public static <T extends Number> void mergeTwoLists(List<T> firstList, List<T> secondList){

    }

    public static void addElementToList(List<?> inputList, Object variable){

//        inputList.add(variable); //Won't compile!
        Object obj = inputList.get(0);
    }

    public static <T> void addElementTOList(List<T> inputList, T variable){

        inputList.add(variable);

        T random = inputList.get(0);
    }

    // Need to print out key value pairs of a map
    public static void printMap(Map<?, ?> inputMap){

    }

    // Need to add all values from one map to other map
    public static <T,U> void copyMaps(Map<T, U> firstMap, Map<T, U> secondMap){

    }
}
