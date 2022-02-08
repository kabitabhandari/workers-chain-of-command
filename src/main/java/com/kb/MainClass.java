package com.kb;

public class MainClass {

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.chainOrderHead().process(new Money(200));

    }
}
