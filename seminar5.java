import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

// public class seminar5 {

//     public static Map<String, List<String>> phoneBook = new HashMap<>();

//     public static void main(String[] args) {
//         addPerson();
//         findPerson("Stas");

//     }

//     public static void addPerson() {
//         phoneBook.put("Stas", List.of("1112223333", "222444555"));
//         phoneBook.put("Katya", List.of("555666777"));

//     }

//     public static void findPerson(String surname) {
//         System.out.printf("%s: %s", surname, phoneBook.get(surname));
//     }
// }

public class seminar5 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов" +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Марина Лугова";
        String[] listOfNamesAndSurnames = employees.split(" ");
        for (int i = 0; i < listOfNamesAndSurnames.length; i += 2) {
            if (nameMap.containsKey(listOfNamesAndSurnames[i])) {
                nameMap.replace(listOfNamesAndSurnames[i], nameMap.get(listOfNamesAndSurnames[i]) + 1);
            }

            else {
                nameMap.put(listOfNamesAndSurnames[i], 1);
            }
        }

        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;

        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();

                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }

        System.out.println(sortedNameMap);

    }
}
