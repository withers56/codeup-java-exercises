package fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathsAndFilesLec {

    public static void main(String[] args) {

//        String userDirectory = "files";
//        String userFile = "new-file.txt";
//
//        Path pathToFileNewFile = Paths.get(userDirectory, userFile);

        Path dataDirectory = Paths.get("data");
        Path dataFile = Paths.get("data", "info.txt");

        try{
            if (!(Files.exists(dataDirectory))) {
                Files.createDirectory(dataDirectory);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            if (!(Files.exists(dataFile))) {
                Files.createFile(dataFile);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        //write some stuff to data/info.txt
        List<String> fruit = new ArrayList<>(Arrays.asList("apple", "grape", "orange"));
        ArrayList<String> moreFruit = new ArrayList<>(Arrays.asList("raspberry", "plum", "banana"));

        try{
            Files.write(dataFile, fruit);//overwrites by defalut, 2 arguments
            Files.write(dataFile, moreFruit, StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        fruit.clear();
        System.out.println("Fruit array empty? " + fruit.isEmpty());

        //read in fruit from the data file

        try{
            fruit = Files.readAllLines(dataFile);

            //replace grape with strawberry

            int replaceIndex = fruit.indexOf("grape");
            fruit.remove(replaceIndex);
            fruit.add(replaceIndex, "strawberry");
            Files.write(dataFile, fruit);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(fruit);











//        try{
//            if (!(Files.exists(pathToFileNewFile))) {
//                Files.createFile(pathToFileNewFile);
//            }
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }



    }
}
