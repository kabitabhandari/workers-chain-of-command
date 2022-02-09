package com.kb;

public class SupervisorPower extends BaseExpense implements ExpenseInterface {

    @Override
    public void process(Money m) {

        if(m.getMoney() >= 500 && m.getMoney() < 1000){

            System.out.println("Supervisor Process Loading");
        }
        else{
            sendToNextInChain.process(m);
        }
    }
}
