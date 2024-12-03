import java.util.Scanner;

class Animal{
    int a;
    boolean rt;
    int sum;
    public Animal(){
        a = 12;
        rt = true;
        System.out.println(a);
    }
    int Animal1(int c,int d){
        return c + d;
    }

    float Animal1(float c,float d){
        return c + d;
    }
    int add(int a,int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
}

public class LEI {
    public static void main(String arsg[]){
    Animal animal = new Animal();
    System.out.println(animal.a);
    System.out.println(animal.rt);
    System.out.println(animal.add(3,4));
    System.out.println(animal.Animal1(2.3f,1.2f));
    System.out.println(animal.Animal1(2,4));

}
}

class dog{

    public static void main(String arsg[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个数字？");
        int b = reader.nextInt();
        System.out.println("请输入一个比它大的数字？");
        int a = reader.nextInt();
        if(a==12&&b<a){
            System.out.println(a);
        }
        else 
        {
            System.out.println(b);
        }
    
    char c1 = '你';
    char c2 = '好';
    char c3 = '呀';
    System.out.println(""+c1+c2+c3);
}

}
