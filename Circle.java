public class Circle extends Geometry {

    double r;
    Circle(double r) {
        this.r = r;
    }
    public  double getArea() {
        return Math.PI * r * r;
    }//重写 getArea()方法
}
