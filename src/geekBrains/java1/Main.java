package geekBrains.java1;

public class Main {

    public static void main(String[] args) {
        Employee[] department = new Employee[5];
        department[0] = new Employee("Ivan Ivanov", "engineer", "email@ibox.com", "+79992009090", 35000, 35);
        department[1] = new Employee("Ivan Petrov", "frontend dev", "email@ibox.com", "+79992009090", 45000, 42);
        department[2] = new Employee("Denis Smirnov", "backend dev", "email@ibox.com", "+79992009090", 35000, 43);
        department[3] = new Employee("Nickita Medvedev", "designer", "email@ibox.com", "+79992009090", 35000, 29);
        department[4] = new Employee("James Brown", "senior php dev", "email@ibox.com", "+79992009090", 35000, 30);

        department[3].info();
        for (Employee employee:department) {
            if(employee.getAge() >40){
                employee.info();
            }

        }
    }
}
