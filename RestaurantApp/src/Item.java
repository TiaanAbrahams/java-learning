public class Item {
    private String type;
    private double price;
    private String size = "MEDIUM";
    private String name;


    public  Item(String type, String name, Double price){
        this.type =type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public void setSize(String size){
        this.size = size.toUpperCase();
    }

    public double getBasePrice(){
        return price;
    }

    public String getName(){
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getAdjustedPrice(){
        if(type.equals("SIDE") || type.equals("DRINK")){
            return switch (size){
                case "LARGE" -> getBasePrice() + 1.5;
                case "SMALL" -> getBasePrice() -1;
                default -> getBasePrice();
            };
        }
        return getBasePrice();
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
