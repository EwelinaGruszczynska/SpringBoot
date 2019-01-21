package com.ZajeciaJava.booklibrary;

import com.ZajeciaJava.booklibrary.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:custom.properties") //musimy dodać ścieżkę jeśli tworzymy własny plik, application.propeties jest widzina bez tego
public class AppStarter implements CommandLineRunner {

   /* @Autowired
    Book book;

    Book book2;

    @Value("${spring.pagesize:25}") //$ - odwołujemy się do jakiejś zmiennej, dybysmy dali ..:25 - wartosc awaryjna (podstwiana w razie błędów)
    Integer size; //wstrzykujemy obiekt */

    @Override
    public void run(String... args) throws Exception {

    }

    /* @Autowired
    public void setBook2(Book book2) {
        this.book2 = book2;
    } */
}
