public class Main {
    static void main(String[] args) {
        Contact contact = new Contact("Tiaan", "081 354 8598");
        Contact contact2 = new Contact("Ruan", "081 323 8000");

        MobilePhone mobilePhone = new MobilePhone("081 234 5678");

        mobilePhone.addNewContact(contact);
        mobilePhone.addNewContact(contact2);


        Contact newRuan = Contact.createContact("Ruan", "081 323 8001");
        System.out.println(mobilePhone.addNewContact(contact2));

        System.out.println(mobilePhone.updateContact(newRuan, newRuan));
        mobilePhone.printContacts();
    }
}
