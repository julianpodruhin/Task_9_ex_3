import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Vano228"), 49); // Заполняем Map
        map.put(new User("Ilya21"), 24);
        map.put(new User("elizabeth1"), 75);
        map.put(new User("kateF"), 56);
        System.out.println("Введите имя игрока: ");
        String name = scanner.nextLine();

        // Сравниваем имена
        for (var entry : map.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                System.out.printf("Результат игрока: %d очков\n", entry.getValue());
                return;
            }
        }
        System.out.println("Пользователь с таким именем не найден.");
    }
}
