package ru.andreybaryshnikov.phonebookboot.services;

import ru.andreybaryshnikov.phonebookboot.repository.PhonebookRepository;
import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
    private List<PhoneBook> phoneBooks;
    private int newId = 1;
    //private PhonebookRepository phoneBookRepository;

//    public PhoneBookServiceImpl(PhonebookRepository phoneBookRepository) {
//        this.phoneBookRepository = phoneBookRepository;
//    }

    @Override
    public PhoneBook getPhoneBook(int id) {
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            phoneBook = new PhoneBook();
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == id) {
                    phoneBook = item;
                    break;
                }
            }

            if (phoneBook == null) {
                phoneBook = new PhoneBook();
            }
        }
        return phoneBook;
        //return phoneBookRepository.findById(id).get(); //getPhoneBook(id);
    }
    @Override
    public List<PhoneBook> getPhoneBooks() {
        if (phoneBooks == null) {
            phoneBooks = new ArrayList<>();
            PhoneBook phoneBook = new PhoneBook(newId++, "Ivanov", "Ivan", "Ivanovich",
                "+7(919)154-56-78", "st. Lenina 1, 15", "worker");
            phoneBooks.add(phoneBook);
            phoneBook = new PhoneBook(newId++, "Petrov", "Petr", "Petrovich",
                "+7(919)154-56-79", "st. Petrova 7, 3", "worker");
            phoneBooks.add(phoneBook);
            phoneBook = new PhoneBook(newId++, "Sidorov", "Sidor", "Sidorovich",
                "+7(919)154-56-80", "st. Pushkina 4, 1", "worker");
            phoneBooks.add(phoneBook);
        }
        return phoneBooks;
        //return phoneBookRepository.findAll(); //getPhoneBooks();
    }
    @Override
    public void editRecordToPhoneBooks(PhoneBook newPhoneBook){
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            return;
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == newPhoneBook.getPhoneBookID()) {
                    item.setFirstName(newPhoneBook.getFirstName());
                    item.setLastName(newPhoneBook.getLastName());
                    item.setThreeName(newPhoneBook.getThreeName());
                    item.setNumberPhone(newPhoneBook.getNumberPhone());
                    item.setAddress(newPhoneBook.getAddress());
                    item.setDescription(newPhoneBook.getDescription());
                    break;
                }
            }
        }
        //phoneBookRepository.save(newPhoneBook); //editRecordToPhoneBooks(newPhoneBook);
    }
    @Override
    public void deleteRecordToPhoneBooks(int id){
        PhoneBook phoneBook = null;
        if (phoneBooks == null) {
            return;
        } else {
            for (var item: phoneBooks ) {
                if (item.getPhoneBookID() == id) {
                    phoneBook = item;
                    break;
                }
            }
            if (phoneBook != null) {
                phoneBooks.remove(phoneBook);
            }
        }
        //phoneBookRepository.deleteById(id); //deleteRecordToPhoneBooks(id);
    }
    @Override
    public PhoneBook getNewPhoneBook() {
        return new PhoneBook();
    }
    @Override
    public void addRecordToPhoneBooks(PhoneBook newPhoneBook) {
        newPhoneBook.setPhoneBookID(newId++);
        phoneBooks.add(newPhoneBook);
        //phoneBookRepository.save(newPhoneBook); //addRecordToPhoneBooks(newPhoneBook);
    }
}
