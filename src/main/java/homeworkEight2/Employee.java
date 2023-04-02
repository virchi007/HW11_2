package homeworkEight2;

public class Employee {
    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    // adding a new method getSalary to practice Polymorphism;

    public int getSalary(){
        return getBaseSalary();
    }
}
