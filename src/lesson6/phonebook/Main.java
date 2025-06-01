package lesson6.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Александр", "+7999999999");
        phoneBook.updatePhoneNumber("Александр", "+79888888888");
        phoneBook.printAllContacts();
        phoneBook.updatePhoneNumber("Илья", "+4666564");
        phoneBook.printAllContacts();
    }

}
