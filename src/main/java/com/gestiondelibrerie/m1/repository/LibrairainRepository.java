package com.gestiondelibrerie.m1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondelibrerie.m1.entity.Item;
import com.gestiondelibrerie.m1.entity.Librairain;

public interface LibrairainRepository extends JpaRepository <Librairain, Long>{

}
