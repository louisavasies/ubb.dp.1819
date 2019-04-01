package ro.ubb.dp1819.vasies.louisa.Lab1.Entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 4/1/2019.
 */
public abstract class Coffee implements Drinkable {
    protected static Ingredient twoWater = new Ingredient(2.0d, "cups", "water");
    protected static Ingredient fourWater = new Ingredient(4.0d, "cups", "water");
    protected static Ingredient quarterBeansRoasted = new Ingredient(0.25d, "cups", "coffee-beans", "roasted");
    protected static Ingredient hundredMilkSteamed = new Ingredient(100d, "ml", "milk", "steamed");
    protected static Ingredient hundredMilkFoamed = new Ingredient(100d, "ml", "milk", "foamed");

    private List<Ingredient> ingredients = new ArrayList<>();

    static List<Ingredient> getBasicIngredients(){
        return Collections.emptyList();
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void addIngredient(Ingredient i){
        ingredients.add(i);
    }
}
