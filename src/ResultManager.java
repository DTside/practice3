import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ResultManager {
    private List<CalculationResult> results = new ArrayList<>();
    private final String filename = "results.dat";

    public void addResult(CalculationResult result) {
        results.add(result);
    }

    public List<CalculationResult> getResults() {
        return results;
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(results);
            System.out.println("Результати успішно збережено.");
        } catch (IOException e) {
            System.err.println("Помилка збереження: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            results = (List<CalculationResult>) ois.readObject();
            System.out.println("Результати успішно відновлено.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл збереження не знайдено. Створено нову колекцію.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Помилка читання: " + e.getMessage());
        }
    }
}