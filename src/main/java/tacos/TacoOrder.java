package tacos;

import lombok.Data;

import java.util.List;
import java.util.ArrayList;


@Data
public class TacoOrder {
    protected String deliveryName;
    protected String deliveryStreet;
    protected String deliveryCity;
    protected String deliveryState;
    protected String deliveryZip;
    protected String ccNumber;
    protected String ccExpiration;
    protected String ccCVV;
    protected List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
