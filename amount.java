public class amount {
    int a=2;
    int b1;

    amount (){

    }
    public  amount (int a, int b){
        this.a = a;
        this.b1 = b;
    }

    void amount (int a, int b){
        this.a = a;
        this.b1 = b;
    }
}

class amount1{
    void amount1(amount a1){
        a1.a=a1.a-2;
    }
}
class test {
  public static void main (String[] args){
      amount e1 = new amount();
      amount a1 = new amount (5,9);
      amount b1 = new amount (3,5);
      amount1 e2 = new amount1();
      e2.amount1(a1);
      System.out.println(a1.a);
      System.out.println(e1.a);
      System.out.println(b1.a);
  }
}

class CPU{
    int speed;
   int   setSpeed(int m){
       speed=m;
       return speed;
   }
    int getSpeed(){
        return speed;
    }
}

class HardDisk{
    int amount;
    int getAmount(){
        return amount;
    }
    int  setAmount(int m){
        amount=m;
        return amount;
    }
}

class PC{
        HardDisk hd=new HardDisk();
        CPU cpu=new CPU();
        void  setCPU(CPU c){

        }

        void setHardDisk(HardDisk hd){

        }
    }



