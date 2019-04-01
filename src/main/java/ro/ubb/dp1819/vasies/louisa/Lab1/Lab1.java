package ro.ubb.dp1819.vasies.louisa.Lab1;

import ro.ubb.dp1819.vasies.louisa.Lab1.Builder.CoffeeBuilder;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;
import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Ingredient;
import ro.ubb.dp1819.vasies.louisa.Lab1.Factory.CoffeeFactory;
import ro.ubb.dp1819.vasies.louisa.Lab1.Factory.StarbucksCoffeeFactory;
import ro.ubb.dp1819.vasies.louisa.Lab1.SOLID.IngredientService;
import ro.ubb.dp1819.vasies.louisa.Lab1.SOLID.ReadFromFileService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 4/1/2019.
 */

public class Lab1 {
    public static void main(String[] args){
        List<String> lines = ReadFromFileService.readLines("ingredients.txt");
        for(String line : lines)
            System.out.println(line);

        System.out.println("\n\n");

        List<Ingredient> ingredients = IngredientService.interpretIngredients(lines);
        for(Ingredient i : ingredients)
            System.out.println(i.toString());

        System.out.println("\n\n\n\n");

        Ingredient twoWater = new Ingredient(2.0d, "cups", "water");
        Ingredient fourWater = new Ingredient(4.0d, "cups", "water");
        Ingredient quarterBeansRoasted = new Ingredient(0.25d, "cups", "coffee-beans", "roasted");
        Ingredient hundredMilkSteamed = new Ingredient(100d, "ml", "milk", "steamed");
        Ingredient hundredMilkFoamed = new Ingredient(100d, "ml", "milk", "foamed");

        CoffeeFactory coffeeFactory = new StarbucksCoffeeFactory();
        Coffee brewedCoffee = coffeeFactory.makeCoffee(null);
        System.out.println(brewedCoffee.getClass().getSimpleName() + " ---> " + brewedCoffee.drink());
        Coffee brewedCoffee2 = coffeeFactory.makeCoffee(Arrays.asList(twoWater, quarterBeansRoasted, hundredMilkSteamed));
        System.out.println(brewedCoffee2.getClass().getSimpleName() + " ---> " + brewedCoffee2.drink());

        System.out.println("\n\n\n\n");

        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();



        Coffee coffee = coffeeBuilder
                .ingredient(twoWater)
                .ingredient(quarterBeansRoasted)
                .build();

        System.out.println(coffee.drink());
    }
}
