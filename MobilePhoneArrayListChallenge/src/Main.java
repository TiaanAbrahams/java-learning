//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact tiaan = new Contact("Tiaan", "081 354 8598");
        Contact sharon = new Contact("Sharon", "083 231 9086");
        MobilePhone phone = new MobilePhone("081 354 8598");
        phone.addNewContact(sharon);
        phone.addNewContact(tiaan);
        phone.addNewContact(sharon);
        phone.printContacts();

        System.out.println(phone.queryContact("sharon"));
    }
}