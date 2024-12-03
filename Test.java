 class Cuboid {
    private float length,width,height;

    public Cuboid(){}

    void setter (float length,float width,float height){
        if(length>0&&width>0&&height>0){
            this.length = length;
            this.width = width;
            this.height = height;
        }
        System.out.println("已创建成功所需的长方体类");
    }

    void printCuboid(){
        System.out.println("长方体的长是："+length );
        System.out.println("长方体的宽是："+width );
        System.out.println("长方体的高是"+height );
    }

    void isCube(){
        if(length == width && length == height){
            System.out.println("该长方体类为正方体");
        }

        else{
            System.out.println("该长方体类不是正方体");
        }
    }

    void drawing(){
        System.out.println("绘制成功");
    }

    void setlength(float length){
        this.length = length;
        System.out.println("length已修改为"+length);
    }

    void getArea(){
        float area = length*width*2+length*height*2+width*height*2;
        System.out.println("长方体的表面积为：");
        System.out.println(area);
    }

    void getCubage(){
        float cubage = length*width*height;
        System.out.println("长方体的体积为：");
        System.out.println(cubage);
    }

}
//测试
 public class Test {
     public static void main(String[] args) {
         Cuboid cuboidA = new Cuboid();
         cuboidA.setter(1.5f, 2.6f, 18.6f);
         cuboidA.printCuboid();
         cuboidA.isCube();
         cuboidA.drawing();
     }
 }
//测试
 class test1{
    public static void main(String[] args) {
        Cuboid cuboidB = new Cuboid();
        cuboidB.setter(2.5f, 6.8f, 8.0f);
        cuboidB.setlength(4.6f);
        cuboidB.getArea();
        cuboidB.getCubage();
    }
 }
