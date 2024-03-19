package tacos;


import org.springframework.jdbc.core.JdbcTemplate;

public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    private JdbcTemplate jdbc;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public Type getType() { return type; }


    public enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE
    }

    @Override
    public Ingredient findOne(String id)

}
