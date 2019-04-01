package ro.ubb.dp1819.vasies.louisa.Lab1.Factory;


import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;

import java.util.List;

/**
 * Created by User on 4/1/2019.
 */

public interface CoffeeFactory {
    Coffee makeCoffee(List<Ingredient> ingredients);
}