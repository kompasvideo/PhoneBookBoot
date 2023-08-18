package ru.andreybaryshnikov.phonebookboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.andreybaryshnikov.phonebookboot.repository.PhonebookRepository;
import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
    private List<PhoneBook> phoneBooks;
    private int newId = 1;
    private PhonebookRepository phoneBookRepository;

    public PhoneBookServiceImpl(PhonebookRepository phoneBookRepository) {
        this.phoneBookRepository = phoneBookRepository;
    }

    @Override
    public PhoneBook getPhoneBook(int id) {
          return phoneBookRepository.findById(id).get(); //getPhoneBook(id);
    }
    @Override
    public Iterable<PhoneBook> getPhoneBooks() {
        return phoneBookRepository.findAll();
    }
    @Override
    public void editRecordToPhoneBooks(PhoneBook newPhoneBook){
        phoneBookRepository.save(newPhoneBook);
    }
    @Override
    public void deleteRecordToPhoneBooks(int id){
        phoneBookRepository.deleteById(id);
    }
    @Override
    public PhoneBook getNewPhoneBook() {
        return new PhoneBook();
    }
    @Override
    public void addRecordToPhoneBooks(PhoneBook newPhoneBook) {
        phoneBookRepository.save(newPhoneBook);
    }
}
