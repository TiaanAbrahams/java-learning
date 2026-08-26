public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular", "coke","fries" );
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("Drink",drinkType, 1.0);
        this.side = new Item("Side", sideType,1.5);
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("_".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1,String extra2,String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
