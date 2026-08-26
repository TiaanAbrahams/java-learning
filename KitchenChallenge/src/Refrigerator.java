public class Refrigerator{
    private boolean hasWorkToDo;


    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }else{
            System.out.println("No work has to be done");
        }
    }

    public void setHasWorkToDo(boolean value){
        hasWorkToDo = value;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }

}
