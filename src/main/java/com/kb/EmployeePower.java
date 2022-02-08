package com.kb;

public class EmployeePower implements ExpenseInterface {

    @Override
    public void setNext(ExpenseInterface e) {

    }

    @Override
    public void process(Money m) {

        if(m.getMoney() > 0 && m.getMoney() < 500){
            System.out.println("Employee Process Loading");
        }
    }
}
