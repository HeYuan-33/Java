package cuit.t;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class useraspect2 {

    @Pointcut(value = "execution(* cuit.t.femaleuser.*(..))")
    public void pointcut2() {

    }

    @Before(value = "pointcut2()")
    public void before1() {
        System.out.println("before2");
    }

    @After( value = "pointcut2()")
    public void after1() {
        System.out.println("after2");
    }

    @AfterThrowing(value = "pointcut2()")
    public void afterThrowing() {
        System.out.println("afterThrowing2()");
    }

    @Around(value = "pointcut2()")
    public void around1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();
        System.out.println("环绕后");
    }
}
