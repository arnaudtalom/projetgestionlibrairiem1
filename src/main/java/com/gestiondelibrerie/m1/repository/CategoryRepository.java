package com.gestiondelibrerie.m1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondelibrerie.m1.entity.Book;
import com.gestiondelibrerie.m1.entity.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
