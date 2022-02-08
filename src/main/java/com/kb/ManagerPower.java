package com.kb;

public class ManagerPower implements ExpenseInterface {

    private ExpenseInterface sendToSupervisor;

    @Override
    public void setNext(ExpenseInterface e) {
        this.sendToSupervisor = e;
    }

    @Override
    public void process(Money m) {


        if(m.getMoney() >= 1000){
            System.out.println("Manager Process Loading");
        }
        else{
            sendToSupervisor.process(m);
        }


    }

}
