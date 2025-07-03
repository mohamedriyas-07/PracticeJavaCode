package dear;
import java.util.HashMap;

public class Hashmappp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> map=new HashMap<>();
		map.put("apple",0.40);
		map.put("orange", 0.75);
		map.put("banana", 7.9);
		map.put("avacado", 8.34);
		map.put("papaya",9.8);
		//map.remove("apple");
		System.out.println(map.size());
		System.out.println(map.containsValue(7.9));

		
		//System.out.println(map.get("orange"));
		//System.out.println(map.containsKey("apple"));
		if(map.containsKey("orange")) {
			System.out.println(map.get("orange"));
		}
		else {
			System.out.println("key not Found");
		}
		

	}

}
