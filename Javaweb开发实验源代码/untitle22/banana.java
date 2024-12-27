package org.example;

/**
 * @ClassName : banana
 * @Description :
 * @Author : ZJ
 * @Date: 2024-11-07 23:26
 */
public class banana implements fruit {
    public int id;
    public country c;
        public String sayName() {
            return "This is banana" +c.conutryName();
        }

    public void setC(country c) {
        this.c = c;
    }
}
