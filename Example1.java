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

class Over{
    int x;
    int sound(){
       return x = 100;

    }
}

class Dog extends Over{
    int x;
      int sound(){
        return x = 99;
    }
}

public class Example1 {
    public static void main(String arsg[]){
        Animal animal = new Animal();
        Over over = new Over();
        Dog dog = new Dog();
        System.out.println(over.sound());
        System.out.println(dog.sound());

        System.out.println(animal.rt);
        System.out.println(animal.add(3,4));
        System.out.println(animal.Animal1(2.3f,1.2f));
        System.out.println(animal.Animal1(2,4));

    }
}
