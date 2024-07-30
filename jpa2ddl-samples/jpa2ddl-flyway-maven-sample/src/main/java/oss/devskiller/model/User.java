package oss.devskiller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class User {

	@Id
	private Long id;

	private String name;

	private String email;

	private int age;

}
