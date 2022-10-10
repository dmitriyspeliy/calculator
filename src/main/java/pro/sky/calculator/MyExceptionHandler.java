package pro.sky.calculator;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public void ArithmeticExceptionExceptionHandler(){
        System.out.println("Деление на ноль");
    }
}
