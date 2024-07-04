public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String namePerson, String phoneNumber){
        return new Contact(namePerson, phoneNumber);
    }

  @Override
    public boolean equals(Object obj){
      if(this == obj){
          return true;
      } else if(obj == null || getClass() != obj.getClass()){
          return false;
      }
      Contact contact = (Contact) obj;
      return name.equals(contact.name) && phoneNumber.equals(contact.phoneNumber);
  }
}
