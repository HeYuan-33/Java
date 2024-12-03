import java.util.Scanner;
class simple{
    int  Sum1(int a, int b){
          return a+b;
    }
    double Sum1(int a,float b){
        return a+b;
    }
}

public class Example3 {
    public static void main(String[] args) {
       simple simple = new simple();
       Scanner reader = new Scanner(System.in);
       int d = reader.nextInt();
       int e = reader.nextInt();
       int c;
       c = simple.Sum1(d,e);
       System.out.println(c);


    }
}