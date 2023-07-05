package pro.sky.skyspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements HelloServiceInterface  {
    public String greetings(){return "<b>Добро пожаловать в калькулятор!</b>";}

    public int plus(int num1, int num2) {
        return num1+num2;
    }
   public int minus(int num1, int num2) {
       return num1 - num2;
   }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) {
        return (double)num1 / num2;
    }
}
