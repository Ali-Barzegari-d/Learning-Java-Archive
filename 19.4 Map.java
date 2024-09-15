import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();
    	
    	students.put("ali",56);
    	students.put("omid",23);
    	students.put("erfan",67);
    	students.put("akbar",92);
    	students.put("amir",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}