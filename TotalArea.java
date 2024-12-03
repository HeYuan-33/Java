public class TotalArea {
    Geometry[] tuxing;
    double totalArea=0;
    public void setTuxing(Geometry[] t) {
        tuxing=t;
    }
    public double computerTotalArea() {
       for(int i=0;i< tuxing.length;i++){
           totalArea = tuxing[i].getArea();//用循环语句让 tuxing 的元素调用 getArea 方法，并将返回的值累加到 totalArea
       }
        return totalArea;
    }
}