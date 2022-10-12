package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraToppings;
    private final int paperbag;

    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isPaperBagAdded = false;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        this.extraCheese = 80;
        this.paperbag = 20;
        if (isVeg) {
            price = 300;
            extraToppings = 70;
        } else {
            extraToppings = 120;
            price = 400;
        }
        bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if(!this.isCheeseAdded) {
            this.price += this.extraCheese;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if(!this.isToppingsAdded) {
            this.price += this.extraToppings;
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if(!this.isPaperBagAdded) {
            this.price += this.paperbag;
            this.isPaperBagAdded = true;
        }
    }

    public String getBill() {
        // your code goes here
        if(!this.isBillGenerated) {
            this.isBillGenerated = true;

            if(this.isCheeseAdded) {
                this.bill = this.bill + "Extra Cheese Added: "+this.extraCheese+"\n";
            }
            if(this.isToppingsAdded) {
                this.bill = this.bill + "Extra Toppings Added: "+this.extraToppings+"\n";
            }
            if(this.isPaperBagAdded) {
                this.bill = this.bill + "Paperbag Added: "+this.paperbag+"\n";
            }
            this.bill = this.bill + "Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
