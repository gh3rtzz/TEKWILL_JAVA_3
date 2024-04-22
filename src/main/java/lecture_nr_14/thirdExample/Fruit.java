package lecture_nr_14.thirdExample;

import java.util.ArrayList;
import java.util.List;

public class Fruit {

}

class Citrus extends Fruit{

}

class Orange extends Citrus{

}

class BigOrange extends Orange{

}

class Main{

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigOrange bigOrange = new BigOrange();

        List<Object> objectList = new ArrayList<>();
        List<Fruit> fruitList = new ArrayList<>();
        List<Citrus> citrusList = new ArrayList<>();
        List<Orange> orangeList = new ArrayList<>();
        List<BigOrange> bigOrangeList = new ArrayList<>();

        Fruit fruit1 = new Citrus();

        printAllFruits(fruitList);
        printAllFruitsConsumer(objectList);

        printAllFruitsConsumer(fruitList);
//        printAllFruitsConsumer(citrusList); -- Won't Compile!

        printAllFruitsConsumer2(fruitList);
        printAllFruitsConsumer2(citrusList);
        printAllFruitsConsumer2(orangeList);
        printAllFruitsConsumer2(bigOrangeList);
    }

    //PECS : Producer Extends Consumer Super
    //Producer example
    public static void printAllFruits(List<? extends Fruit> fruitList){

        Fruit fruit = fruitList.get(0);
        Object object = fruitList.get(0);

    }
    //Consumer example
    public static void printAllFruitsConsumer(List<? super Fruit> fruitList){

        Object fruit = fruitList.get(0);

        fruitList.add(new Fruit());
        fruitList.add(new Citrus());
        fruitList.add(new Orange());
        fruitList.add(new BigOrange());
    }

    public static void printAllFruitsConsumer2(List<? super BigOrange> fruitList){

        Object object = fruitList.get(0);

        fruitList.add(new BigOrange());
//        fruitList.add(new Citrus()); -- Won't Compile!

    }
}
