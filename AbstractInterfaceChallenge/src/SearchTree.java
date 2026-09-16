public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem current = root;

        while (current != null) {

            int comparison = current.compareTo(newItem);

            if (comparison > 0) {

                if (current.previous() != null) {
                    current = current.previous();
                } else {
                    current.setPrevious(newItem);
                    return true;
                }

            } else if (comparison < 0) {

                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(newItem);
                    return true;
                }

            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item == null){
            return false;
        }

        ListItem current = root;
        ListItem parent = null;

        while (current != null) {

            int comparison = current.compareTo(item);

            if (comparison > 0) {
                parent = current;
                current = current.previous();

            } else if (comparison < 0) {
                parent = current;
                current = current.next();

            } else {
                performRemoval(current, parent);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {

        if (item.previous() == null && item.next() == null) {

            if (parent == null) {
                root = null;
            } else if (parent.previous() == item) {
                parent.setPrevious(null);
            } else {
                parent.setNext(null);
            }

        } else if (item.previous() != null && item.next() == null) {

            if (parent == null) {
                root = item.previous();
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                parent.setNext(item.previous());
            }

        } else if (item.previous() == null) {

            if (parent == null) {
                root = item.next();
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                parent.setNext(item.next());
            }

        } else {

            ListItem replacementParent = item;
            ListItem replacement = item.previous();

            while (replacement.next() != null) {
                replacementParent = replacement;
                replacement = replacement.next();
            }

            if (replacementParent != item) {
                replacementParent.setNext(replacement.previous());
                replacement.setPrevious(item.previous());
            }

            replacement.setNext(item.next());

            if (parent == null) {
                root = replacement;
            } else if (parent.previous() == item) {
                parent.setPrevious(replacement);
            } else {
                parent.setNext(replacement);
            }
        }
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        if (root.previous() != null) {
            traverse(root.previous());
        }

        System.out.println(root.getValue());

        if (root.next() != null) {
            traverse(root.next());
        }
    }
}