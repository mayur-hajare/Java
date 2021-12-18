package com.mh;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.SortedMap;


class Cellphone {

    public void callfrd(String name) {
        System.out.println("Calling Friend " + name);

    }

}

class Square {
    public float area(float a, float b) {

        return a * b;
    }
}

class Employee {
    int salary;
    String name;

    public void setSalary(int s) {
        salary = s;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

public class Oops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee Mayur = new Employee();
        System.out.println("Enter Employee name : ");
        String name = scanner.next();
        Mayur.setName(name);
        System.out.println("Enter Employee Salary : ");
        int salary = scanner.nextInt();
        Mayur.setSalary(salary);
        System.out.println(Mayur.getName());
        System.out.println(Mayur.getSalary());

        Cellphone call = new Cellphone();
        call.callfrd(name);

        Square size = new Square();
        float result = size.area(20.7f, 10.5f);
        System.out.println(result);

    /*    Employee[] emp=new Employee[5];

        for (int i=1;i<=5;i++){

            System.out.println("Enter Name Of Employee : " + i);
            String n=scanner.next();
            emp[i].setName(n);

            System.out.println("Enter Salary Of Employee : " + i);
            int s=scanner.nextInt();
            emp[i].setSalary(s);

        }

        for (int i=1;i<=5;i++){
            System.out.println(emp[i].getName());
            System.out.println(emp[i].getSalary());
        }*/
    }

}
