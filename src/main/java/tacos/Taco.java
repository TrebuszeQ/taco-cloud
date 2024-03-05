package tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Taco {
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
    public Taco(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
}
