package BankEmployees;

public class Accountant extends Employees {



    public Accountant(String name, int id, String dob,String city) {
        super(name, id, Consts.ACCOUNTANT_TYPE, dob, Consts.ACCOUNTANT_DEFAULT_SALARY,city);
    }
    public void createReport(){
        System.out.println(" will prepare report");
    }
}


