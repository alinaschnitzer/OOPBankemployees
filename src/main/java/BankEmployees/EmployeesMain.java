package BankEmployees;

public class EmployeesMain {
    public static void main(String[] args) {
        Manager manager1 = new Manager(" John Smith", 101, "01.01.1982", "Toronto");
        Clerk clerk1 = new Clerk(" Mary Red", 102,  "12.12.1976", "Richmond Hill");
        Clerk clerk2 = new Clerk(" Mark Night", 103, "18.04.1975","Aurora");
        Accountant accountant1 = new Accountant(" Linda Core", 104,  "23.05.1958",  "Barrie");
        Accountant accountant2 = new Accountant(" Moshe Snow", 105,  "26.07.1987", "Jerusalem");
        Accountant accountant3 = new Accountant(" Katy Paris", 106,  "15.05.1982",  "Niagara Falls");
        Accountant accountant4 = new Accountant(" Daniel Amid", 107,  "10.03.1967",  "North York");
        Accountant accountant5 = new Accountant(" Brian Sky ", 108,  "31.12.1985", "Mississauga");

        System.out.println(manager1.toString());
        System.out.println(clerk1.toString());
        System.out.println(accountant1.toString());

        manager1.fireEmployee("Katy Paris");
        accountant2.createReport();
        clerk2.makeCall("Ivan Petrov");
        System.out.println("Accountant" + accountant4.getEmployeeName());accountant4.createReport();
    }
}
