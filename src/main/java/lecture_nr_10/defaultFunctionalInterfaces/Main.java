package lecture_nr_10.defaultFunctionalInterfaces;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        //Need to filter a list of Strings (somehow)

        List<String> stringList = List.of("Apples", "Ananas", "Oranges", "Blueberries", "Cherries", "Mango");


        Predicate<String> filterStringsThatStartWithA = (String e) -> {
            return e.startsWith("A");
        };

        testListOfStrings(stringList, filterStringsThatStartWithA);

        System.out.println("------------------------");
        testListOfStrings(stringList, (String e) -> {
            return e.contains("b");
        });

        testListOfStrings(stringList, e -> e.startsWith("c"));

        Function<String, Integer> returnStringSizes = (String e) -> {
            return e.length();
        };

        Function<String, Integer> returnNumberOfVowelsInString = (String e) -> {
            int count = 0;

            e = e.toLowerCase(Locale.ROOT);
            for(int index = 0; index != e.length(); index++){
                char c = e.charAt(index);

                if(c == 'a' || c == 'u' || c == 'o' || c == 'i' || c == 'e' || c == 'y')
                    count++;
            }

            return count;
        };


        System.out.println("-------------------------");

        printResultOfFunctionInAListOfStrings(stringList, returnStringSizes);

        System.out.println("------------------------");

        printResultOfFunctionInAListOfStrings(stringList, returnNumberOfVowelsInString);


        stringList.forEach(e -> System.out.println(e));


    }

    public static void printResultOfFunctionInAListOfStrings(List<String> inputList, Function<String, Integer> algo){

        for(int index = 0; index != inputList.size(); index++){

            System.out.println(algo.apply(inputList.get(index)));
        }
    }

    public static void testListOfStrings(List<String> inputList, Predicate<String> algo){

        for(int index = 0; index != inputList.size(); index++){

            if(algo.test(inputList.get(index))){
                System.out.println(inputList.get(index));
            }
        }
    }

}
