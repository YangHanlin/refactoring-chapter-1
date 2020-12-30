package com.movie.rental;

public abstract class Price {
    abstract int getPriceCode();

    abstract public double getCharge(int daysRented);
}
