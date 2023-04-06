/*Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
*/
import java.util.*;

public class Task2 {
    static Map<String, Integer> NewSet(Map<String, String> map){
        Map<String, Integer> TreeMap = new TreeMap<>();
        for (Map.Entry<String, String> entry: map.entrySet()){
            String thisKey = entry.getValue();
            Integer count = 0;
            for (Map.Entry<String, String> entry1: map.entrySet()){
                String key = entry1.getValue();
                if (thisKey == key){
                    count++;
                    TreeMap.put(key, count);
                }
            }
        }
        return TreeMap;
    }

    public static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map) {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {
            
                // return comparison results of values of
                // two keys
                public int compare(K k1, K k2)
                {
                    int comp = map.get(k2).compareTo(map.get(k1));
                    if (comp == 0)
                        return 1;
                    else
                        return comp;
                }
            
            };
        
        // SortedMap created using the comparator
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(map);
        
        return sorted;
    }
    public static void main(String[] args) {
        Map<String, String> employees = new HashMap<>();
        employees.put("Иванов", "Иван");
        employees.put("Петрова", "Светлана");
        employees.put("Белова", "Кристина");
        employees.put("Мусина", "Анна");
        employees.put("Крутова", "Анна");
        employees.put("Юрин", "Иван");
        employees.put("Лыков", "Петр");
        employees.put("Чернов", "Павел");
        employees.put("Чернышов", "Петр");
        employees.put("Федорова", "Мария");
        employees.put("Светлова", "Марина");
        employees.put("Савина", "Мария");
        employees.put("Рыкова", "Мария");
        employees.put("Лугова", "Марина");
        employees.put("Владимирова", "Анна");
        employees.put("Мечников", "Иван");
        employees.put("Петин", "Петр");
        employees.put("Ежов", "Иван");

        //for (Map.Entry<String, String> entry: employees.entrySet()){
        //    String key = entry.getKey();
        //    String value = entry.getValue();

        //    System.out.println(value + " " + key);
        //}
        Map<String, Integer> newList = NewSet(employees);
        System.out.println(newList);
        System.out.println(valueSort(newList));
    }    
}
