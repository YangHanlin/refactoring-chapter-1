package com.movie.rental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void statement() {
        final String EXPECTED_STATEMENT = """
                Rental Record for John Smith
                \tZootopia\t4.5
                \tTENET\t15.0
                \tToaru Majutsu no Index\t6.5
                Amount owed is 26.0
                You earned 4 frequent renter points""";
        Customer customer = new Customer("John Smith");
        customer.addRental(new Rental(new Movie("Zootopia", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("TENET", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Toaru Majutsu no Index", Movie.REGULAR), 5));
        assertEquals(EXPECTED_STATEMENT, customer.statement());
    }
}