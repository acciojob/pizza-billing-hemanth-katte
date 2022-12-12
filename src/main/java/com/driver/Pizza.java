package com.driver;

public class Pizza {

    public int price;
    private Boolean isVeg;
    private String bill;

    public boolean toppingsFlag;

    public boolean cheeseFlag;

    public boolean takeAwayFlag;

    public boolean isBillGenerated;

    private int toppings;

    private int cheese;

    private int takeAway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.toppingsFlag = false;
        this.cheeseFlag = false;
        this.takeAwayFlag = false;
        this.isBillGenerated = false;
        this.cheese = 80;
        this.takeAway = 20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //check if extra cheese is added or not already
        if(cheeseFlag == false) {
            price += cheese;
            cheeseFlag = true; //added the cheese
        }
    }

    public void addExtraToppings(){
        // your code goes here
        //check if extra toppings is added already or not

        if(toppingsFlag == false){
            if(isVeg)
                price+=toppings;
            else
                price+=toppings;
            toppingsFlag = true; //toppings added
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAwayFlag == false){
            price+=takeAway;
            takeAwayFlag = true;
        }

    }

    public String getBill(){
        // your code goes here
       // String ret = "";
        if(isBillGenerated == false) {
            if (isVeg)
                bill = "Base Price Of The Pizza: 300" + "\n";
            else
                bill = "Base Price Of The Pizza: 400" + "\n";
            if (cheeseFlag)
                bill += "Extra Cheese Added: 80" + "\n";
            if (toppingsFlag) {
                if (isVeg)
                    bill += "Extra Toppings Added: 70" + "\n";
                else
                    bill += "Extra Toppings Added: 120" + "\n";
            }
            if (takeAwayFlag)
                bill += "Paperbag Added: 20" + "\n";
            bill += "Total Price: " + price;
            isBillGenerated = true;

        }


        return this.bill;
    }
}
