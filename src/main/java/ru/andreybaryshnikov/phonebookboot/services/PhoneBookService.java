package ru.andreybaryshnikov.phonebookboot.services;


import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;

public interface PhoneBookService {
    PhoneBook getPhoneBook(int id);
    Iterable<PhoneBook> getPhoneBooks();
    void editRecordToPhoneBooks(PhoneBook newPhoneBook);
    void deleteRecordToPhoneBooks(int id);
    PhoneBook getNewPhoneBook();
    void addRecordToPhoneBooks(PhoneBook newPhoneBook);
}
