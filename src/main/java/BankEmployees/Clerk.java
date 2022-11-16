package BankEmployees;

public class Clerk extends Employees {

    public Clerk(String name, int id, String dob, String city) {
        super(name, id, Consts.CLERK_TYPE, dob, Consts.CLERK_DEFAULT_SALARY, city);
    }

    public void makeCall(String customerName) {
        System.out.println(String.format("Connected to customer %s", customerName));
    }

    public void getCall(String customerName) {
        System.out.println(String.format("Answered to customer %s", customerName));

    }
}

