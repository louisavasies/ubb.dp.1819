package ro.ubb.dp1819.vasies.louisa.Lab1.Builder;

import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffees.EmptyCoffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;

/**
 * Created by User on 4/1/2019.
 */

public class CoffeeBuilder {
    private Coffee coffee = new EmptyCoffee();

    public CoffeeBuilder ingredient(Ingredient ingredient) {
        coffee.addIngredient(ingredient);
        return this;
    }

    public Coffee build() {
        return coffee;
    }
}