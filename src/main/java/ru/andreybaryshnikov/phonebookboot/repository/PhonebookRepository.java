package ru.andreybaryshnikov.phonebookboot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.andreybaryshnikov.phonebookboot.models.PhoneBook;

public interface PhonebookRepository extends CrudRepository<PhoneBook, Integer> {
}
