package LAb3Home;

import java.text.DecimalFormat;

public class FullTimeEmployee extends Employee {

    DecimalFormat df = new DecimalFormat("0.00");

    private double annualSalary;

    FullTimeEmployee(String name, String number) {
        super(name, number);
    }

    protected void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    protected double getAnnualSalary() {
        return annualSalary;
    }

    protected double calculateMonthlyPay() {
        return annualSalary / 12;
    }

    protected void welcome() {
        //call the welcome method from employee but override it
        System.out.println("Welcome to the Full TIme Employee Class");
    }

    //toString method
    public String toString() {
        return ("Employee :" + getNumber() +
                "\nMonthly Pay: £" +
                df.format(calculateMonthlyPay()) + "\n");


    }
}