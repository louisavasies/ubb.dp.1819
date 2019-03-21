/*
package ro.ubb.dp1819;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.ubb.dp1819.vasies.louisa.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.*;


@SpringBootApplication
public class Application implements ApplicationRunner {
    private final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ReadFromFileService readFromFileService = ReadFromFileService.getInstance();
        readFromFileService.setFilename("ingredients.txt");
        InterpreterService interpreterService = InterpreterService.getInstance();

        IngredientFactory ingredientFactory = new IngredientFactory();


        List<String> linesReadFromFile = readFromFileService.readFromFile();
        interpreterService.setData(linesReadFromFile);
        ArrayList<Coffee> interpretedData = interpreterService.interpretData();


        logger.info("read files successfully: " + linesReadFromFile);


        Scanner scanner = new Scanner(in);
        out.println("Enter ingredients to be verified! Ex: 6 cups water + 0.55 cups coffee-beans roasted");

            String readComponents = scanner.nextLine();

            ArrayList<ArrayList<IngredientType>> listsOfIngredientList = new ArrayList<>();

            String[] singleComponentList = readComponents.split("\\+");


            for (String singleList : singleComponentList) {
                ArrayList<IngredientType> singleCombination = new ArrayList<>();

                String[] separateIngredients = singleList.split(" ");

                for (String item : separateIngredients) {
                    */
/*out.println("Item: " + item);*//*

                    if (!item.equals("")) {
                        IngredientType ingredient = ingredientFactory.getIngredient(item);
                        singleCombination.add(ingredient);
                    }
                }
                if (singleCombination.size() != 3 && singleCombination.size() != 4){
                    out.println("3 or 4 ingredients are expected. Input invalid as number of ingredients differ.");
                    return;
                }

                listsOfIngredientList.add(singleCombination);
            }

            for(Coffee existingCoffee : interpretedData){
                if(analyzeInputToCoffee(listsOfIngredientList, existingCoffee)){
                    out.println("Found the coffee that matches the recipe from the input!! \n" +
                                "Your coffee is:     " + existingCoffee.getName());
                    break;
                }
            }

    }



    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

    }




    public static boolean analyzeOneInputListOfIngredientsToOneExistingListOfIngredients(ArrayList<IngredientType> copyOneInputListOfIngredients, ArrayList<IngredientType> copyOneExistingListsOfIngredients){

        if(copyOneExistingListsOfIngredients.size() != copyOneInputListOfIngredients.size())
            return false;
        else{
            int numberOfIngredients = copyOneExistingListsOfIngredients.size();
            int numberOfIdenticalIngredients = 0;
            for(int i = 0; i < numberOfIngredients; i++){
                IngredientType inputIngredient = copyOneInputListOfIngredients.get(i);
                out.println(inputIngredient.toString());
                if(copyOneExistingListsOfIngredients.contains(inputIngredient)){
                    numberOfIdenticalIngredients++;
                    copyOneExistingListsOfIngredients.remove(inputIngredient);
                }
            }
            return(numberOfIngredients == numberOfIdenticalIngredients);
        }
    }

    public static boolean analyzeInputToCoffee(ArrayList<ArrayList<IngredientType>> allInputListsOfIngredients, Coffee coffee){
        ArrayList<ArrayList<IngredientType>> existingListWithListsOfIngredients = coffee.getListsOfIngredientsLists();

        if(allInputListsOfIngredients.size() != existingListWithListsOfIngredients.size())
            return false;
        int numberOfLists = allInputListsOfIngredients.size();
        int numberOfIdenticalLists = 0;

        for(int i = 0; i < numberOfLists; ++i){
            ArrayList<IngredientType> inputList = allInputListsOfIngredients.get(i);
            out.println(i);
            for(ArrayList<IngredientType> existingList : existingListWithListsOfIngredients)
                if( analyzeOneInputListOfIngredientsToOneExistingListOfIngredients(inputList, existingList)){
                    out.println("existingListMatched: " + existingList);
                    numberOfIdenticalLists++;
                    existingListWithListsOfIngredients.remove(inputList);
                }

        }
        return (numberOfIdenticalLists == numberOfLists);
    }
}
*/
