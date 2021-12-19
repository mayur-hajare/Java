package com.mh;

class MyEmployee {
    String name;
    int id;
    int salary;

    MyEmployee(int s, int i, String n) {
        name = n;
        id = i;
        salary = s;

    }

    MyEmployee(int s, int i) {
        id = i;
        salary = s;

    }

    public void setId(int n) {
        id = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

    public void setName(String na) {
        name = na;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        MyEmployee employee = new MyEmployee(1, 32);
        MyEmployee emp = new MyEmployee(2, 45, "HAJARE");
//        employee.setId(12);
//        employee.setSalary(12500);
//        employee.setName("Mayur");
        System.out.println(employee.getName() + "\n" + employee.getId() + "\n" + employee.getSalary());
        System.out.println(emp.getName() + "\n" + emp.getId() + "\n" + emp.getSalary());


    }
}
