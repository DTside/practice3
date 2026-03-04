import java.io.Serializable;

/**
 * Клас що представляє результат обчислення
 */
public class CalculationResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private double input;
    private double result;

    public CalculationResult(double input, double result) {
        this.input = input;
        this.result = result;
    }

    public double getInput() { return input; }
    public double getResult() { return result; }
}