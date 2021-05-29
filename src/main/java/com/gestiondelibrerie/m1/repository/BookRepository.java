package com.gestiondelibrerie.m1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondelibrerie.m1.entity.Author;
import com.gestiondelibrerie.m1.entity.Book;

public interface BookRepository extends JpaRepository <Book, Long>{

}
