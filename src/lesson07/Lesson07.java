package lesson07;

public class Lesson07 {
    public static void main(String[] args) {

        Cat tom = new Cat("Tom", 35);
        Cat boris = new Cat("Boris", 50);
        Cat james = new Cat("James", 100);
        Cat[] cats = {tom, boris, james};

        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getFullnes());
        }

        plate.info();




    }
}