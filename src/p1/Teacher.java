package p1;

public class Teacher extends User{

    private boolean tenure;

    private double salary;


    public Teacher(String name, int id, String phoneNumber, boolean tenure, double salary) {
        super(name, id, phoneNumber);
        this.tenure = tenure;
        this.salary = salary;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
