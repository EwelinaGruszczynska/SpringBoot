package com.ZajeciaJava.booklibrary.domain;

import javax.persistence.*;

//@Component
//@Scope("prototype") //czy moze istniec wiele instancji w kontekscie
@Entity //TWORZYMY W BAZIE TABELĘ BOOK
@Table(name = "book")
public class Book {
    @Id //klucz główny w encji
    @GeneratedValue(strategy = GenerationType.AUTO) //automatyczna inkrementacja ID
    private int id;
    private String title;
    private int year;
    private String publisher;
    private String isbn;

    public Book(){
    }

    public Book(String title, int year, String publisher, String isbn) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
