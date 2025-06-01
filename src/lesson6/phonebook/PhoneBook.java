package lesson6.phonebook;

import java.util.*;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public String findPhoneNumberByName(String name) {
        return contacts.get(name);
    }

    public boolean removeContact(String name) {
        return contacts.remove(name) != null;
    }

    public void updatePhoneNumber(String name, String newPhoneNumber) {
        contacts.replace(name, newPhoneNumber);
    }

    public void printAllContacts() {
        Set<String> sortedNames = contacts.keySet();
        for (String name : sortedNames) {
            System.out.println(name + ": " + contacts.get(name));
        }
    }
}
