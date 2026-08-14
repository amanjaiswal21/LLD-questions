package com.SystemDesign.LLD.questions.CoupanEngine;

public class CartItem {
    public Product product;
    int quantity;

    public double getTotalPrice() {
        return product.price * quantity;
    }
}
