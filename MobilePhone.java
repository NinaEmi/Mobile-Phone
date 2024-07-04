import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) >= 0){
            System.out.println("The contact already exists!");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact);
        if(oldContactIndex < 0) {
            System.out.println("The contact doesn't exists! It can't be updated!");
            return false;
        }
        myContacts.set(oldContactIndex, newContact);
        System.out.println("The contact was updated!");
        return true;
    }

    public boolean removeContact(Contact contact){
        int indexToRemove = findContact(contact);
        if(indexToRemove < 0){
            System.out.println("The contact doesn't exists, it can't be removed!");
            return false;
        }
        myContacts.remove(indexToRemove);
        System.out.println("The contact was removed!");
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contact){
        for(int i = 0; i <myContacts.size(); i++ ){
            Contact contact1 = myContacts.get(i);
            if(contact1.getName().equals(contact)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        if(findContact(name) >= 0){
            return this.myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }

    }
}
