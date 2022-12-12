package com.driver;

public class Pizza {

    public int price;
    private Boolean isVeg;
    private String bill;

    public boolean toppingsFlag;

    public boolean cheeseFlag;

    public boolean takeAwayFlag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price = 300;
        else
            price = 400;
        toppingsFlag = false;
        cheeseFlag = false;
        takeAwayFlag = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        //check if extra cheese is added or not already
        if(cheeseFlag == false) {
            price += 80;
            cheeseFlag = true; //added the cheese
        }
    }

    public void addExtraToppings(){
        // your code goes here
        //check if extra toppings is added already or not
        if(toppingsFlag == false){
            if(isVeg)
                price+=70;
            else
                price+=120;
            toppingsFlag = true; //toppings added
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAwayFlag == false){
            price+=20;
            takeAwayFlag = true;
        }

    }

    public String getBill(){
        // your code goes here
       // String ret = "";
        if(isVeg)
            bill = "Base Price Of The Pizza: 300 \n";
        else
            bill = "Base Price Of The Pizza: 400 \n";
        if(cheeseFlag)
            bill+= "Extra Cheese Added: 80 \n";
        if(toppingsFlag){
            if(isVeg)
                bill+="Extra Toppings Added: 70 \n";
            else
                bill+= "Extra Toppings Added: 120 \n";
        }
        if(takeAwayFlag)
            bill+= "Paperbag Added: 20 \n";
        bill+= "Total price: " + price;




        return this.bill;
    }
}
