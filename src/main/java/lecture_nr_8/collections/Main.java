package lecture_nr_8.collections;

import lecture_nr_7.polymorphism.A;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {

        //List

        List<Integer> integerList = new ArrayList<>();

        //Adding elements

        integerList.add(1);
        integerList.add(100);
        integerList.add(-1);

        //get elements

        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));
        System.out.println(integerList.get(2));

        //remove elements

        integerList.remove(Integer.valueOf(100));
        integerList.remove(1);

        // retrieve size

        System.out.println("List size is: " + integerList.size());

        // clear the entire list

        integerList.clear();

        // does it contain a certain element?

        integerList.add(3);

        System.out.println("Does the list contain number 3? : " + integerList.contains(3));
        System.out.println("Does the list contain number 5? : " + integerList.contains(5));

        // index of object

        integerList.add(5);
        integerList.add(10);
        integerList.add(30);
        integerList.add(10);
        integerList.add(99);

        System.out.println("First index of 10: " + integerList.indexOf(10));
        System.out.println("Last index of 10: " + integerList.lastIndexOf(10));

        // is the list empty?

        System.out.println("Is the list empty? : " + integerList.isEmpty());


        //remove element by object using remove method

        System.out.println("----------------");
        integerList.remove(Integer.valueOf(10));

//        for(int index = 0; index != integerList.size(); index++){
//            System.out.println(integerList.get(index));
//        }

        for (Integer element :
                integerList) {
            System.out.println(element);
        }


        List<String> stringList = new ArrayList<>();

        stringList.add("AAA");
        stringList.add("BBB");
        stringList.add("CCC");

        System.out.println(stringList);

        // SET

        System.out.println("---------- SET ------------");

        Set<Integer> intSet = new HashSet<>();

        //Adding elements

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        // Getting elements
        // There's no get method so you're unable to retrieve elements like in the list

        System.out.println(intSet);

        //No duplicates

        intSet.add(2);
        intSet.add(3);
        intSet.add(2);

        System.out.println(intSet);

        //MAP

        System.out.println("----------- MAP ------------");

        Map<String, String> authentication = new HashMap<>();

        //Adding elements using the put method

        authentication.put("alex111", "pass123");
        authentication.put("unicorn33", "rainb0w20");
        authentication.put("dumitruS", "pasW0rD!");
        authentication.put("alex111", "pass123");
        authentication.put("alex1111", "pass123");

        // Getting elements by key

        System.out.println(authentication.get("unicorn33"));
        System.out.println(authentication.get("dumitruS"));

        //Printing all elements

        System.out.println(authentication);

        Map<String, Integer> asd = new HashMap<>();

        asd.put("asd", 3);

        //Getting the key set

        System.out.println("Printing out all keys");
        System.out.println(authentication.keySet());
        System.out.println("Printing all the values");
        System.out.println(authentication.values());

        //Contains

        System.out.println(authentication.containsKey("unicorn33"));
        System.out.println(authentication.containsValue("rainb0w20"));


        //QUEUE

        System.out.println("------------- QUEUE -----------");

        Queue<String> stringQueue = new ArrayDeque<>();

        //Putting elements

        stringQueue.offer("First");
        stringQueue.offer("Second");
        stringQueue.offer("Third");
        stringQueue.offer("Fourth");

        //Printing all elements from queue

        System.out.println(stringQueue);

        //Getting the first element

        System.out.println(stringQueue.poll());
        stringQueue.offer("Fifth");

        System.out.println(stringQueue);

        stringQueue.poll();

        System.out.println(stringQueue);

        Queue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        arrayBlockingQueue.add("first");

        System.out.println(arrayBlockingQueue);

        System.out.println(arrayBlockingQueue.offer("second"));

        // Peek

        System.out.println(stringQueue.peek());
        System.out.println(stringQueue);

    }
}
