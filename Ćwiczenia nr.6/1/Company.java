package com.company;

public class Company {
    private final Worker[] workerr;

    public Company(final Worker[] workerr) {
        this.workerr = workerr;
    }

    public double calcMonthlyCost() {
        double cost=0;
        for (Worker worker:workerr) {
            cost=cost+worker.getSalary()*Time.MONTH.getHours();
        }
        return cost;
    }

    public double calcYearlyCost() {
        double cost=0;
        for (Worker worker:workerr) {
            cost=cost+worker.getSalary()*Time.YEAR.getHours();
        }
        return cost;
    }

    public double calcCost(Time time,int multiplier){
        return calcMonthlyCost()*multiplier;
    }
}