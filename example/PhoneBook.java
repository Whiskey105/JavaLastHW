package org.example;

import java.util.*;

public class PhoneBook {
    private Map <String, Contact> contactMap;

    public PhoneBook() {
        contactMap = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){
        if (contactMap.containsKey(name)){
            contactMap.get(name).addPhoneNumber(phoneNumber);
        } else {
            Contact contact = new Contact(name, phoneNumber);
            contactMap.put(name, contact);
        }
    }

    public void removeContact (String name){
        if (contactMap.containsKey(name)){
            contactMap.remove(name);
        } else {
            System.out.println("Контакта с данным именен нет! Проверьте корректность ввода.");
        }
    }

    public void removePhoneNumber (String name, String phoneNumber){
        if (contactMap.containsKey(name)){
            if(contactMap.containsValue(phoneNumber)){
                contactMap.get(name).removePhoneNumber(phoneNumber);
            }
        } else {
            System.out.println("Контакта с данным именен нет! Проверьте корректность ввода.");
        }
    }
    public void printContacts() {
        if (contactMap.isEmpty()){
            System.out.println("В телефонной книге нет контактов.");
        }
        List<Contact> sortedContacts = new ArrayList<>(contactMap.values());
        sortedContacts.sort(Comparator.comparingInt(contact -> -contact.getPhoneNumberList().size()));
        for (Contact contact : sortedContacts) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumberList());
        }
    }
}
