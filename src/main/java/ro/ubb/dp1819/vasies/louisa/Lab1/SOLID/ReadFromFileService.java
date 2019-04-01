package ro.ubb.dp1819.vasies.louisa.Lab1.SOLID;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by User on 4/1/2019.
 */
public class ReadFromFileService {
    public static List<String> readLines(String filename){
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            throw new CoffeeException(e.getMessage());
        }
    }
}
