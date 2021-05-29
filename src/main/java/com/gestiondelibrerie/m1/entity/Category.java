package com.gestiondelibrerie.m1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private float name;
}
