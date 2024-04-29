package lecture_nr_17;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class IO {

    public static void main(String[] args) throws IOException {

        File testFile = new File("src/main/java/lecture_nr_17/files/test_file.txt");

        FileReader fileReader = new FileReader(testFile);

        int buff = 0;
        while((buff = fileReader.read()) != -1){

            System.out.print((char) buff);
        }

        System.out.println();

        fileReader.close();

        File testFile1 = new File("src/main/java/lecture_nr_17/files/test_file.txt");

        FileReader fileReader1 = new FileReader(testFile);

        char[] readArray = new char[(int) testFile1.length()];

        fileReader1.read(readArray);

        for(int index = 0; index != readArray.length; index++){
            System.out.print(readArray[index]);
        }

        System.out.println();
        fileReader1.close();

        File testFile2 = new File("src/main/java/lecture_nr_17/files/test_file.txt");

        FileReader fileReader2 = new FileReader(testFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader2);

        BufferedReader example = new BufferedReader(new FileReader("src/main/java/lecture_nr_17/files/test_file.txt"));

        String readString = null;
        while((readString = bufferedReader.readLine()) != null){
            System.out.println(readString);
        }

        System.out.println();
        bufferedReader.close();
        fileReader2.close();

        // Writer

        File fileToWrite = new File("src/main/java/lecture_nr_17/files/file_to_write.txt");
        FileWriter fileWriter = new FileWriter(fileToWrite, true);

        fileWriter.append("Testing the writing of file writer");

        fileWriter.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));

        bufferedWriter.newLine();
        bufferedWriter.write("Writing from the buffered writer!");

        bufferedWriter.close();

        // Files

        // Get a list of files form a certain directory

        System.out.println("------------------ FILE EXERCISES");
        System.out.println("--1");
        File file1 = new File("src/main/java/lecture_nr_17/files");
        if(file1.isDirectory()){

            Arrays.stream(file1.listFiles())
                    .map(e -> e.getName())
                    .forEach(e -> System.out.println(e));
        }

        // Get a list of files which are of .csv type
        System.out.println("--2");
        File file2 = new File("src/main/java/lecture_nr_17/files");
        if(file2.isDirectory()){

            Arrays.stream(file2.listFiles())
                    .map(e -> e.getName())
                    .filter(e -> e.endsWith(".csv"))
                    .forEach(e -> System.out.println(e));
        }

        //Print out if a directory exists
        File file3 = new File("src/main/java/lecture_nr_17/files");
        System.out.println("Does files directory exist? ");
        if(file3.exists()){
            if(file3.isDirectory()){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

        //Print out if a file exists
        File file4 = new File("src/main/java/lecture_nr_17/files/testcsv.csv");
        System.out.println("Does the testcsv.csv file exist? ");
        if(file4.exists()){
            if(file4.isFile()){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

        //Verify that a specific path is a file or a directory
        System.out.println("is this a directory or a file? ");
        if(file4.isDirectory()){
            System.out.println("The path is a directory");
        } else {
            System.out.println("The path is a file");
        }

        //Verify file permissions
        File file5 = new File("src/main/java/lecture_nr_17/files/permissions_check.txt");
        System.out.println("Can I write to file file_to_write.txt " + file5.canWrite());
        System.out.println("Can I read to file file_to_write.txt " + file5.canRead());

        //Read lines from the console and write them into a file

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write something: ");
        String scannedString = scanner.nextLine();

        File file6 = new File("src/main/java/lecture_nr_17/files/scanned_file.txt");
        FileWriter fileWriter1 = new FileWriter(file6);

        fileWriter1.write(scannedString);

        fileWriter1.close();



    }
}
