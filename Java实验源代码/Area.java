interface Shape {
    abstract void getArea();
    abstract void getPerimeter();
    abstract void drawing();

}
class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public void drawing() {
        System.out.println("正在绘制一个长方形："+length+"宽："+width);
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter = 2 * length + 2 * width;
        System.out.println(perimeter);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }

    @Override
    public void drawing() {
        System.out.println("正在绘制一个圆，圆的半径为："+radius);
    }

    public void getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
    }

}

class MyShape{
    static void area (Shape shape){
        shape.getArea();
    }
    static void perimeter (Shape shape){
        shape.getPerimeter();
    }
    static void drawing (Shape shape){
        shape.drawing();
    }
}

public class Area {
    public static void main(String[] args) {
        MyShape myShape = new MyShape();

        Circle circle = new Circle(10);
        System.out.println("            输出半径为10的圆的面积：");
        myShape.area(circle);
        System.out.println("             输出半径为10的圆的周长：");
        myShape.perimeter(circle);
        System.out.println("            画一个半径为10的圆形：");
        myShape.drawing(circle);

        Rectangle  re = new Rectangle(10,20);
        System.out.println("            输出指定长宽的矩形面积：");
        myShape.area (re);
        System.out.println("            输出指定长宽的矩形周长：");
        myShape.perimeter (re);
        System.out.println("            画一个长方形：");
        myShape.drawing (re);
    }
}
