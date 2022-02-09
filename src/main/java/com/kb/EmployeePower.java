package com.kb;

public class EmployeePower extends BaseExpense implements ExpenseInterface {

    @Override
    public void process(Money m) {

        if(m.getMoney() > 0 && m.getMoney() < 500){
            System.out.println("Employee Process Loading");
        }
    }
}
