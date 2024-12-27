public class School implements CompurerAverage {
    //重写 public double average(double x[])方法,返回数组 x[]的元素的算术平均
    public double average(double x[]){
        double sum = 0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        return sum/x.length;
    }
}
