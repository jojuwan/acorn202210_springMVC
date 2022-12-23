package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
public class MessengerAspect {
   /*
    *  return type 은 String 이고
    *  get 으로 시작은 메소드 이고
    *  메소드에 전달되는 인자는 없다 
    *  java.lang 페키지에 있는 type 은 페키지명 생략 가능
    */
   @Around("execution(String com.example.demo.util.*.get*())")
   public Object checkReturn(ProceedingJoinPoint joinPoint) throws Throwable {

      // aspect 가 적용된 메소드를 수행하고 리턴되는 데이터 받아오기 
      Object obj=joinPoint.proceed();
      //원래 type 으로 casting 해서 조사해 볼수가 있다.
      String a = (String)obj;

      //조사후 아예 다른 값을 리턴해 줄수도 있다. 
      return "놀자 놀자";
   }
}





