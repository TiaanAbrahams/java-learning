public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public void addWater(){
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishwasher(){
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean brewMasterSate, boolean dishWasherSate, boolean iceBoxSate){
        brewMaster = new CoffeeMaker(brewMasterSate);
        dishWasher = new DishWasher(dishWasherSate);
        iceBox = new Refrigerator(iceBoxSate);
    }

    public void doKitchenWork(){
        if(brewMaster.getHasWorkToDo()){
            addWater();
        }

        if(dishWasher.getHasWorkToDo()){
            loadDishwasher();
        }

        if(iceBox.getHasWorkToDo()){
            pourMilk();
        }
    }
}
