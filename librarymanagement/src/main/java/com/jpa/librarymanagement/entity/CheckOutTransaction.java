package com.jpa.librarymanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "Check_Out_Transaction")
public class CheckOutTransaction {
	@Id
	@GeneratedValue
	@Column(name = "check_Out_Id")
	private int checkOutId;

	@Column(name = "book_Id")
	private int bookId;

	@Column(name = "checked_Out_Date")
	private Date checkedOutDate;

	@Column(name = "return_Date")
	private Date returnDate;

	@Column(name = "checked_Out_By")
	private int checkedOutBy;

	@Column(name = "return_Status")
	private String return_Status;

	@Column(name = "fine_Increased")
	private int fineIncreased;

	public int getCheckOutId() {
		return checkOutId;
	}

	public void setCheckOutId(int checkOutId) {
		this.checkOutId = checkOutId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getCheckedOutDate() {
		return checkedOutDate;
	}

	public void setCheckedOutDate(Date checkedOutDate) {
		this.checkedOutDate = checkedOutDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getCheckedOutBy() {
		return checkedOutBy;
	}

	public void setCheckedOutBy(int checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}

	public String getReturn_Status() {
		return return_Status;
	}

	public void setReturn_Status(String return_Status) {
		this.return_Status = return_Status;
	}

	public int getFineIncreased() {
		return fineIncreased;
	}

	public void setFineIncreased(int fineIncreased) {
		this.fineIncreased = fineIncreased;
	}

}
