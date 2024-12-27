package bic.cuit.edu;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @className: Myaspect
 * @description: TODO 类描述
 * @author: JackieZhao
 * @date: 2023/11/13 8:33
 * @Company: Copyright© [日期] by [作者或个人]
 **/
@Component
@Aspect
public class    Myaspect {

    @Pointcut(value = "execution(* bic.cuit.edu.Calc.add(..))")
    public void pointdemo(){

    }
    //前置通知 value的值为要增强的对象
    @Before(value = "pointdemo()")
    public void before(JoinPoint joinPoint){
        System.out.println("before.....");
        Object[] objects = joinPoint.getArgs();
        System.out.println("第1个参数:"+objects[0].toString());
        System.out.println("第2个参数:"+objects[1].toString());
        System.out.println();

    }
    //最终通知 有无异常都执行
    @After(value = "execution(* bic.cuit.edu.Calc.*(..))")
    public void after(JoinPoint joinPoint){
        String methodname = joinPoint.getSignature().getName(); // 获取目标方法名
        Date date = new Date();
        System.out.println(methodname+"在"+date.toString()+"被调用");
    }
    //后置通知(或返回通知)  有异常的时候不执行，执行的是afterThrowing
    @AfterReturning(value = "execution(* bic.cuit.edu.Calc.add(..))")
    public void afterReturning(){
        System.out.println("afterreturning...");
    }
    //异常通知
    @AfterThrowing(value = "execution(* bic.cuit.edu.Calc.div(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
    //环绕通知
    @Around(value = "execution(* bic.cuit.edu.Calc.mult(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
