//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

/**
 * Task1
 */
import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("89057739823", "Андрей Иванов");
        phoneBook.put("89267452034", "Иван Строгов");
        phoneBook.put("89269142356", "Анна Павлова");
        phoneBook.put("89150924058", "Егор Свинин");
        phoneBook.put("89912349820", "Елена Астафьева");
        phoneBook.put("89207772938", "Андрей Иванов");

        for (Map.Entry<String, String> entry: phoneBook.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(value + " " + key);
        }

    }
}