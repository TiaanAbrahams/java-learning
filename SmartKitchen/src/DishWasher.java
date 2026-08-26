public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }

    public void doDishes(){
        System.out.println("The dishwasher is doing dishes");
    }
}
