package com.movie.rental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private static final Customer STANDARD_CUSTOMER = getStandardCustomer();

    private static final String EXPECTED_STATEMENT = """
                Rental Record for John Smith
                \tZootopia\t4.5
                \tTENET\t15.0
                \tToaru Majutsu no Index\t6.5
                Amount owed is 26.0
                You earned 4 frequent renter points""";

    private static final String EXPECTED_HTML_STATEMENT = """
            <H1>Rentals for <EM>John Smith</EM></H1><P>
            Zootopia: 4.5<BR>
            TENET: 15.0<BR>
            Toaru Majutsu no Index: 6.5<BR>
            <P>You owe <EM>26.0</EM><P>
            On this rental you earned <EM>4</EM> frequent renter points<P>""";

    private static Customer getStandardCustomer() {
        Customer customer = new Customer("John Smith");
        customer.addRental(new Rental(new Movie("Zootopia", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("TENET", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Toaru Majutsu no Index", Movie.REGULAR), 5));
        return customer;
    }

    @Test
    void statement() {
        assertEquals(EXPECTED_STATEMENT, STANDARD_CUSTOMER.statement());
    }

    @Test
    void htmlStatement() {
        assertEquals(EXPECTED_HTML_STATEMENT, STANDARD_CUSTOMER.htmlStatement());
    }
}
