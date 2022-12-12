package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg)
            super.price = 500;
        else
            super.price = 600;
        super.cheeseFlag = true;
        super.toppingsFlag = true;


    }
}
