package com.SystemDesign.LLD.questions.CoupanEngine;

public abstract class Coupon {
    private Coupon next;

    public Coupon setNext(Coupon next) {
        this.next = next;
        return next;
    }

    public void applyCoupon(Cart cart) {
      if(isApplicable(cart)){
          double discount=getDiscount(cart);
          cart.applyDiscount(discount);
          System.out.println(getClass().getSimpleName() + " applied. Discount = ₹" + discount);

          if(!isCombinable()) return;
      }
      else{
          System.out.println(getClass().getSimpleName() + " is not applicable.");
      }

      if(next!=null){
          next.applyCoupon(cart);
      }
    }

    public abstract boolean isApplicable(Cart cart);

    public abstract boolean isCombinable();

    public abstract double getDiscount(Cart cart);
}


