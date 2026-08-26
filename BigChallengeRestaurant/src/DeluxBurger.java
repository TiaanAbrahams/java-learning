public class DeluxBurger extends Burger{
    Item delux1;
    Item delux2;

    public DeluxBurger(String name, double price){
        super(name, price);
    }

    public void addTopping(String extra1, String extra2, String extra3,
                           String extra4, String extra5) {
        super.addTopping(extra1, extra2, extra3);
        delux1 = new Item(extra4,"Topping",0);
        delux2 = new Item(extra5, "Topping", 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(delux1 != null){
            delux1.printItem();
        }
        if(delux2 != null){
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String topping) {
        return super.getExtraPrice(topping);
    }
}
