package bic.cuit.edu;
import org.springframework.stereotype.Component;

/**
 * @className: Calc
 * @description: TODO 类描述
 * @author: JackieZhao
 * @date: 2023/11/13 8:41
 * @Company: Copyright© [日期] by [作者或个人]
 **/
@Component("calc")
public class Calc {
    public void add(int a,int b){
        //System.out.println("加法");
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        //System.out.println("减法");
        System.out.println(a-b);
    }
    public void mult(int a,int b){
        //System.out.println("乘法");
        System.out.println(a*b);
    }
    public void div(int a,int b){
        //System.out.println("除法");
        System.out.println(a/b);
    }
}
