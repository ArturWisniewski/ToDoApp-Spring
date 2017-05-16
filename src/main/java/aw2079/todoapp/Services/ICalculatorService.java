/*
 * MIT License
 */
package aw2079.todoapp.Services;

/**
 *
 * @author Artur Wiśniewski
 */
public interface ICalculatorService {
    
    public long add(int x, int y);

    public long substract(int x, int y);
    
    public long multiply(int x, int y);
    
    public long divide(int x, int y);
    
    public String calculation(String x, String y, String operation);
}
