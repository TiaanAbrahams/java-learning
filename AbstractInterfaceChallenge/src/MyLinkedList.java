public class MyLinkedList implements NodeList{
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot(){
        return root;
    }

    public boolean addItem(ListItem item){
        ListItem currentItem = root;
        int comp;

        // Add item if list is empty
        if(currentItem == null){
            root = item;
            return true;
        }

        while(true){
            System.out.println("#".repeat(20));
            System.out.println("Loop current item " + currentItem.getValue());

            comp = item.compareTo(currentItem);

            // Add after currentItem if currentItem is the last node
            if(currentItem.next() == null && comp > 0){
                System.out.println(item.getValue() + " added after " + currentItem.getValue());

                currentItem.setNext(item);
                item.setPrevious(currentItem);

                return true;
            }

            // Add before the root
            if(currentItem.previous() == null && comp < 0){
                System.out.println(item.getValue() + " added before root");

                currentItem.setPrevious(item);
                item.setNext(currentItem);
                root = item;

                return true;
            }

            // Add before currentItem somewhere in the middle
            if(currentItem.previous() != null && comp < 0){
                System.out.println(item.getValue() + " added before " + currentItem.getValue());

                ListItem previousItem = currentItem.previous();

                previousItem.setNext(item);
                item.setPrevious(previousItem);

                item.setNext(currentItem);
                currentItem.setPrevious(item);

                return true;
            }

            // Duplicate
            if(comp == 0){
                return false;
            }

            System.out.println("Item name: " + item.getValue());

            if(currentItem.next() == null){
                break;
            }

            currentItem = currentItem.next();
        }

        return false;
    }

    @Override
    public void removeItem(ListItem item) {
        ListItem currentItem = root;
        ListItem previousItem = null;
        int num = 0;
        while(true){
            if(item.getValue().equals(currentItem.getValue())){
                if (currentItem.previous() == null){
                    root = currentItem.next();
                } else if (currentItem.next() == null) {
                    currentItem.previous().setNext(null);
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                }
                System.out.println(item.getValue() + " Deleted");
            }
            if(currentItem.next() == null){
                break;
            }
            currentItem = currentItem.next();
        }
    }

    @Override
    public void traverse() {
        ListItem currentItem = root;

        do{
            System.out.println(currentItem.getValue());
            currentItem = currentItem.next();
        }
            while(currentItem != null);
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