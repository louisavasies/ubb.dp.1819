package ro.ubb.dp1819.vasies.louisa.Services;

/**
 * Created by User on 3/21/2019.
 */
public class Ingredient {
    private Double quantity;
    private String ingredient;


    public Ingredient() {
    }

    public Ingredient(Double quantity, String ingredient) {
        this.quantity = quantity;
        this.ingredient = ingredient;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }



    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        return ingredient != null ? ingredient.equals(that.ingredient) : that.ingredient == null;
    }

    @Override
    public int hashCode() {
        int result = quantity != null ? quantity.hashCode() : 0;
        result = 31 * result + (ingredient != null ? ingredient.hashCode() : 0);
        return result;
    }
}
