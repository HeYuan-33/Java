import java.util.Scanner;
import java.util.Arrays;
public class Example {
     public static void main(String args[]){
       int a1 = 10;
        System.out.println("你好:"+a1);

     }
}

class Example1{
   public static void main (String arsg[]){
   Scanner reader = new Scanner(System.in);
   while(reader.hasNextDouble()){
   double x1 = reader.nextDouble();
   System.out.println(x1);
     }
   }
}

class Example2{
    public static void main(String arsg[]){
        float x = 2f;
        double y = 1234;
        x = (float)y;
        System.out.println(x);

        int b = 156;
        byte z = 34;
        z = (byte)b;
        System.out.println(z);
    }
}

class Example3{
    public static void main(String arsg[]){
        int a = 145;
        int b = 67;
        int c,d,e,f;
        c = a&b;
        e = a|b;
        d = a^b;
        f = ~a;
       System.out.println(c);
       System.out.println(e);
       System.out.println(d);
       System.out.println(f); 
    }
}

class Example4{
    public static void main (String asrg[]){
        char a[] = {'A','你','好','啊'};
        System.out.println(""+a);

        int b[] = {1,2,3,4,5};
        int c[] = {3,4,5,6,8};
        System.arraycopy(b,2,c,2,3);
        System.out.println(Arrays.toString(c));
    }
}

enum Season{
    春季,夏季,冬季,秋季;
}

class Example5{
    public static void main(String arsg[]){
      Season x = null;
      Scanner reader = new Scanner(System.in);
      int n = reader.nextInt();

      if(n==1){
        x = Season.春季;
      }

      if(n==2){
       x = Season.夏季;
      }

      else{
        x = Season.冬季;
      }

      System.out.println(x);
    }
}

class Example6{
    public static void main(String arsg[]){
    Scanner reader = new Scanner(System.in);
    
    while(reader.hasNextInt()){
        int x = reader.nextInt();
        System.out.println(x);
    }
    
    }
}

class Examlpe7{
  public static void main(String arsg[]){
    float a = 23.2f;
    float b = 34;
    float c = a + b;
    System.out.println(c);
    Scanner reader = new Scanner(System.in);

    while (reader.hasNextDouble()){
       int x = reader.nextInt();
       System.out.println(x);
    }
  }
}