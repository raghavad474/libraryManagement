package com.jpa.librarymanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Book_Details")
public class BookDetails {
	@Id
	@GeneratedValue
	@Column(name = "book_Id")
	private int bookId;

	@Column(name = "book_Status")
	private String book_Status;

	@Column(name = "book_Author")
	private String bookAuthor;

	@Column(name = "book_Name")
	private String bookName;

	@Column(name = "book_Price")
	private float bookPrice;

	@Column(name = "book_Rating")
	private float bookRating;

	@Column(name = "published_date")
	private Date publishedDate;
	
	@OneToOne
	@JoinColumn(name = "book_Genre_Id",referencedColumnName="genre_Id") 
	private BookGenres bookGenres;
	
	@Transient
	private int bookGenreId;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBook_Status() {
		return book_Status;
	}

	public void setBook_Status(String book_Status) {
		this.book_Status = book_Status;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookGenreId() {
		return bookGenreId;
	}

	public void setBookGenreId(int bookGenreId) {
		this.bookGenreId = bookGenreId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public float getBookRating() {
		return bookRating;
	}

	public void setBookRating(float bookRating) {
		this.bookRating = bookRating;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

}
