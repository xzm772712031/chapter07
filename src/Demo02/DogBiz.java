package Demo02;

import java.util.ArrayList;
import java.util.List;

public class DogBiz {
	List dogList = new ArrayList();
	public List add(Dog dog) {
		dogList.add(dog);
		return dogList;	
	}

}
