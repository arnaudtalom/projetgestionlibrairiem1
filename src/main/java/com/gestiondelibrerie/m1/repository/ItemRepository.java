package com.gestiondelibrerie.m1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondelibrerie.m1.entity.Category;
import com.gestiondelibrerie.m1.entity.Item;

public interface ItemRepository extends JpaRepository <Item, Long>{

}
