
import java.util.Map;
import java.util.HashMap;

public class Maps{
    public static void main(String args[]) {

        Map<String,  Integer> Students = new HashMap<>();
        Students.put("Ambar", 25);
        Students.put("Aman", 22);
        Students.put("Aamir", 20);
        Students.put("Amar", 18);
        Students.put("Imran", 16);

        Students.put("Ambar", 21);

        System.out.println(Students);
        System.out.println(Students.get("Amar"));
        
        System.out.println(Students.keySet());

        for(String key : Students.keySet()){
            System.out.println(key + " : " + Students.get(key));
        }
    }
}