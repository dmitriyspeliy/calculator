package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestWithParam {
    ServiceCal out = new ServiceCal();

    @ParameterizedTest
    @CsvSource(value = {
            "9,10",
            "2, 3",
    })
    public void checkPlus(String a,String b){
        String expected = String.format("%s + %s = %s", a, b, Integer.parseInt(a) + Integer.parseInt(b));
        String result1 = out.sum(a,b);
        assertEquals(expected,result1);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "9,10",
            "2, 3",
    })
    public void checkMinus(String a,String b){
        String expected = String.format("%s - %s = %s", a, b, Integer.parseInt(a) - Integer.parseInt(b));
        String result1 = out.subtract(a,b);
        assertEquals(expected,result1);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "9,10",
            "2, 3",
    })
    public void checkDivision(String a,String b){
        String expected = String.format("%s / %s = %s", a, b, Integer.parseInt(a) / Integer.parseInt(b));
        String result1 = out.division(a,b);
        assertEquals(expected,result1);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "9,10",
            "2, 3",
    })
    public void checkMultiply(String a,String b){
        String expected = String.format("%s * %s = %s", a, b, Integer.parseInt(a) * Integer.parseInt(b));
        String result1 = out.multiply(a,b);
        assertEquals(expected,result1);
    }



}