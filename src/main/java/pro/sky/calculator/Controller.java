package pro.sky.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    @Autowired
    ServiceCal serviceCal;

    @GetMapping()
    public String hello() {
        return serviceCal.sayHello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) {
        return serviceCal.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) {
        return serviceCal.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) {
        return serviceCal.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2) {
        return serviceCal.division(num1, num2);
    }

}
