package main.java.basic.oop.data;

public class Ferrari implements Car{

    public void drive(){
        System.out.println("Ferrari Driver");
    }

    public int getTier() {
        return 2;
    }

    public String getBrand() {
        return "Lambo";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return isBig();
    }
}
