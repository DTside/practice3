import java.util.List;
public interface ResultView {
    void show(CalculationResult result);
    void showAll(List<CalculationResult> results);
}