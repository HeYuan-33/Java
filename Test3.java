class Car {
    String brand;
    float emission;
    float price;

    Car(String brand, float emission, float price) {
        this.brand = brand;
        this.emission = emission;
        this.price = price;
    }

      String getBrand() {
        return brand;
      }

      void starting(){
        System.out.println("启功汽车");
      }

    void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Emission: " + emission);
        System.out.println("Price: " + price);
        System.out.println("创建汽车成功");
    }
}

class Hand{

    private int length;
    private float area;
    private  int grip;

     Hand(int length, float area, int grip) {
         this.length = length;
         this.area = area;
         this.grip = grip;
     }

    void catching (String thing){
          System.out.println("拿上"+thing);
    }

    void getInfo(){
       System.out.println("Length: " + length);
       System.out.println("Area: " + area);
       System.out.println("Grip: " + grip);
        System.out.println("创建手成功");
    }
}
class Person{
    Hand hand1 = new Hand(8,42,45);
        private int age;
        private String name;
        private int id;
        private String hand;

        Person (){}

        Person(String name){}

        Person(int age, String name, int id, String hand) {
            this.age = age;
            this.name = name;
            this.id = id;
            this.hand = hand;
        }

        String getName (String name) {
            System.out.println(name);
            return name;
        }

        void showPerson () {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("ID: " + id);
            System.out.println("Hand: " + hand);
        }

        void saying (Person per, String msg){
             System.out.println("说："+msg);
        }
        void getSomething (String thing){
            hand1.catching(thing);
        }

        void strat (Car car){
            car.starting();

        }
    }


// 测试
public class Test3 {
    public static void main(String[] args) {
        Car car = new Car("红旗L5",3.0f,25);
        car.show();
        Hand hand = new Hand(8,42,45);
        hand.getInfo();
        Person monkey = new Person("孙悟空");
        Person pig = new Person();
        monkey.getName("孙悟空");
        monkey.saying(monkey,"八戒，你这个呆子！");
        monkey.getName("孙悟空");
        monkey.getSomething("金箍棒");
        monkey.strat(car);
    }
}
