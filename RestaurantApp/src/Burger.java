public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super("Burger", name.toUpperCase(), price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null)? 0 : extra1.getAdjustedPrice())+ //Not sure how extra1.getAdjustedPrice works with the Item class method
                ((extra2 == null)? 0 : extra2.getAdjustedPrice())+
                ((extra3 == null)? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String topping){
        return switch (topping.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1)); //With my understanding im creating an new topping item object
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("Topping", extra3, getExtraPrice(extra3));
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("_".repeat(30));
        super.printItem();
    }

    public void printItemizedList(){
        printItem("Base Burger", getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }


    }
}
