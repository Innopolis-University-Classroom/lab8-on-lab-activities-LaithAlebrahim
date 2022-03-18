package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;
import java.util.List;

public class Cartop {
    List<Prod> products;

    void addToCart(Prod product) {
        products.add(product);
    }

    void removeFromCart(Prod product) {
        products.remove(product);
    }
}
