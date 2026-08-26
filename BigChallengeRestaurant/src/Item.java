public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double basePrice) {
        this.price = basePrice;
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public String getName() {
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice(){
        return price;
    }

   public double getAdjustedPrice(){
        if(type.equals("DRINK") || type.equals("SIDE")){
            return switch (size){
              case "SMALL" -> getBasePrice() - 0.5;
              case  "LARGE" -> getBasePrice()  + 1;
                default -> price;
            };
        }
        return price;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n",name, price);
    }

    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
