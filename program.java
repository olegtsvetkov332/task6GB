import java.util.HashMap;
import java.util.Map;

public class program {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        String[] data = {
            "89216472734 Иванов",
            "89113452674 Цветков",
            "89819232331 Павлов",
            "89990110102 Иванов",
            "89347562617 Цветков",
            "89899743417 Кукушкин",
            "89113234543 Цветков"
        };
        for (String person : data) {
            String[] personParts = person.split(" ");
             if (phoneBook.containsKey(personParts[1])){
                phoneBook.put(personParts[1], phoneBook.get(personParts[1]) + " | " + personParts[0]);
            }
            else {
                phoneBook.put(personParts[1], personParts[0]);
            }
        }

        for (Map.Entry<String, String> element : phoneBook.entrySet()){
            System.out.println(" | " + element.getKey() + " : " + element.getValue() + " | ");
            
        }
        
    }
}
