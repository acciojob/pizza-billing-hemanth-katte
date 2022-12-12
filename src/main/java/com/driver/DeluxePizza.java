package com.driver;

public class DeluxePizza extends Pizza {

    public boolean isVeg;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        //if(isVeg)
           // super.price = 300;
        //else
           // super.price = 400;
        this.addExtraCheese();
        this.addExtraToppings();


    }
}
