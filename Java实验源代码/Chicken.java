package com.t;

public class Chicken extends Animal{
    String combcolor;
    int length;

    Chicken (String combcolor, int length){
        this.combcolor = combcolor;
        this.length = length;
    }

    public String  toString (){
        System.out.println("Chicken Sring");
        System.out.println(combcolor);
        System.out.println(length);
        return "Chicken Sring";
    }

    void eating (String food){
        System.out.println("喂"+food+"了");
    }

    void flying(){
        System.out.println("虫子在飞");
    }

}
