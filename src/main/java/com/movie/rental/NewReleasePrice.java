package com.movie.rental;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = daysRented * 3;
        return result;
    }
}
