import java.util.List;
public class TextResultView implements ResultView {
    @Override
    public void show(CalculationResult result) {
        System.out.println("Вхід: " + result.getInput() + " | Результат: " + result.getResult());
    }

    @Override
    public void showAll(List<CalculationResult> results) {
        System.out.println("--- Список результатів ---");
        for (CalculationResult res : results) {
            show(res);
        }
        System.out.println("--------------------------");
    }
}