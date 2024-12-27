package com.t;

public class Pig extends Animal{
    int length,height;
    String color;

    Pig (){}
    Pig(int length,int height,String color){
        this.length=length;
        this.height=height;
        this.color=color;
    }

    public String toStirng(){
        System.out.println(color);
        System.out.println(length);
        System.out.println(height);
        return color;
    }

    void eating (String food){
        System.out.println("猪可以吃的食物"+food);
        }

    void walking (){
        System.out.println("猪可以行走");
    }
}
