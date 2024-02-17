package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contact {

    private String name;
    private List<String> phoneNumberList;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumberList = new ArrayList<>();
        this.phoneNumberList.add(phoneNumber);
    }
    public String getName(){
        return name;
    }

    public  List<String> getPhoneNumberList(){
        return  phoneNumberList;
    }
    public void addPhoneNumber(String number) {
        phoneNumberList.add(number);
    }

    public void removePhoneNumber(String number) {
        phoneNumberList.remove(number);
    }


}
