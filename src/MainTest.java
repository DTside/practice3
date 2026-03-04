public class MainTest {
    public static void main(String[] args) {
        System.out.println("Запуск тестів...");
        testCalculationAndStorage();
        System.out.println("Всі тести успішно пройдено!");
    }

    public static void testCalculationAndStorage() {
        ResultManager manager = new ResultManager();
        manager.addResult(new CalculationResult(5, 25));
        manager.addResult(new CalculationResult(2, 4));

        if (manager.getResults().size() != 2) {
            throw new AssertionError("Помилка: Розмір колекції має бути 2");
        }
        
        if (manager.getResults().get(0).getResult() != 25) {
            throw new AssertionError("Помилка: Неправильний результат обчислення");
        }
        System.out.println("testCalculationAndStorage - OK");
    }
}