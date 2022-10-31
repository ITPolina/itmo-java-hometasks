package ru.polina.homeworks.hw14.employee;

import ru.polina.homeworks.hw14.message.Message;
import ru.polina.homeworks.hw14.message.MessagePriority;

import java.util.*;

// компораторы
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() < o2.getSalary()) return -1;
        if(o1.getSalary() > o2.getSalary()) return 1;
        return 0;
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2){
        if (o1.getAge() < o2.getAge()) return -1;
        if (o1.getAge() > o2.getAge()) return 1;
        return 0;
    }
}

class CompanyComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class Employee { //implements Comparable<Employee> {

    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить конструктор, необходимы геттеры и сеттеры


    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке


    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний
        if (num <= 0) {
            return Collections.emptyList();
        }

        Random random = new Random();
        ArrayList<Employee> employees = new ArrayList<>(num);
        // создание объектов, наполнение списка
        for (int i = 0; i < num; i++){
            employees.add(new Employee(names[random.nextInt(names.length)],companies[random.nextInt(companies.length)], (random.nextInt(20) + 50),  (random.nextInt(40) + 21)));
        }
        return employees;
    }

    /*@Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
