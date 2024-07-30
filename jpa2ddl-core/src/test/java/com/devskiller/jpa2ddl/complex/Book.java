package com.devskiller.jpa2ddl.complex;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

@Entity
class Book {

	@Id
	private Long id;

	@ElementCollection
	@JoinColumn
	@OnDelete(action = OnDeleteAction.CASCADE)
	@CollectionTable(indexes = {@Index(name = "fk_book_chapter", columnList = "book_id")})
	public final Set<Chapter> chapters = new HashSet<>();

}
