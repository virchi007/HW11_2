package data;

import homeworkEight2.Director;
import homeworkEight2.Employee;
import homeworkEight2.Manager;
import homeworkEight2.Worker;

public class EmployeeData {
    public static String name = "Jane";
    public static String subName = "ane";
    public static final int BASE_SALARY = 20;


    public static Employee[] getEmployeesData(){
        Employee emp1 = new Employee("Harry Potter", BASE_SALARY);
        Employee emp2 = new Employee("Ron Weasley", BASE_SALARY);
        Employee emp3 = new Employee("Hermione Granger", BASE_SALARY);

        Employee employees[] = {emp1, emp2, emp3};
        return employees;
    }

    public static Worker[] getWorkerData () {
        Worker w1 = new Worker("Hagrid", BASE_SALARY);
        Worker w2 = new Worker("Tonks", BASE_SALARY);
        Worker w3 = new Worker("Lupin", BASE_SALARY);

        Worker workers [] = {w1, w2, w3};
        return workers;
    }

    public static Manager[] getManagerData() {
        Manager m1 = new Manager("Lockhart", BASE_SALARY, 5);
        Manager m2 = new Manager("Minerva", BASE_SALARY, 5);
        Manager m3 = new Manager("Severus", BASE_SALARY, 2);
        Manager m4 = new Manager("Flitwick", BASE_SALARY, 15);

        Manager managers[] = {m1, m2, m3, m4};
        return managers;
    }

    public static Director[] getDirectorData() {
        Director d1 = new Director("Albus Dumbledore", BASE_SALARY, 150);
        Director d2 = new Director("Ignazius Black", BASE_SALARY, 100);
        Director d3 = new Director("Arman Dippet", BASE_SALARY, 50);

        Director directors[] = {d1,d2,d3};
        return directors;
    }

}
