public class Rect extends Geometry {
    double a,b;
    Rect(double a,double b) {
        this.a = a;
        this.b = b;
    }
    public  double getArea(){
        return a*b;
    }//重写 getArea()方法
}