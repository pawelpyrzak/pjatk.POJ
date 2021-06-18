package com.company;



public class Main {
    public static void main(String[] args) {
        final Company company = new Company(new Worker[] {
                new Worker("Paweł", "Pyrzak", 5),
                new Worker("Paweł2", "Pyrzak2}", 5),
        });

        System.out.println("Yearly cost: "+ company.calcYearlyCost());
        System.out.println("Monthly cost: "+ company.calcMonthlyCost());
        System.out.println("6 Month cost: "+ company.calcCost(Time.MONTH, 6));
    }
}