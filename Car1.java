import java.util.Scanner;

import java.util.Scanner;
abstract class Car2 {
    String brand;
    double price;
    Car2(){}
    Car2(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    abstract public void getInfo();

}

class RedCar extends Car2 {
    @Override
    public void getInfo() {

    }
}

class GeelyCar extends Car2 {
    @Override
    public void getInfo() {

    }
}

class Factory {
    static void getCar(String name){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入"+name+"的型号: " );
        String brand = sc.nextLine();
        System.out.println("请输入"+name+"汽车的价格：");
        double price = sc.nextDouble();
        System.out.println("型号："+brand+",价格"+price);
    }

}
public class Car1 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getCar("红旗汽车");
        Factory factory2 = new Factory();
        factory2.getCar("吉利汽车");


    }
}
