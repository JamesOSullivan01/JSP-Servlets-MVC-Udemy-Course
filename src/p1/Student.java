package p1;

public class Student extends User{

    private double gpa;

    private int year;


    public Student(String name, int id, String phoneNumber, double gpa, int year) {
        super(name, id, phoneNumber);
        this.gpa = gpa;
        this.year = year;
    }
    public Student() {
    }

    @Override
    public void print(){
        super.print();
        System.out.println(gpa);
        System.out.println(year);
    }


    @Override
    public String toString() {
        return "Name: " + getName() +
                ", gpa=" + gpa +
                ", year=" + year;
    }
}
