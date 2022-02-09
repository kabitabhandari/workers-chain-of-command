package com.kb;

public class Chain {

    BaseExpense mgrProcess = new ManagerPower();
    BaseExpense supProcess = new SupervisorPower();
    BaseExpense empProcess = new EmployeePower();

    public ExpenseInterface chainOrderHead(){
        mgrProcess.setNext(supProcess);
        supProcess.setNext(empProcess);
        return mgrProcess;
    }


}