public class MealOrder {
    Burger burger;
    Item side;
    Item drink;
    public MealOrder(){
        this("regular", "coke", "fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType){
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxBurger(burgerType, 8.0);
        }else {
            this.burger = new Burger(burgerType, 4.00);
        }
        this.drink = new Item(drinkType, "drink", 1.0);
        this.side = new Item(sideType, "side", 1.50);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxBurger){
            return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice() + side.getAdjustedPrice() + drink.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        if(burger instanceof DeluxBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        System.out.printf("%20s:%6.2f%n","TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String topping_1, String topping_2, String topping_3){
        burger.addTopping(topping_1, topping_2, topping_3);
    }
    public void addBurgerToppings(String topping_1, String topping_2, String topping_3,
                                  String topping_4, String topping_5){
        if(burger instanceof DeluxBurger db){
            db.addTopping(topping_1,topping_2,topping_3,topping_4,topping_5);
        }else {
            burger.addTopping(topping_1, topping_2, topping_3);
        }
    }


    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    public void setSideSize(String size){
        side.setSize(size);
    }
}
