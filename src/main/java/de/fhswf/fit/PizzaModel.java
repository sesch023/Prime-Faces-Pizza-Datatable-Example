package de.fhswf.fit;

import java.io.Serializable;

public class PizzaModel implements Serializable {
    private long pizzaID;
    private String pizzaName;
    private int pizzaSize;
    private double pizzaPrice;
    private String pizzaDescription;
    private String customerName;
    private String customerStreet;
    private String customerCity;

    public PizzaModel() {
    }

    public PizzaModel(long pizzaID, String pizzaName, int pizzaSize, double pizzaPrice, String pizzaDescription,
                      String customerName, String customerStreet, String customerCity) {
        this.pizzaID = pizzaID;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.pizzaPrice = pizzaPrice;
        this.customerName = customerName;
        this.customerStreet = customerStreet;
        this.customerCity = customerCity;
        this.pizzaDescription = pizzaDescription;
    }

    public long getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(long pizzaID) {
        this.pizzaID = pizzaID;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getPizzaDescription() {
        return pizzaDescription;
    }

    public void setPizzaDescription(String pizzaDescription) {
        this.pizzaDescription = pizzaDescription;
    }
}
