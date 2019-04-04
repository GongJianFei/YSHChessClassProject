package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Jeff on 2018/12/8.
 */
@Aspect
@Component
public class LoginAop {
@Pointcut("execution(* service.LoginService.login(..))")
    private void pointCut(){}

    @Before("pointCut()")
    public void beforeLogin(){
        System.out.println("berfore login....");
    }
}
