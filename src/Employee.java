public class Employee {
    private String staff;
    private int salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter = 0;

    public Employee(String staff, int salaryStaff, int departmentNumber) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = getCounter();
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getStaff() {
        return staff;
    }

    public int getSalaryStaff() {
        return salaryStaff;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getId() {
        return id;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;}


    public String toString() { return this.staff + ","+ this.salaryStaff +","+ this.departmentNumber;}
}
