package BankEmployees;

public class Manager extends Employees {


    public Manager(String name, int id, String dob, String city) {
        super(name, id, Consts.MANAGER_TYPE, dob, Consts.MANAGER_DEFAULT_SALARY, city);

    }

    public void hireEmployee (String employeeName){
        System.out.println(String.format("The employee %s was hired ", employeeName));
    }
    public void fireEmployee (String employeeName){
        System.out.println(String.format("The employee %s was fired ", employeeName));
    }

}
