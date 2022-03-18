package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;
class Discounts {

    double totals;

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}