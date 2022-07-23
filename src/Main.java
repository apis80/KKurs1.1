import java.util.Arrays;

public class Main {
    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee result1 = employees[0];
        int maxSalary = employees[0].getSalaryStaff();
        for (Employee employee : employees) {
            if (employee.getSalaryStaff() > maxSalary) {
                maxSalary = employee.getSalaryStaff();
                result1 = employee;
                System.out.println( "Макимальная зарплата" + maxSalary + result1);
            }
        }
        return result1;}

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];
        int minSalary = employees[0].getSalaryStaff();
        for (Employee employee : employees) {
            if (employee.getSalaryStaff() < minSalary) {
                minSalary = employee.getSalaryStaff();
                result = employee;
                System.out.println( "Минимальная зарплата" + minSalary + result);
            }
        }
        return result;
    }
    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum);
        return sum;
    }
    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getStaff());
        }
    }

    public static void averageSalary(Employee[] employees) {
        int sum = countStaffSalary(employees)/ employees.length;
        System.out.println("Средняя зарплата = " + sum);
    }

    public static void main(String[] args) {
            Employee[] employee = new Employee[10];
            employee[0] = new Employee("Piskunov ivan Ivanovich", 73000, 1);
            employee[1] = new Employee("Zaitsev ivan Ivanovich", 74000, 2);
            employee[2] = new Employee("Hlystov ivan Ivanovich", 75000, 3);
            employee[3] = new Employee("Krutov ivan Ivanovich", 79000, 4);
            employee[4] = new Employee("Chizhov ivan Ivanovich", 67000, 5);
            employee[5] = new Employee("Smirnov ivan Ivanovich", 55000, 1);
            employee[6] = new Employee("Hrushov ivan Ivanovich", 98000, 2);
            employee[7] = new Employee("Mechov ivan Ivanovich", 76000, 3);        employee[0] = new Employee("Piskunov ivan Ivanovich", 73000, 1);
            employee[8] = new Employee("Sidorov ivan Ivanovich", 73000, 4);
            employee[9] = new Employee("Petrov ivan Ivanovich", 73000, 5 );
            System.out.println (Arrays.toString(employee));
        System.out.println(findEmployeeWithMaxSalary();
    }
        }








