package LAb3Home;

public class CasualEmployee extends Employee{
    private double hourlyPay;

    CasualEmployee (String name, String number){
        super (name,number);
    }

    protected void setHourlyPay (double hourlyPay){
        this.hourlyPay=hourlyPay;
    }

    protected double getHourlyPay (){
        return hourlyPay;
    }

    protected double calculateWeeklyPay(int noOfHours){
        return noOfHours*hourlyPay;
    }
    protected void welcome (){
        System.out.println("Welcome to the Casual Employee Class");
    }

}
