package com.ZajeciaJava.booklibrary.repository;

import com.ZajeciaJava.booklibrary.domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository
public class BookRepository {
    @PersistenceContext
    private EntityManager em;

    public Collection<Book> getBooks(){
        return em.createQuery("from Book", Book.class).getResultList(); //to co pobierze z query ppmapuje do klasy Book
    }
    public Book getBook(int id){
        return em.find(Book.class, id);
    }
    @Transactional //dodajemy tam gdzie zapisujemy
    public  void saveBook(Book book) {
        if (book != null)
            em.persist(book);
    }
}
