package tacos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.CreditCardNumber;

public class Order {

    public Order() {}

    @Size(min=4, message="Your first name and surname is required.")
    private String name;

    @Size(min=4, message="Your street is required.")
    private String street;

    @Size(min=3, message="Your state is required to be 3 characters minimum.")
    private String state;

    @Size(min=3, message="Your city is required to be 3 characters minimum..")
    private String city;

    @Size(min=5, max=5, message="Your zip code is required to be exactly 5 characters.")
    private String zip;

    @CreditCardNumber(message="Provided credit card number is not valid.")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]1[0-2])([\\/])([1-9][0-9])$", message="Value is not in the MM/RR pattern.")
    private String ccExpiration;

    private String ccCVV;

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setStreet(String street) { this.street = street; }

    public String getStreet() { return this.street; }

    public void setCity(String city) { this.city = city; }

    public String getCity() { return this.city; }

    public void setState(String state) { this.state = state; }

    public String getState(String state) { return this.state; }

    public void setZip(String zip) { this.zip = zip; }

    public String getZip() { return this.zip; }

    public void setCcNumber(String ccNumber) { this.ccNumber = ccNumber; }

    public String getCcNumber() { return this.ccNumber; }

    public void setCcExpiration(String ccExpiration) { this.ccExpiration = ccExpiration; }

    public String getCcExpiration() { return this.ccExpiration; }

    public void setCcCVV(String ccCVV) { this.ccCVV = ccCVV; }

    public String getCcCVV() { return this.ccCVV; }
}
