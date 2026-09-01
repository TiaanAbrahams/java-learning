public class MyLinkedList implements NodeList{
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot(){
        return root;
    }

    public boolean addItem(ListItem item){
        return true;
    }

    @Override
    public void removeItem() {
        System.out.println("remover item called");
    }

    @Override
    public void traverse() {
        System.out.println("tracerse method called");
    }
}
/**
 MyLinkedList (concrete class)
 -  It implements NodeList.
 -  It has one field of type ListItem called root.
 -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
 -  And four methods:
 -  getRoot(), getter for root.
 -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
    If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
 -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
 -  traverse(), takes the root as an argument and does not return anything.
    If the root is null it prints out: The list is empty, otherwise print each value on a separate line.
 **/