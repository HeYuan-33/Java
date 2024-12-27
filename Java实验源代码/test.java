package com.t;
import com.t.*;
public class test {
    public static void main(String[] args) {
        Pig peiqi = new Pig(12,34,"bai");
        peiqi.toStirng();
        peiqi.eating("白菜");
        peiqi.walking();
    }
}

class test1{
    public static void main(String[] args) {
        Chicken xhj = new Chicken("红色",23);
        xhj.toString();
        xhj.eating("虫子");
        xhj.flying();
    }
}
