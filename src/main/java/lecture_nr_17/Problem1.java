package lecture_nr_17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Problem1 {

    //I need to create 100 files in a directory called Massive directory (massive dir)
    //Then I need to fill in the files with a random number between 500 and 1000 of strings with a random length
    //inside them
    //Then I need to go through every file and fin the largest string in all of them

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        //Create a massive dir
        Path massiveDirPath = Path.of("src/main/java/lecture_nr_17/massiveDir");

        if(!Files.exists(massiveDirPath)){
            Files.createDirectory(massiveDirPath);
        }

        final int nrOfFiles = 100;

        // TestFile1.txt
        for(int index = 0; index != nrOfFiles; index++){
            Path buffPath = Path.of("src/main/java/lecture_nr_17/massiveDir/TestFile" + index + ".txt");
            if(!Files.exists(buffPath)){
                Files.createFile(buffPath);
            }
        }

        //Fill in every single file

        Stream<Path> fileStream = Files.list(Path.of("src/main/java/lecture_nr_17/massiveDir"));

        fileStream.forEach(e -> {

            final int nrOfStrings = random.nextInt(500, 1000);

            for(int index = 0; index != nrOfStrings; index++){
                try {
                    Files.writeString(e, generateRandomString(random.nextInt(1, 501)) + "\n", StandardOpenOption.APPEND);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

//        List<String> readAllFiles = new LinkedList<>();
        String longestString = "";

        Stream<Path> pathStream1 = Files.list(massiveDirPath);

        List<Path> pathList = pathStream1.toList();

        for (Path element :
                pathList) {

            System.out.println("Reading: " + element.getFileName());
            String buff = null;

            List<String> readLines = Files.readAllLines(element);

            for (String element1 :
                    readLines) {
                if(element1.length() > longestString.length())
                    longestString = element1;
            }
        }

        System.out.println("The longest string in all files is: ");
        System.out.println(longestString);
    }

    public static String generateRandomString(int length){
        final int start = '0';
        final int end = 'z';
        final Random random = new Random();
        final String generated = random.ints(start, end + 1)
                .filter(i -> Character.isLetter(i) || Character.isDigit(i))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generated;
    }
}
