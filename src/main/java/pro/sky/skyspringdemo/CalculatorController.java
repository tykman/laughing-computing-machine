package pro.sky.skyspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService= calculatorService;
    }
    @GetMapping
    public String greetings() {return calculatorService.greetings();}



        @GetMapping(path= "/plus")
        public String plus(@RequestParam int num1,@RequestParam int num2) {
            String result = Integer.toString(calculatorService.plus(num1, num2));
            return getResult(num1,num2, "+", result);
        }

    @GetMapping(path= "/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2) {
        String result = Integer.toString(calculatorService.minus(num1, num2));
        return getResult(num1,num2, "-", result);
    }

    @GetMapping(path= "/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2) {
        String result =Integer.toString(calculatorService.multiply(num1, num2));
        return getResult(num1,num2, "*", result);
    }


    @GetMapping(path= "/divide")
    public String divide(@RequestParam int num1,@RequestParam int num2) {
        if (num2 == 0) {
            return "<b>На ноль делить нельзя!</b>";
        }
        String result =Double.toString(calculatorService. divide(num1, num2));
        return getResult(num1,num2, " / ", result);
    }
       private String getResult(int num1,int num2,String operation,String result) {
        return String.format("<b>%s %s %s = %s</b>",num1, operation, num2, result);
       }


}
