package LAb3Home;

public class Employee {

    private String number, name;

    Employee() {
    }//default constructor

    Employee(String num, String empName) {
        number=num;
       name=empName;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected String getNumber() {
        return number;
    }

    protected void welcome() {
        System.out.println("Welcome to the employee Class");
    }
    public String toString() {
        return ("Employee " + number + " is called " +
                name + "\n");
    }//toString
}


