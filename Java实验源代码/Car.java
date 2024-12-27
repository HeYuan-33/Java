interface Bluetooth{
    public void  start ( );
    public void  stop ();

}

interface GPS{
    public void  position ();
}

interface internet{
    public void internet();
}

class MiddleCar extends Car implements Bluetooth{
    public void start (){
        System.out.println("蓝牙已连接");
    }
    public void stop (){
        System.out.println("蓝牙已关闭");
    }
}

class LuxurrCar implements Bluetooth, internet ,GPS{
    public void start (){

    }
    public void stop (){}
    public void position (){
        System.out.println("GPS已开启，正在进行定位");
    }
    public void internet(){
        System.out.println("IVO已开启");
    }

}
public class Car  {
    String xh;
    int speed;

    Car(){}

    void getter(String xh,int speed){
        this.xh = xh;
        this.speed = speed;
    }
    void setter (){
        System.out.println(xh);
        System.out.println(speed);
    }
}

class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.getter("低配汽车",80);
        car1.setter();

        MiddleCar car2 = new MiddleCar();
        car2.getter("中配备汽车",100);
        car2.setter();
        car2.start();

        LuxurrCar car3 = new LuxurrCar();
        car3.position();
        car3.internet();


    }
}
