package com.kb;

public interface ExpenseInterface {

    void setNext(ExpenseInterface e);
    void process(Money m);
}
