package ro.ubb.dp1819.vasies.louisa.Builder;

import ro.ubb.dp1819.vasies.louisa.Builder.EmptyIngredientBuilder;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by User on 3/21/2019.
 */
public class BuilderMain {
    public static void main(String[] args) {
        EmptyIngredientBuilder builder = new EmptyIngredientBuilder();

        Scanner scanner = new Scanner(in);
        out.println("<nr cups water> <nr cups beans> <nr ml milk> <nr oz cocoa>\n");

        String readComponents = scanner.nextLine();
        String[] quantities = readComponents.split(" ");

        ArrayList<String> nrs = new ArrayList<>();

        for(String nr : quantities)
            nrs.add(nr);

        String resultQuery = "";

        if(quantities.length == 2){
            resultQuery = builder
                    .addWater(Integer.valueOf(nrs.get(0)))
                    .addBeans(Double.valueOf(nrs.get(1)))
                    .build();
        }
        else if(quantities.length == 3){
            resultQuery = builder
                    .addWater(Integer.valueOf(nrs.get(0)))
                    .addBeans(Double.valueOf(nrs.get(1)))
                    .addMilk(Integer.valueOf(nrs.get(2)))
                    .build();
        }
        else if(quantities.length == 4){
            resultQuery = builder
                    .addWater(Integer.valueOf(nrs.get(0)))
                    .addBeans(Double.valueOf(nrs.get(1)))
                    .addMilk(Integer.valueOf(nrs.get(2)))
                    .addCocoa(Integer.valueOf(nrs.get(3)))
                    .build();
        }

        System.out.println(resultQuery);
    }
}
