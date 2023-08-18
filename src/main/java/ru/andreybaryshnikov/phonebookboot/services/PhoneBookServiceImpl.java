package ru.andreybaryshnikov.phonebookboot.services;

import ru.andreybaryshnikov.phonebookboot.repository.PhonebookRepository;
import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;
import org.springframework.stereotype.Service;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
    private PhonebookRepository phoneBookRepository;

    public PhoneBookServiceImpl(PhonebookRepository phoneBookRepository) {
        this.phoneBookRepository = phoneBookRepository;
    }

    @Override
    public PhoneBook getPhoneBook(int id) {
          return phoneBookRepository.findById(id).get();
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
