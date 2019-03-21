package ro.ubb.dp1819.vasies.louisa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by User on 3/20/2019.
 */
public class ReadFromFileService {
    private static ReadFromFileService INSTANCE;
    private String filename;

    public ReadFromFileService(){
    }

    public static ReadFromFileService getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ReadFromFileService();
        }

        return INSTANCE;
    }

    public static ReadFromFileService getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(ReadFromFileService INSTANCE) {
        ReadFromFileService.INSTANCE = INSTANCE;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<String> readFromFile(){
        List<String> linesAsList = new ArrayList<>();
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(this.filename));
            String line = bufferedReader.readLine();
            while(line != null){
                linesAsList.add(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch(IOException e){
            e.printStackTrace();
        }

        //System.out.println(linesAsList);
        return linesAsList;
    }
}
