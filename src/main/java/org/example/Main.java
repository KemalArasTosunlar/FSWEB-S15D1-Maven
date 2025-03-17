package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        // Hatalı satır: Contact.createContact yok
        // contactList.add(Contact.createContact("Ahmet", "055555555"));
        // contactList.add(Contact.createContact("Mehmet", "054444444"));

        MobilePhone myPhone = new MobilePhone("050000000", contactList);

        // Hatalı satır: myPhone.printContacts yok
        // myPhone.printContacts();

        // Hatalı satır: Contact.createContact yok
        // Contact newContact = Contact.createContact("Ayşe", "053333333");
        // myPhone.addNewContact(newContact);

        // Hatalı satır: myPhone.printContacts yok
        // myPhone.printContacts();

        // myPhone.removeContact(newContact);
        // myPhone.printContacts();
    }
}
