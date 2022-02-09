package com.kb;

public abstract class  BaseExpense  implements ExpenseInterface{
    public ExpenseInterface sendToNextInChain;


    public abstract void process(Money m);

        public void setNext(ExpenseInterface e) {
            this.sendToNextInChain = e;
        }

}
