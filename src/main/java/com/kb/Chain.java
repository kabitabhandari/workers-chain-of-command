package com.kb;

public class Chain {

    ExpenseInterface mgrProcess = new ManagerPower();
    ExpenseInterface supProcess = new SupervisorPower();
    ExpenseInterface empProcess = new EmployeePower();

    public ExpenseInterface chainOrderHead(){
        mgrProcess.setNext(supProcess);
        supProcess.setNext(empProcess);
        return mgrProcess;
    }


}