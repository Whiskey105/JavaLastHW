package org.example;

import java.util.Scanner;

public class UserMenu {
    private PhoneBook phoneBook;
    private Scanner scanner;

    public UserMenu() {
        this.phoneBook = new PhoneBook();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("Введите комманду:");
            System.out.println("nr - Добавить новый контакт");
            System.out.println("dc - Удалить сущесвующий контакт");
            System.out.println("ncn - Добавить номер контакту");
            System.out.println("dcn -  Удалить номер контакта");
            System.out.println("pb - Вывод телефонной книги");
            System.out.println("q - Выход");
            System.out.print("Введите номер комманды: ");
            String swSym = scanner.nextLine();

            switch (swSym) {
                case "nc":
                    addContact();
                    break;
                case "dc":
                    removeContact();
                    break;
                case "ncn":
                    addPhoneNumber();
                    break;
                case "dcn":
                    removePhoneNumber();
                    break;
                case "pb":
                    phoneBook.printContacts();
                    break;
                case "q":
                    System.exit(0);
                default:
                    System.out.println("Команда неверна!");
            }
        }
    }

    private void addContact() {
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Номер: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
    }

    private void addPhoneNumber() {
        phoneBook.printContacts();
        System.out.print("Введите имя контакта для добавления номера: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
    }

    private void removePhoneNumber() {
        phoneBook.printContacts();
        System.out.print("Введите имя контакта для удаления номера: ");
        String name = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.removePhoneNumber(name, phoneNumber);
    }

    private void removeContact() {
        phoneBook.printContacts();
        System.out.print("Введите имя контакта для улаения из телефонной книги: ");
        String name = scanner.nextLine();
        phoneBook.removeContact(name);
    }
}
