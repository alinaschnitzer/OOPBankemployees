package BankEmployees;

public abstract class Employees {

    private String employeeName;
    private int id;
    private String title;
    private String DOB;
    private double salary;
    private String address;

    public Employees(String name, int id, String title, String dob, double salary, String city){
        this.employeeName = name;
        this.id = id;
        this.title = title;
        this.DOB = dob;
        this.salary = salary;
        this.address = city;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String  getDOB() {
        return DOB;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
  public void receivedSalary (){
      System.out.println("The salary was send to the employee bank account");
  }

  public String toString (){
        String txt = String.format("Employee name: %s, employee ID: %d, employee title: %s, employee DOB: %s, employee salary %f, employee address %s " , employeeName,id,title,DOB,salary,address);
  return txt;
    }

    }

