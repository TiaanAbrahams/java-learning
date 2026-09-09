import java.util.LinkedList;

public class SearchTree implements NodeList{
    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem rootArg) {
        ListItem currentItem;
        if(root == null){
            System.out.println("The list is empty");
            return;
        }

    }


    @Override
    public boolean addItem(ListItem item) {
        ListItem currentItem = root;
        if(root == null){
            root = item;
            return true;
        }

        int compare;
        while(true){
                compare = item.compareTo(currentItem);
                System.out.println("*".repeat(20));
                System.out.println(item.getValue() + " Item");
                System.out.println(currentItem.getValue() + " currentItem");
                System.out.println("*".repeat(20));

                if (currentItem.next() != null && compare > 0){
                    System.out.println("Moving right");
                    currentItem = currentItem.next();
                    continue;
                }
                if(currentItem.previous() != null && compare < 0){
                    System.out.println("Moving to the left");
                    currentItem = currentItem.previous();
                    continue;
                }
                if(currentItem.next() == null && compare > 0){
                    System.out.println("compare > 0");
                    currentItem.setNext(item);
                    return true;
                }
                if(currentItem.previous() == null && compare < 0){
                    System.out.println("compare < 0");
                    currentItem.setPrevious(item);
                    return true;
                }
            if (compare == 0) {
                return false;
            }
        }

    }
}

//SearchTree (concrete class)
//
//    -  It implements NodeList.
//
//    -  It has one field of type ListItem called root.
//
//    -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
//
//    -  And five methods:
//
//        -  getRoot(), getter for root.
//
//        -  addItem(), similar to MyLinkedList. See second TIP below.
//
//        -  removeItem(), same as MyLinkedList.
//
//        -  performRemoval(), takes two ListItems, the item to be removed and its parent.
//           It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.
//
//        -  traverse(), takes the root as an argument and does not return anything.
//           It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.

//TIP:  The rules for adding an item to the linked tree are:
//If the head of the tree is null, make the head refer to the item to be added.
//If the item to be added is less than the current item in the tree,
//add the item before the current item (i.e., make the previous item's "next" refer to the new item,
//        and the new item's "next" refer to the current item).
//        If the item to be added is greater than the current item, move onto the next item and compare again
//                                              (if there is no next item, then that is where the new item belongs).
//
//TIP:  When adding items to a Binary Search Tree, if the item to be added is less than the current item, then move to the left.
//If it is greater than the current item, then move to the right.
//The new item is added when an attempt to move in the required direction would involve following a null reference.
//        Once again, duplicates are not allowed.
//
//        TIP:  Inorder = print the previous node, then the parent node, and then the next node (left -> node -> right).
//
//
//
//TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
//
//TIP:  Be extremely careful about spaces and spelling in the printed output from the traverse() method.
//
