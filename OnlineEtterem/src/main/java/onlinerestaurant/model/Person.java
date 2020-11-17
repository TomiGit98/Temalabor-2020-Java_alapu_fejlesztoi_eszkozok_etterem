package onlinerestaurant.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;


@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String surName;
    private String password;
    private String email;
    private String address;
    @Transient
    private ShoppingCart shoppingCart = new ShoppingCart();

    public Person(String firstName, String surName, String password, String email, String address) {

        this.firstName = firstName;
        this.surName = surName;
        this.password = password;
        this.email = email;
        this.address = address;
    }


    public Person() {
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
