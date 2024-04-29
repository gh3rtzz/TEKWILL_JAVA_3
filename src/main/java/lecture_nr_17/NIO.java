package lecture_nr_17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIO {

    public static void main(String[] args) throws IOException {

        Path file = Path.of("src/main/java/lecture_nr_17/files/test_file.txt");
        String readFile1 = Files.readString(file);

        System.out.println(readFile1);

        Files.writeString(file, "Writing from nio method", StandardOpenOption.APPEND);

        //Need to copy the file to another directory
        Path copyFilePath = Path.of("src/main/java/lecture_nr_17/copyFile/copiedFile.txt");

        if(!Files.exists(copyFilePath))
            Files.copy(file, copyFilePath);



    }
}
