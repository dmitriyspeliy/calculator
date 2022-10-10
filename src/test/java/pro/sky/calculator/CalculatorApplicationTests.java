package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorApplicationTests {
	static String a = "5";
	static String b = "4";
	static String c = "3";
	static String d = "2";
	static String nullNum = "0";

	ServiceCal out = new ServiceCal();

	@Test
	public void checkPlus(){
		String expected1 = String.format("%s + %s = %s", a, b, Integer.parseInt(a) + Integer.parseInt(b));
		String expected2 =  String.format("%s + %s = %s", c, d, Integer.parseInt(c) + Integer.parseInt(d));
		String result1 = out.sum(a,b);
		String result2 = out.sum(c,d);
		assertEquals(expected1,result1);
		assertEquals(expected2,result2);
	}

	@Test
	public void checkMinus(){
		String expected1 =  String.format("%s - %s = %s", a, b, Integer.parseInt(a) - Integer.parseInt(b));
		String expected2 = String.format("%s - %s = %s", c, d, Integer.parseInt(c) - Integer.parseInt(d));
		String result1 = out.subtract(a,b);
		String result2 = out.subtract(c,d);
		assertEquals(expected1,result1);
		assertEquals(expected2,result2);
	}

	@Test
	public void checkDivision(){
		String expected1 = String.format("%s / %s = %s", a, b, Integer.parseInt(a) / Integer.parseInt(b));
		String expected2 = String.format("%s / %s = %s", c, d, Integer.parseInt(c) / Integer.parseInt(d));
		String result1 = out.division(a,b);
		String result2 = out.division(c,d);
		assertEquals(expected1,result1);
		assertEquals(expected2,result2);
	}

	@Test
	public void checkMultiply(){
		String expected1 = String.format("%s * %s = %s", a, b, Integer.parseInt(a) * Integer.parseInt(b));
		String expected2 = String.format("%s * %s = %s", c, d, Integer.parseInt(c) * Integer.parseInt(d));
		String result1 = out.multiply(a,b);
		String result2 = out.multiply(c,d);
		assertEquals(expected1,result1);
		assertEquals(expected2,result2);
	}

	@Test
	public void divisionWithZero(){
		Assertions.assertThrows(ArithmeticException.class, () ->
				out.division(a,nullNum));
	}
}
