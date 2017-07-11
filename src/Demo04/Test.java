package Demo04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Test {
	public static void main(String[] args) {
		Map dogMap = new HashMap();
		Dog adog = new Dog();
		adog.setName("aa");
		adog.setStrain("拉布拉多");
		dogMap.put("01", adog);
		Dog bdog = new Dog();
		bdog.setName("bb");
		bdog.setStrain("秋田");
		dogMap.put("02", bdog);
		Set keys = dogMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Dog dog = (Dog) dogMap.get(key);
			System.out.println(dog.getName());
			System.out.println(dog.getStrain());
		}
	}
}
