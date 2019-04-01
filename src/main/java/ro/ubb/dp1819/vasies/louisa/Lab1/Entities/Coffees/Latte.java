package ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffees;

import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 4/1/2019.
 */
public class Latte extends Coffee {
    public static List<Ingredient> getStandardIngredients() {
        return Arrays.asList(twoWater, quarterBeansRoasted, hundredMilkSteamed);
    }

    @Override
    public String drink() {
        return "Latte";
    }
}
