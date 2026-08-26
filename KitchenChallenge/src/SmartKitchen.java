public class SmartKitchen {
    Refrigerator iceBox;

    public SmartKitchen(){
         iceBox = new Refrigerator();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean refigeratorFlag){
        iceBox.setHasWorkToDo(refigeratorFlag);
    }

    public void doKitchenStuff(){
        iceBox.orderFood();
    }
}
