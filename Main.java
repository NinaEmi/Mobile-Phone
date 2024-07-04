public class Main {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("92023");

        Contact contact1 = new Contact("Nina", "2892");
        Contact contact2 = new Contact("Emilia", "092892");
        Contact contact3 = new Contact("Ema", "291282");
        Contact contact4 = new Contact("Cristi", "109222892");

        phone1.addNewContact(contact1);
        phone1.addNewContact(contact2);
        phone1.addNewContact(contact3);
        phone1.addNewContact(contact4);

        phone1.printContacts();
        
        Contact newContact = new Contact("Crina", "21212");
        Contact oldContact = new Contact("Nina", "2892");

        Contact contactToRemove = new Contact("Emilia", "092892");
        phone1.updateContact(oldContact, newContact);
        phone1.printContacts();

        phone1.removeContact(contactToRemove);
        phone1.printContacts();

    }
}