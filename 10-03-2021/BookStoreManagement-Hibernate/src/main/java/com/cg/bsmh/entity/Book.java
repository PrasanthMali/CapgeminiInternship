package com.cg.bsmh.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book implements Serializable, Comparable<Book> {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="bcode")
	private String bcode;
	@Column(name="title")
	private String title;
	@Column(name="p_date")
	private LocalDate publishDate;
	@Column(name="price")
	private double price;

	public Book() {
		/* default constructor */
	}

	public Book(String bcode, String title, LocalDate publishDate, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Book code: ");
		output.append(bcode);
		output.append(" Title: ");
		output.append(title);
		output.append(" PublishDate: ");
		output.append(publishDate);
		output.append(" Price: ");
		output.append(price);
		return output.toString();

	}

	@Override
	public int compareTo(Book book) {
		String firstBCode = this.bcode;
		String secondBCode = book.bcode;
		return firstBCode.compareTo(secondBCode);
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		char[] chars = bcode.toCharArray();
		for (int i = 1; i <= chars.length; i++) {
			hashCode += ((int) chars[i - 1]) * i;
		}

		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;

		if (obj instanceof Book) {
			Book book = (Book) obj;
			String firstBCode = this.bcode;
			String secondBCode = book.bcode;
			flag = firstBCode.equals(secondBCode);
		}

		return flag;
	}

}