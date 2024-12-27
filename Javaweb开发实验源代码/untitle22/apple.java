package org.example;

/**
 * @ClassName : apple
 * @Description :
 * @Author : ZJ
 * @Date: 2024-11-07 23:24
 */
public class apple implements fruit{
    public int id;
    public country c;
  //必须有个这个，不然会报错
    public void setC(country c) {
        this.c = c;
    }

    public String sayName() {
        return "This is apple" +c.conutryName();
    }

    public void setId(int id) {
        this.id = id;
    }
}
