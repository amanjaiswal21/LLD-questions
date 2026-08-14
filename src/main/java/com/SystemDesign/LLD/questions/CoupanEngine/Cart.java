package com.SystemDesign.LLD.questions.CoupanEngine;

import com.SystemDesign.LLD.questions.DesignPattern.CommandDesignPattern.Appliances.Light;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CartItem> items = new ArrayList<>();
    private String paymentBank;
    private double originalTotal;
    private double currentTotal;

    public void applyDiscount(double discount){
        currentTotal=currentTotal-discount;
    }

}
