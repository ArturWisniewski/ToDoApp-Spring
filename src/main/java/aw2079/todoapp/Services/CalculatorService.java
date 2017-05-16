/*
 * MIT License
 */
package aw2079.todoapp.Services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Artur Wiśniewski
 */
@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public long add(int x, int y) {
        return x + y;
    }

    @Override
    public long substract(int x, int y) {
        return x - y;
    }

    @Override
    public long multiply(int x, int y) {
        return x * y;
    }

    @Override
    public long divide(int x, int y) {
        return x / y;
    }

    @Override
    public String calculation(String sx, String sy, String operation) {

        try {
            int x = Integer.parseInt(sx);
            int y = Integer.parseInt(sy);
            switch (operation) {
                case "add":
                    return String.valueOf(add(x, y));
                case "substract":
                    return String.valueOf(substract(x, y));
                case "multiply":
                    return String.valueOf(multiply(x, y));
                case "divide":
                    return String.valueOf(divide(x, y));
                default:
                    return "No operation selected";
            }
        } catch (Exception e) {
            return "Wrong data, please go back.";
        }

    }

}
