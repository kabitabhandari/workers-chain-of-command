package com.kb;

public class SupervisorPower implements ExpenseInterface {
    private ExpenseInterface sendToEmployee;


    @Override
    public void setNext(ExpenseInterface e) {
        this.sendToEmployee = e;
    }

    @Override
    public void process(Money m) {

        if(m.getMoney() >= 500 && m.getMoney() < 1000){

            System.out.println("Supervisor Process Loading");
        }
        else{
            sendToEmployee.process(m);
        }
    }
}
