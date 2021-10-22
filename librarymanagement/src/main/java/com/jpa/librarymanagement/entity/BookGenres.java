package com.jpa.librarymanagement.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Genres")
public class BookGenres {
	@Id
	@GeneratedValue
	@Column(name = "genre_Id")
	private int genreId;

	@Column(name = "genre_Name")
	private String genre_name;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy ="Book_Genres")
	private Set<BookDetails> bookDetails;

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

}
