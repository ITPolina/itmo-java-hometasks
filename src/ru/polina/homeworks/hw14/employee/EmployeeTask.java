package ru.polina.homeworks.hw14.employee;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);

        // TODO 1: отсортировать список по имени
        Comparator<Employee> comparator01 = new NameComparator();
        TreeSet<Employee> employeeTreeSet01 = new TreeSet<>(comparator01);
        employeeTreeSet01.addAll(employeeList);

        // TODO 2: отсортировать список по имени и зп
        Comparator<Employee> comparator02 = comparator01.thenComparing(new SalaryComparator());
        //Comparator<Employee> comparator02 = new AgeComparator();
        TreeSet<Employee> employeeTreeSet02 = new TreeSet<>(comparator02);
        employeeTreeSet02.addAll(employeeList);


        // TODO 3: отсортировать список по имени, зарплате, возрасту и компании
        Comparator<Employee> comparator03 = comparator01.thenComparing(new SalaryComparator()).thenComparing(new AgeComparator()).thenComparing(new CompanyComparator());
        TreeSet<Employee> employeeTreeSet03 = new TreeSet<>(comparator03);
        employeeTreeSet03.addAll(employeeList);





    }
}
