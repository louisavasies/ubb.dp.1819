package ro.ubb.dp1819.vasies.louisa.Builder;



/**
 * Created by User on 3/21/2019.
 */

class AddCocoaBuilder extends  AddIngredientBuilder{
    public String build() {
        return this.getStr();}
}

class AddMilkBuilder extends  AddIngredientBuilder{
    public AddCocoaBuilder addCocoa(int quantity){
        AddCocoaBuilder addCocoaBuilder = new AddCocoaBuilder();
        addCocoaBuilder.setCocoa(quantity);
        addCocoaBuilder.setPrevStr(this.getStr());
        addCocoaBuilder.setStr(String.valueOf(quantity));
        return addCocoaBuilder;
    }
}

class AddBeansBuilder extends  AddIngredientBuilder{
    public AddMilkBuilder addMilk(int quantity){
        AddMilkBuilder addMilkBuilder = new AddMilkBuilder();
        addMilkBuilder.setMilk(quantity);
        addMilkBuilder.setPrevStr(this.getStr());
        addMilkBuilder.setStr(String.valueOf(quantity));
        return addMilkBuilder;
    }
}

class AddWaterBuilder extends AddIngredientBuilder {
    public AddBeansBuilder addBeans(double quantity){
        AddBeansBuilder addBeansBuilder = new AddBeansBuilder();
        addBeansBuilder.setBeans(quantity);
        addBeansBuilder.setPrevStr(this.getStr());
        addBeansBuilder.setStr(String.valueOf(quantity));
        return addBeansBuilder;
    }
}

class EmptyIngredientBuilder extends AddIngredientBuilder{
    public AddWaterBuilder addWater(int quantity){
        AddWaterBuilder addWater = new AddWaterBuilder();
        addWater.setWater(quantity);
        addWater.setStr(String.valueOf(quantity));
        return addWater;
    }

}


class AddIngredientBuilder {
    private String str = "";
    private int water;
    private double beans;
    private int milk;
    private int cocoa;


    public EmptyIngredientBuilder emptyCoffee(){
        EmptyIngredientBuilder emptyIngredientBuilder = new EmptyIngredientBuilder();
        emptyIngredientBuilder.setWater(0);
        emptyIngredientBuilder.setBeans(0);
        emptyIngredientBuilder.setMilk(0);
        emptyIngredientBuilder.setCocoa(0);
        return emptyIngredientBuilder;
    }


    protected void setPrevStr(String prevStr) { this.str = prevStr;}
    protected void setStr(String newStr) {this.str = this.str + " " + newStr;}
    protected String getStr() { return this.str; }

    public String templateQuery() {return " ";}

    public String build() {return this.str;}


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public double getBeans() {
        return beans;
    }

    public void setBeans(double beans) {
        this.beans = beans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCocoa() {
        return cocoa;
    }

    public void setCocoa(int cocoa) {
        this.cocoa = cocoa;
    }
}


