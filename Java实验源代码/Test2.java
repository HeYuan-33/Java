class Room{
     String id;
    float area;
    String housetype;
    int price;
    boolean condition;

    Room(){}

    Room(String id, float area, int price){
        this.id = id;
        this.area = area;
        this.price = price;
    }

    Room(String id, float area,String housetype, int price, boolean condition ){
        this.id = id;
        this.area = area;
        this.housetype = housetype;
        this.price = price;
        this.condition = condition;
    }

    boolean setter (boolean condition){
        this.condition = condition;
        return condition;
    }

    int getPrice(int price){
        return price;
    }

    void showRoom(){
        System.out.println("ID: " + id);
        System.out.println("Area: " + area);
        System.out.println("Housetype: " + housetype);
        System.out.println("Price: " + price);
        System.out.println("Condition: " + condition);
    }

    float Money(int price,float area){
        float sum = price * area;
       return sum;
    }

}
//测试
public class Test2 {

    public static void main(String args[]) {
        float sumarea;
        double sumprice;
        Room room1 = new Room("1-2-502",113.5f,"三室一厅",15000,false);
        Room room2 = new Room("2-5-1108",156.9f,"四室一厅",17500,true);
        Room room3 = new Room("3-3-1501",45.9f,"二室一厅",16200,true);
        Room room = new Room();

        System.out.println("3个房间的面积是：");
        sumarea = room1.area+ room2.area+room3.area;
        System.out.println( sumarea);

        System.out.println("3个房间的总价是：");
        sumprice = room.Money(room1.price, room1.area)+room.Money(room2.price, room2.area)+room.Money(room3.price, room3.area);
        System.out.println(sumprice);

        System.out.println("修改后的销售状态为：");
        room1.condition = true;
        System.out.println(room1.condition);
        System.out.println("房间信息是：");
        room1.showRoom();
        room2.showRoom();
        room3.showRoom();

    }
}





