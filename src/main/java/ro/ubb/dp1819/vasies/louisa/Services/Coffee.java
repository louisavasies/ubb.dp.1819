package ro.ubb.dp1819.vasies.louisa.Services;

import java.util.ArrayList;

/**
 * Created by User on 3/21/2019.
 */


public abstract class Coffee{
    protected ArrayList<Ingredient> ingredients;
    abstract void getIngredients();
}

class Espresso extends Coffee{
    @Override
    public void getIngredients(){
        ingredients.add(new Ingredient(Double.valueOf(2), "water"));
        ingredients.add(new Ingredient(0.25, "coffee-beans"));
    }
}

class Cappuccino extends Coffee{
    @Override
    public void getIngredients(){
        ingredients.add(new Ingredient(Double.valueOf(2), "water"));
        ingredients.add(new Ingredient(0.25, "coffee-beans"));
        ingredients.add(new Ingredient(Double.valueOf(100), "foamed"));
    }
}

class Americano extends Coffee{
    @Override
    public void getIngredients(){
        ingredients.add(new Ingredient(Double.valueOf(4), "water"));
        ingredients.add(new Ingredient(0.25, "coffee-beans"));
    }
}

class Latte extends Coffee{
    @Override
    public void getIngredients(){
        ingredients.add(new Ingredient(Double.valueOf(3), "water"));
        ingredients.add(new Ingredient(0.5, "coffee-beans"));
        ingredients.add(new Ingredient(Double.valueOf(100), "foamed"));
        ingredients.add(new Ingredient(Double.valueOf(10), "cocoa"));
    }
}

class getCoffeeFactory{
    public Coffee getCoffee(ArrayList<Ingredient> ingredients){
        if(!(ingredients.size() == 0) && !ingredients.isEmpty() ){
            for(Ingredient i : ingredients){
                if()
            }
        }
    }
}