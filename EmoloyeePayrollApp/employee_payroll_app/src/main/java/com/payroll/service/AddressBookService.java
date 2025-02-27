package com.payroll.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService<AddressBookModel> {

    private List<AddressBookModel> contacts = new ArrayList<>();

    public AddressBookModel addContact(AddressBookModel contact) {
        contacts.add(contact);
        return contact;
    }

    public List<AddressBookModel> getAllContacts() {
        return contacts;
    }
}
