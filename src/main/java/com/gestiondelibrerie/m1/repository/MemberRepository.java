package com.gestiondelibrerie.m1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondelibrerie.m1.entity.Librairain;
import com.gestiondelibrerie.m1.entity.Member;

public interface MemberRepository extends JpaRepository <Member, Long>{

}
