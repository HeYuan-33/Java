import java.util.Scanner;
import java.util.Arrays;

public class Example2{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        float x,y;
        char c1,c2;
        boolean t1;
        t1 = true;
       while(t1) {
            System.out.println("请输入第一个数：");
            x = reader.nextFloat();
            System.out.println("请输入第二个数：");
            y = reader.nextFloat();
            System.out.println("请输入运算符（+，-，*，/）：");
            c1 = reader.next().charAt(0);
            float sum;

            if (c1 == '+') {
                sum = x + y;
            } else if (c1 == '-') {
                sum = x - y;
            } else if (c1 == '*') {
                sum = x * y;
            } else {
                sum = x / y;
            }
            System.out.println(sum);
            System.out.println("请问要退出吗？ y/n");
            c2 = reader.next().charAt(0);
            if(c2 == 'y') {
                t1 = false;
            }
            else {
                t1 = true;
            }
        }
    }
}
