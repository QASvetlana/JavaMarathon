package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("белый");
        car1.setModel("москвич");
        car1.setYear(2022);
        System.out.println(car1.getColor()+" "+car1.getModel()+" "+car1.getYear()+" года выпуска");
    }
}
