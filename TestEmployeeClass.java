package LAb3Home;

import java.net.StandardSocketOptions;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestEmployeeClass {
    static Scanner keyboard = new Scanner(System.in);

    public static String getText(String message) {
        System.out.println(message);
        return keyboard.nextLine();
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0,000.00");

        String number,name;
        double annualSalary,pay;
        int hours;

        System.out.println ("Test Employee");
        System.out.println ("=========");
        number=getText("Employee Number: ");
        name=getText("Employee Name: ");
        Employee employee1=new Employee(number,name);
            System.out.println ("Employee "+employee1.getNumber()+" is called "+
                    employee1.getName()+ "\n");
            //You can replace this with a toString Method
        System.out.println(employee1);


        System.out.println ("Test full-time Employee");
        System.out.println("=============");
        number=getText("Employee Number: ");
        name=getText("Employee Name: ");
        FullTimeEmployee employee2=new FullTimeEmployee(number, name);
        System.out.println ("What is "+employee2.getName()+"'s annual Salary? £:");
        annualSalary=keyboard.nextDouble();
        employee2.setAnnualSalary(annualSalary);
        keyboard.nextLine();
        System.out.println ("Employee: "+ employee2.getNumber());
        System.out.println("Monthly Pay £: "+df.format(employee2.calculateMonthlyPay())+"\n");

        //replace the above with toString method in class Full Time Employee
        System.out.println(employee2);

        System.out.println("Test Casual Employee");
        System.out.println ("==========");
        number=getText("Employee Number: ");
        name=getText("Employee Name: ");
        CasualEmployee employee3=new CasualEmployee(number, name);
        System.out.println ("What is " +employee3.getName()+" 's Hourly pay: £");
        pay=keyboard.nextInt();
        employee3.setHourlyPay(pay);
        System.out.println ("How many hours has "+employee3.getName()+ " worked this week");
        hours=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println ("Employee "+employee3.getNumber());
        System.out.println("Weekly Pay: £" + df.format(employee3.calculateWeeklyPay(hours))+"\n");







    }




    }
