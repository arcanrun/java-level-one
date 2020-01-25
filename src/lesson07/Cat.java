package lesson07;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void eat(Plate p) {
        if (p.getFood() < appetite){
            return;
        }
        p.decreaseFood(appetite);
        fullness = true;
    }

    public boolean getFullnes(){
        return fullness;
    }
}
