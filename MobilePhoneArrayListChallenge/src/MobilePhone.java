import java.sql.SQLOutput;
import java.util.*;

public class MobilePhone {
    Contact contact;
   private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact number){
        for (Contact contact: myContacts){
            if(contact == number){
                return false;
            }
            break;
        }
        myContacts.add(number);
        return myContacts.contains(number);
    }

    public boolean updateContact(Contact newContact, Contact oldContact){
        if(myContacts.contains(oldContact)){
            myContacts.add(myContacts.indexOf(oldContact), newContact);
            return true;
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

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public int findContact(String contact){
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
