public class Main {

    public static void main(String[] args){
        /*
        Burger burger = new Burger("Regular",4);
        burger.addToppings("BACON", "CHEESE","MAYO");

        burger.printItem(); // How does the print method work in the Item class if I did not create the
                            // "Burger burger = new Burger("Regular",4); as "Item burger = new Burger("Regular",4);"
        */

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("Bacon","Cheese","Mayo");
        regularMeal.setDrinkSize("Large");
        regularMeal.printItemizedList();
    }
}
