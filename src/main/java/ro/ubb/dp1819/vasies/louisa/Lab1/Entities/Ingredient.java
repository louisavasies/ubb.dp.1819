package ro.ubb.dp1819.vasies.louisa.Lab1.Entities;

import java.util.Objects;

/**
 * Created by User on 4/1/2019.
 */
public class Ingredient {
    private Double quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public Ingredient(Double quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
    }

    public Ingredient(Double quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        if (adjective != null)
            return "Ingredient{" +
                    "quantity = " + quantity +
                    ", unit = '" + unit + '\'' +
                    ", ingredient = '" + ingredient + '\'' +
                    ", adjective = '" + adjective + '\'' +
                    '}';
        else
            return "Ingredient{" +
                    "quantity = " + quantity +
                    ", unit = '" + unit + '\'' +
                    ", ingredient = '" + ingredient + '\'' +
                    '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient that = (Ingredient) o;
        return quantity.equals(that.quantity) &&
                unit.equals(that.unit) &&
                ingredient.equals(that.ingredient) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, ingredient, adjective);
    }
}
