import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ResultManager manager = new ResultManager();
        manager.loadFromFile();

        ViewFactory factory = new TextViewFactory();
        ResultView view = factory.createView();
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nОберіть дію: 1 - Обчислити квадрат числа, 2 - Показати всі результати, 3 - Зберегти, 0 - Вихід");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введіть число: ");
                    try {
                        double input = Double.parseDouble(scanner.nextLine());
                        double calcResult = input * input; // СЮДА ВСТАВИТЬ ЛОГИКУ ИЗ ПРОШЛОЙ РАБОТЫ
                        CalculationResult res = new CalculationResult(input, calcResult);
                        manager.addResult(res);
                        System.out.println("Обчислено:");
                        view.show(res);
                    } catch (NumberFormatException e) {
                        System.out.println("Помилка: введіть коректне число.");
                    }
                    break;
                case "2":
                    view.showAll(manager.getResults());
                    break;
                case "3":
                    manager.saveToFile();
                    break;
                case "0":
                    running = false;
                    manager.saveToFile(); 
                    break;
                default:
                    System.out.println("Невідома команда.");
            }
        }
        scanner.close();
    }
}