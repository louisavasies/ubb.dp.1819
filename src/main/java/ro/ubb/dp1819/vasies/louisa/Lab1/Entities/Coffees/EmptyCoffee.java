package ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffees;

import ro.ubb.dp1819.vasies.louisa.Lab1.Entities.Coffee;

/**
 * Created by User on 4/1/2019.
 */
public class EmptyCoffee extends Coffee {
    @Override
    public String drink() {
        return "Empty Coffee";
    }
}
