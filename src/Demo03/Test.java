package Demo03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Dog dog1 = new Dog("aa", "11");
		Dog dog2 = new Dog("bb", "22");
		Dog dog3 = new Dog("cc", "33");
		Dog dog4 = new Dog("dd", "44");
		LinkedList doglist = new LinkedList();
		doglist.add(dog2);
		doglist.add(dog3);
		doglist.addFirst(dog1);
		doglist.addLast(dog4);
		Iterator it = doglist.iterator();
		while (it.hasNext()) {
			Dog dog = (Dog) it.next();
			System.out.print(dog.getName());
			System.out.println(dog.getType());
		}

	}
}