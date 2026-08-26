public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }

    public void brewCoffee(){
        System.out.println("The coffee maker is brewing coffee");
    }
}
