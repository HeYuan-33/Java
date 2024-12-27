package cuit.t;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class useraspect {

    @Pointcut(value = "execution(* cuit.t.maleuser.*(..))")
    public void pointcut1() {

    }

    @Before(value = "pointcut1()")
    public void before1() {
        System.out.println("before1");
    }

    @After( value = "pointcut1()")
    public void after1() {
        System.out.println("after1");
    }

    @AfterThrowing(value = "pointcut1()")
    public void afterThrowing() {
        System.out.println("afterThrowing1()");
    }

    @Around(value = "pointcut1()")
    public void around1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();
        System.out.println("环绕后");
    }
}
