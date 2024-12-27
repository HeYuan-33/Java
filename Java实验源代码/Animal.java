package com.t;

public class Animal extends Object {
    protected String name;
    protected int age;
    protected String sex;
    protected double weight;
    protected int legNumber;

       Animal(){}
    void eating(String food){}

     public String  toString (){
           System.out.println(name);
           System.out.println(age);
           System.out.println(sex);
           System.out.println(weight);
           System.out.println(legNumber);
           return "Animal";
    }
}
