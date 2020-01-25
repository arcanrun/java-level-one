package geekBrains.java1;

//lesson05

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNum;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNum, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;

    }

    public void info() {
        System.out.println("Employee: " + fullName + " " + position + " " + email + " " + phoneNum + " " + salary + " " + age);
    }

    public int getAge(){
        return  age;

    }
}
