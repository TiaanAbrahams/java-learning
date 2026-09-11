import java.sql.SQLOutput;
import java.util.*;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact number){
       for(Contact c: myContacts){
           if (number.getPhoneNumber() == c.getPhoneNumber()) {
              return false;
           }
       }
       myContacts.add(number);
       return true;
    }

    public boolean updateContact(Contact newContact, Contact oldContact){
        int ind = 0;
        if(myContacts.contains(oldContact)){
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        for(Contact contact: myContacts){
            if(contact.getName().equalsIgnoreCase(oldContact.getName())){
                myContacts.set(ind, newContact);
                ind++;
                return true;
            }
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equalsIgnoreCase(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contact){
        int indx = 0;
        for (Contact con: myContacts){
            if(con.getName().equalsIgnoreCase(contact) || con.getPhoneNumber().equalsIgnoreCase(contact)){
                return indx;
            }
            indx++;
        }
        return -1;
    }
    public Contact queryContact(String contact){
        int indx = 0;
        for (Contact con: myContacts){
            if(con.getName().equalsIgnoreCase(contact) || con.getPhoneNumber().equalsIgnoreCase(contact)){
                break;
            }
            indx++;
        }
        return myContacts.get(indx);
    }

    public void printContacts(){
        int i = 1;
        System.out.println("Contact List:");
        for(Contact contact: myContacts){
            System.out.printf("%d. %s -> %s\n", i, contact.getName(), contact.getPhoneNumber());
            i++;
        }
    }
}


