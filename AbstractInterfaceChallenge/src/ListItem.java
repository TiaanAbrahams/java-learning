/**
 next(), setNext(), previous(), setPrevious() and compareTo()
which are package-private and abstract (see child class for declaration).

        -  getValue(), takes no parameters and returns its value.

        -  setValue(), takes an Object and assigns it to value.
 **/
public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object object){
        this.value = object;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
