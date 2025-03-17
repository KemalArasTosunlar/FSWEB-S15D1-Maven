package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    // 1. Constructor (tek parametreli)
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    // 2. Constructor (iki parametreli, testte kullanılıyor)
    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    // Getter
    public List<Contact> getMyContacts() {
        return myContacts;
    }

    // Yeni kişi ekle
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false; // Zaten varsa ekleme
        }
        myContacts.add(contact);
        return true;
    }

    // Kişiyi güncelle
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index < 0) return false; // Bulunamadıysa
        myContacts.set(index, newContact);
        return true;
    }

    // Kişiyi sil
    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) return false;
        myContacts.remove(index);
        return true;
    }

    // Contact objesiyle kişi arama
    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // İsme göre kişi arama
    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1; // Bulunamadı
    }

    // İsme göre kişiyi döndür
    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null; // Bulunamadı
    }
}
