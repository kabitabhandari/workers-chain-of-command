package com.kb;

public class ManagerPower  extends BaseExpense implements ExpenseInterface {


    @Override
    public void process(Money m) {


        if(m.getMoney() >= 1000){
            System.out.println("Manager Process Loading");
        }
        else{
            sendToNextInChain.process(m);
        }


    }

}
