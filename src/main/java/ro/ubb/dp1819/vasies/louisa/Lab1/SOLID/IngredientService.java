package ro.ubb.dp1819.vasies.louisa.Lab1.SOLID;

import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 4/1/2019.
 */
public class IngredientService {
    public static List<Ingredient> interpretIngredients(List<String> data){
        List<Ingredient> ingredients = new ArrayList<>();

        for(String line : data){
            List<String> splitted = Arrays.asList(line.split(" "));
            if(splitted.size() < 3)
                throw new CoffeeException("Invalid number of words");

            Double quantity;
            String unit;
            String ingredient;

            quantity = Double.parseDouble(splitted.get(0));
            unit = splitted.get(1);
            ingredient = splitted.get(2);

            if(splitted.size() == 3)
                ingredients.add(new Ingredient(quantity, unit, ingredient));
            else{
                String adjective;
                adjective = splitted.get(3);
                ingredients.add(new Ingredient(quantity, unit, ingredient, adjective));
            }

        }

        return ingredients;
    }
}
