package ro.ubb.dp1819.vasies.louisa.Services;

import ro.ubb.dp1819.vasies.louisa.Services.Ingredient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 3/20/2019.
 */
public class InterpreterService {
    private static InterpreterService INSTANCE;
    private List<String> data;

    public InterpreterService() {
    }

    public static InterpreterService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InterpreterService();
        }

        return INSTANCE;
    }

    public static InterpreterService getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(InterpreterService INSTANCE) {
        InterpreterService.INSTANCE = INSTANCE;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public ArrayList<Ingredient> interpretData() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();

        for(String line : this.data){
            String[] words = line.split(" ");
            Double quantity = Double.valueOf(words[0]);
            String name = words[2];
            Ingredient ingredient = new Ingredient(quantity, name);
            ingredients.add(ingredient);
        }

        return ingredients;
    }
}






