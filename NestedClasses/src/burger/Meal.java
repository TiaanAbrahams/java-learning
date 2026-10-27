package burger;

public class Meal {
    private double base = 5.0;
    private Item burger;
    private Item drink;
    private Item side;

    public Meal(){
        burger = new Item("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);//direct access to item attributes
        side = new Item("fries", "side", 2.0);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n".formatted(burger, drink, side);
    }

    private class Item{
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equalsIgnoreCase("burger")? base: 0); //setting base price if the type is burger else 0
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.price = price;
            this.type = type;
        }

        @Override
        public String toString() {
            return "%10s %15s R%.2f".formatted(name, type, price);
        }
    }


}
