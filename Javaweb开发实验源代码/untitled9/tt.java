import bic.cuit.edu.Calc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className: tt
 * @description: TODO 类描述
 * @author: JackieZhao
 * @date: 2023/11/13 8:48
 * @Company: Copyright© [日期] by [作者或个人]
 **/
public class tt {
    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Calc c =  (Calc)context.getBean("calc");
        c.add(1,4);
        c.mult(3,6);
        c.div(2,1);
    }
}
