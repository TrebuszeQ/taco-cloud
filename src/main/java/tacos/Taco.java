package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

public class Taco {
    @NotNull

    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
    public Taco() { }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public List<String> getIngredients() { return this.ingredients; }

}
