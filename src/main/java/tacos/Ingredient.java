package tacos;

public class Ingredient {
    protected final String id;
    protected final String name;
    protected final IngredientType type;

    public Ingredient(String id, String name, IngredientType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
