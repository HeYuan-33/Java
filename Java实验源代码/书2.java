interface com{
    int add(int a,int b);
    public static int  get (int n){
        return n;
    }

    public default int see (int n){
        return n;
    }

    public default int look(int n){
        return n;
    }
}

class A implements com{
    public int add(int a,int b){
        return a+b;
    }
    public int see (int n){
        return n+1;
    }
}

public class 书2 {
    public static void main (String args[]){
        A a = new A();
        int m = a.add(12,6);
        int n = com.get(12);
        int t = a.see(6);
        int q = a.look(6);
        System.out.println(m);
        System.out.println(n);
        System.out.println(t);
        System.out.println(q);
    }
}

interface Com{
    int add(int a,int b);
}

abstract class People {
   abstract int add(int a,int b);
}

class Student extends People implements Com{
    public int add(int a,int b){
        return a+b;
    }
}
class testQ {
    public static void main(String args[]){
        Student s = new Student();
        Com com = s;
        int m = com.add(12,6);
        People p = s;
        int n = p.add(12,6);
        System.out.println(m);
        System.out.println(n);
    }
}
