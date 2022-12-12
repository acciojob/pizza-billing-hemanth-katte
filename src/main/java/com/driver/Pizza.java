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
        this.bill = "Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //check if extra cheese is added or not already
        if(this.cheeseFlag == false) {
            this.price += this.cheese;
            this.cheeseFlag = true; //added the cheese
        }
    }

    public void addExtraToppings(){
        // your code goes here
        //check if extra toppings is added already or not

        if(this.toppingsFlag == false){
            if(isVeg)
                this.price+=this.toppings;
            else
                this.price+=this.toppings;
            this.toppingsFlag = true; //toppings added
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.takeAwayFlag == false){
            this.price+=this.takeAway;
            this.takeAwayFlag = true;
        }

    }

    public String getBill(){
        // your code goes here
       // String ret = "";
        if(this.isBillGenerated == false) {

            if (this.cheeseFlag)
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            if (this.toppingsFlag) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (this.takeAwayFlag)
                this.bill += "Paperbag Added: " + this.takeAway + "\n";
            this.bill+="Total Price: "+ this.price +"\n";
            isBillGenerated = true;

        }


        return this.bill;
    }
}
