package ru.andreybaryshnikov.phonebookboot.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;

import java.util.List;
import java.util.Optional;


public interface PhonebookRepository extends CrudRepository<PhoneBook, Integer> {
//    Optional<PhoneBook> findById(int id);
//    List<PhoneBook> findAll();
//    Object save(PhoneBook newPhoneBook);
//
}
