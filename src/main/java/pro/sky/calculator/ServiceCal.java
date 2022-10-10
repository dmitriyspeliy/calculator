package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCal implements ToDoCalculator {

    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String sum(String a, String b) {
        checkStringIsEmpty(a,b);
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return String.format("%s + %s = %s", a, b, result);
    }

    @Override
    public String division(String a, String b) {
        checkStringIsEmpty(a,b);
        if (b.equals("0")) throw new ArithmeticException("Деление на ноль");
        int result = Integer.parseInt(a) / Integer.parseInt(b);
        return String.format("%s / %s = %s", a, b, result);
    }

    @Override
    public String subtract(String a, String b) {
        checkStringIsEmpty(a,b);
        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return String.format("%s - %s = %s", a, b, result);
    }

    @Override
    public String multiply(String a, String b) {
        checkStringIsEmpty(a,b);
        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return String.format("%s * %s = %s", a, b, result);
    }

    public void checkStringIsEmpty(String a, String b){
        if (a.equals("") || b.equals("")) {
            throw new NullPointerException("Нет данных");
        }
    }
}
