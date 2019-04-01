package ro.ubb.dp1819.vasies.louisa.Lab1.Factory;


import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffees.*;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;

import java.util.List;

/**
 * Created by User on 4/1/2019.
 */
public class StarbucksCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee makeCoffee(List<Ingredient> ingredients) {
        if (ingredients == null)
            return new EmptyCoffee();
        else if (ingredients.equals(Espresso.getStandardIngredients()))
            return new Espresso();
        else if (ingredients.equals(Cappuccino.getStandardIngredients()))
            return new Cappuccino();
        else if (ingredients.equals(Americano.getStandardIngredients()))
            return new Americano();
        else if (ingredients.equals(Latte.getStandardIngredients()))
            return new Latte();
        else
            return new EmptyCoffee();
    }
}
